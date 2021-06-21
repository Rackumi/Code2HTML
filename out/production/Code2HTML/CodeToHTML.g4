grammar CodeToHTML;

@header{
	import SintData.Sintesis;
	import java.io.File;
	import java.util.LinkedList;
}

@parser::members{

    private Sintesis info;

    String inic;
    String end;
    String cabezas;
    String cuerpo;
    String principal = "";
    int contPrincipal = 0;

    public CodeToHTMLParser(TokenStream input, Sintesis theinfo){
        this(input);
        info = theinfo;
    }

}

r : {inic = info.inic();}
    program <EOF>
    {end = info.end();
    cabezas = "";
    for(String c: $program.cab){
        cabezas = cabezas + info.cabecera(c);
    }
    cabezas = "<UL>\n" + cabezas + "</UL>\n";
    if(contPrincipal>1){
        System.err.println("Error. Más de un métodos Principal definidos");
    }
    else{
        System.out.println(inic+cabezas+principal+$program.program_S+end);
    }
    };

//Factorizacion. Arreglado
program returns[String program_S, LinkedList<String> cab]: part program_f { $program_S = $part.part_S + $program_f.program_f_S;
                                                                            $cab = new LinkedList<>();
                                                                            $cab.add($part.partCab_S);
                                                                            $cab.addAll($program_f.cab2);
                                                                            };
program_f returns[String program_f_S, LinkedList<String> cab2]: program {   $program_f_S = $program.program_S;
                                                                            $cab2 = new LinkedList<>();
                                                                            $cab2.addAll($program.cab);
                                                                            }
                                                                            | {$program_f_S = ""; $cab2 = new LinkedList<>();
                                                                            };

part returns [String part_S, String partCab_S]: 'funcion' type restpart {String p = "";
                                                                         if(info.esPrincipal($restpart.restpart_S)){
                                                                             principal = info.parrafo(info.palres("funcion")
                                                                                 + info.palres($type.type_S)
                                                                                 + $restpart.restpart_S
                                                                                 , $restpart.restpartName_S);
                                                                             contPrincipal++;
                                                                         }
                                                                         else{
                                                                             p = info.parrafo(info.palres("funcion")
                                                                                  + info.palres($type.type_S)
                                                                                  + $restpart.restpart_S
                                                                                  , $restpart.restpartName_S);
                                                                         }
                                                                         $partCab_S = $type.text+" "+$restpart.restpartCab_S;
                                                                              $part_S = p;
                                                                         }
                                              | 'procedimiento' restpart {String p = "";
                                                                          if(info.esPrincipal($restpart.restpart_S)){
                                                                              principal = info.parrafo(info.palres("procedimiento")
                                                                                  + $restpart.restpart_S
                                                                                  , $restpart.restpartName_S);
                                                                              contPrincipal++;
                                                                          }
                                                                          else{
                                                                              p = info.parrafo(info.palres("procedimiento")
                                                                                  + $restpart.restpart_S
                                                                                  , $restpart.restpartName_S);
                                                                          }
                                                                          $partCab_S = $restpart.restpartCab_S;
                                                                          $part_S = p;
                                                                          };

//Factorizacion. Arreglado
restpart returns [String restpart_S,
                  String restpartCab_S,
                  String restpartName_S]: IDENTIFICADOR '(' restpart_f {$restpartName_S = $IDENTIFICADOR.text;
                                                                        $restpartCab_S = $IDENTIFICADOR.text+" "
                                                                                         + $restpart_f.restpart_fCab_S;}
                                                                        ')' blq {$restpart_S = info.ident($IDENTIFICADOR.text)
                                                                                               + "("
                                                                                               + $restpart_f.restpart_f_S
                                                                                               + ")"
                                                                                               + info.saltoBR()
                                                                                               + $blq.blq_S;};

restpart_f returns [String restpart_f_S, String restpart_fCab_S]: listparam {$restpart_fCab_S = $listparam.listparamCab_S;
                                                                             $restpart_f_S = $listparam.listparam_S;}

                                                                            | {$restpart_fCab_S = "";
                                                                               $restpart_f_S = "";
                                                                              };

//Recursividad por la izquierda. Arreglado.
listparam returns [String listparam_S,
                   String listparamCab_S]: type IDENTIFICADOR listparam_r { $listparamCab_S= $type.type_S
                                                                                             +" "+ $IDENTIFICADOR.text +" "
                                                                                             + $listparam_r.listparam_rCab_S;
                                                                            $listparam_S = info.palres($type.type_S)
                                                                                           + info.ident($IDENTIFICADOR.text)
                                                                                           + $listparam_r.listparam_r_S;
                                                                            };

listparam_r returns [String listparam_r_S,
                    String listparam_rCab_S]: ',' type IDENTIFICADOR  listparam_r {$listparam_rCab_S = ", " + $type.type_S
                                                                                                        +" "+ $IDENTIFICADOR.text +" "
                                                                                                        + $listparam_r.listparam_rCab_S;
                                                                                   $listparam_r_S = ", " + info.palres($type.type_S)
                                                                                                    + info.ident($IDENTIFICADOR.text)
                                                                                                    + $listparam_r.listparam_r_S;}
                                                                                   | {$listparam_rCab_S = "";
                                                                                      $listparam_r_S = "";};

type returns [String type_S]: 'entero'{$type_S = "entero";}
                            | 'real' {$type_S = "real";}
                            | 'caracter'{$type_S = "caracter";};

blq returns [String blq_S] : 'inicio' sentlist 'fin' {$blq_S = info.aperturaYCierre($sentlist.sentlist_S);};

//Recursividad por la izquierda. Arreglado.
sentlist returns [String sentlist_S]: sent sentlist_r {String aux = "";
                                                       if(!($sent.sent_S.contains("fin"))){
                                                            aux=info.saltoBR();
                                                       }
                                                       else{
                                                            aux = "";
                                                       }
                                                       $sentlist_S = $sent.sent_S + aux + $sentlist_r.sentlist_r_S;};

sentlist_r returns [String sentlist_r_S]: sent sentlist_r { String aux = "";
                                                           if(!($sent.sent_S.contains("fin"))){
                                                                aux=info.saltoBR();
                                                           }
                                                           else{
                                                                aux = "";
                                                           }
                                                            $sentlist_r_S = $sent.sent_S + aux
                                                                            + $sentlist_r.sentlist_r_S;}
                                                          | {$sentlist_r_S = "" ;};

//Factorizacion. Arreglado
sent returns[String sent_S]: type lid ';' {$sent_S = info.referencia($lid.lidId_S) + info.palres($type.type_S) + $lid.lid_S + ";" ;}
    | IDENTIFICADOR sent_f1 {$sent_S = info.ident($IDENTIFICADOR.text) + $sent_f1.sent_f1_S;}
    | 'return' exp ';' {$sent_S = info.palres("return ") + $exp.exp_S + ";";}
    | 'bifurcacion' '(' lcond ')' 'entonces' blq1=blq 'sino' blq2=blq {$sent_S = info.palres("bifurcacion")
                                                                         + "(" + $lcond.lcond_S + ")"
                                                                         + info.saltoBR()
                                                                         + info.palres("entonces")
                                                                         + info.saltoBR()
                                                                         + $blq1.blq_S
                                                                         + info.palres("sino")
                                                                         + info.saltoBR()
                                                                         + $blq2.blq_S;}

    | 'buclepara' '(' id1=IDENTIFICADOR asig1=asig exp1=exp ';' lcond ';'
                      id2=IDENTIFICADOR asig2=asig exp2=exp ')' blq {$sent_S = info.palres("buclepara")
                                                                + "(" + info.ident($id1.text)
                                                                + info.asigopEspacio($asig1.text)
                                                                + $exp1.exp_S + "; " + $lcond.lcond_S
                                                                + "; " + info.ident($id2.text)
                                                                + info.asigopEspacio($asig2.text)
                                                                + $exp2.exp_S + ")"
                                                                + info.saltoBR()
                                                                + $blq.blq_S;}

    | 'buclemientras' '(' lcond ')' blq {$sent_S = info.palres("buclemientras")
                                                   + "(" + $lcond.lcond_S + ")"
                                                   + info.saltoBR()
                                                   + $blq.blq_S;}

    | 'bucle' blq 'hasta' '(' lcond ')' {$sent_S = info.palres("bucle")
                                                   + info.saltoBR()
                                                   + $blq.blq_S
                                                   + info.palres("hasta")
                                                   + "(" + $lcond.lcond_S
                                                   + ")"
                                                   + info.saltoBR();}
    | blq {$sent_S = $blq.blq_S;};

sent_f1 returns[String sent_f1_S]: asig exp ';' {$sent_f1_S = info.asigopEspacio($asig.text) + $exp.exp_S + ";";}
                                 | '(' sent_f2 {$sent_f1_S = "(" + $sent_f2.sent_f2_S;};

sent_f2 returns[String sent_f2_S]: lid ')' ';' {$sent_f2_S = $lid.lid_S + ")" + ";";}
                                 | ')' ';' {$sent_f2_S = ")" + ";";};

//Factorizacion. Arreglado
lid returns[String lid_S, String lidId_S]: IDENTIFICADOR lid_f {String aux = info.ident($IDENTIFICADOR.text);
                                                aux = aux.substring(0, aux.length()-1);
                                                $lid_S = aux + $lid_f.lid_f_S;
                                                $lidId_S = $IDENTIFICADOR.text;
                                                };

lid_f returns[String lid_f_S]: ',' lid {$lid_f_S = ", " + $lid.lid_S;}
                                        | {$lid_f_S = "";};

asig : '=' | '+=' | '-=' | '*=' | '/=';

//Recursividad por la izquierda. Arreglado.
//Factorizacion. Arreglado
exp returns[String exp_S]: IDENTIFICADOR exp_f {$exp_S = info.ident($IDENTIFICADOR.text) + $exp_f.exp_f_S;}
    | '(' exp ')' exp_r {$exp_S = "(" + $exp.exp_S + ")" + $exp_r.exp_r_S;}
    | CONSTENTERO exp_r {$exp_S = info.cte($CONSTENTERO.text) + $exp_r.exp_r_S;}
    | CONSTREAL exp_r {$exp_S = info.cte($CONSTREAL.text) + $exp_r.exp_r_S;}
    | CONSTLIT exp_r {$exp_S = info.cte(info.comillas($CONSTLIT.text)) + $exp_r.exp_r_S;};

exp_f returns[String exp_f_S]: '(' lid ')' exp_r {$exp_f_S = "(" + $lid.lid_S + ")" + $exp_r.exp_r_S;}
                             | exp_r {$exp_f_S = $exp_r.exp_r_S;};

exp_r returns[String exp_r_S]: op exp exp_r {$exp_r_S = info.asigopEspacio($op.text) + $exp.exp_S + $exp_r.exp_r_S;}
                                            | {$exp_r_S = "";};

op : '+' | '-' | '*' | '/';

//Recursividad por la izquierda. Arreglado.
lcond returns[String lcond_S]: cond lcond_r {$lcond_S = $cond.cond_S + $lcond_r.lcond_r_S;}
                             | 'no' cond lcond_r {$lcond_S = "no" + $cond.cond_S + $lcond_r.lcond_r_S;};

lcond_r returns[String lcond_r_S]: opl lcond lcond_r {$lcond_r_S = info.asigopEspacio($opl.text)
                                                                   + $lcond.lcond_S
                                                                   + $lcond_r.lcond_r_S;}
                                                     | {$lcond_r_S = "";};

cond returns [String cond_S] : exp1=exp opr exp2=exp {$cond_S = $exp1.exp_S + info.asigopEspacio($opr.text) + $exp2.exp_S;}
                             | 'cierto' {$cond_S = "cierto";}
                             | 'falso' {$cond_S = "falso";};

opl : 'y' | 'o';

opr : '=='| '<>' | '<' | '>' | '>=' | '<=';

IDENTIFICADOR : ('_' | WORD)('_' | WORD | DECIMAL)*;

CONSTENTERO : ((('+'|'-')? DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+));

CONSTREAL : ((('+'|'-')? DECIMAL+ '.' DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+ '.' HEXADECIMAL+));

CONSTLIT : (('"' (WORD | '\'' | '""' | SYMBOL | WS)+ '"') | ('\'' (WORD | '"' | '\'\'' | SYMBOL | WS)+ '\''));

COMENTARIOL : '%%'.*?[\r\n]-> skip;

COMENTARIOM : '%-'.*?[\r\n]* '-%'-> skip;

WS : [ \n\t\r] -> skip;


fragment

DECIMAL : [0-9];

HEXADECIMAL : [0-9A-F];

SYMBOL : [ !#-&(-~];

ALPHA : [A-Za-z];
WORD : ALPHA+;