grammar CodeToHTML;

@header{
	import SintData.Sintesis;
	import java.io.File;
	import java.util.LinkedList;
}

@lexer::members {
}

@parser::members{

    private Sintesis info;

    String inic;
    String end;

    public CodeToHTMLParser(TokenStream input, Sintesis theinfo){
        this(input);
        info = theinfo;
    }

}

r : {inic = info.inic(MainClass.nf);}
    program <EOF>
    {end = info.end();
    System.out.println(inic+end);
    };

//Factorizacion. Arreglado
program : part program_f;
program_f : program | ;

part returns [String part_S]: 'funcion' type restpart {$part_S = "funcion" + $type.type_S + $restpart.restpart_S;} | 'procedimiento' restpart {$part_S = "procedure" + $restpart.restpart_S;};

//Factorizacion. Arreglado
restpart returns [String restpart_S]: IDENTIFICADOR '(' restpart_f ')' blq {$restpart_S = $IDENTIFICADOR.text + "(" + $restpart_f.restpart_f_S + ")" + $blq.blq_S;};
restpart_f returns [String restpart_f_S]: listparam {$restpart_f_S = $listparam.listparam_S;} | ;

//Recursividad por la izquierda. Arreglado.
listparam returns [String listparam_S]: type IDENTIFICADOR listparam_r {$listparam_S = $type.type_S + $IDENTIFICADOR.text + $listparam_r.listparam_r_S;};
listparam_r returns [String listparam_r_S]: ',' type IDENTIFICADOR  listparam_r {$listparam_r_S = "," + $type.type_S + $IDENTIFICADOR.text + $listparam_r.listparam_r_S;} | ;

type returns [String type_S]: 'entero'{$type_S = "entero";} | 'real' {$type_S = "real";} | 'caracter'{$type_S = "caracter";};

blq returns [String blq_S] : 'inicio' sentlist 'fin' {$blq_S = "inicio" + $sentlinst.sentlist_S + "fin";};

//Recursividad por la izquierda. Arreglado.
sentlist returns [String sentlist_S]: sent sentlist_r {$sentlist_S = $sent.sent_S + $sentlist_r.sentlist_r_S;};
sentlist_r returns [String sentlist_r_S]: sent sentlist_r {$sentlist_r_S = $sent.sent_S + $sentlist_r.sentlist_r_S;} | ;

//Factorizacion. Arreglado
sent returns[String sent_S]: type lid ';' {$sent_S = $type.type_S + $lid.lid_S + ";" ;}
    | IDENTIFICADOR sent_f1 {$sent_S = $IDENTIFICADOR.text + $sent_f1.sent_f1_S;}
    | 'return' exp ';' {$sent_S = "return" + $exp.exp_S + ";";}
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq {$sent_S = "bifurcacion" + "(" + $lcond.lcond_S + ")" + "entonces" + $blq.blq_S + "sino" + $blq_blq_S}
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq {$sent_S = "buclepara" + "(" + $IDENTIFICADOR.text + $asig.text + $exp.exp_S + ";" + $lcond.lcond_S + ";" + $IDENTIFICADOR.text + $asig.text + $exp.exp_S + ")" + $blq.blq_S;}
    | 'buclemientras' '(' lcond ')' blq {$sent_S = "buclemientras" + "(" + lcond.lcond_S + ")" + blq.blq_S;}
    | 'bucle' blq 'hasta' '(' lcond ')' {$sent_S = "bucle" + $blq.blq_S + "hasta" + "(" + lcond.lcond_S + ")";}
    | blq {$sent_S = $blq.blq_S;};
sent_f1 returns[String sent_f1_S]: asig exp ';' {$sent_f1_S = $asig.asig_S + $exp.exp_S + ";";} | '(' sent_f2 {$sent_f1_S = "(" + sent_f2.sent_f2_S;};
sent_f2 returns[String sent_f2_S]: lid ')' ';' {$sent_f2_S = $lid.lid_S + ")" + ";";} | '(' ')' ';'{$sent_f2_S = "(" + ")" + ";";};

//Factorizacion. Arreglado
lid returns[String lid_S]: IDENTIFICADOR lid_f {$lid_S = $IDENTIFICADOR.text + $lid_f.lid_f_S;};
lid_f returns[String lid_f_S]: ',' lid {$lid_f_S = "," + $lid.lid_S;} | ;

asig : '=' | '+=' | '-=' | '*=' | '/=';

//Recursividad por la izquierda. Arreglado.
//Factorizacion. Arreglado
exp returns[String exp_S]: IDENTIFICADOR exp_f {$exp_S = $IDENTIFICADOR.text + $exp_f.exp_f_S;}
    | '(' exp ')' exp_r {$exp_S = "(" + $exp.exp_S + ")" + $exp_r.exp_r_S;}
    | CONSTENTERO exp_r {$exp_S = $CONSTENTERO.text + $exp_r.exp_r_S;}
    | CONSTREAL exp_r {$exp_S = $CONSTREAL.text + $exp_r.exp_r_S;}
    | CONSTLIT exp_r {$exp_S = $CONSTREAL.text + $exp_r.exp_r_S;} ;
exp_f returns[String exp_f_S]: '(' lid ')' exp_r {$exp_f_S = "(" + $lid.lid_S + ")" + $exp_r.exp_r_S;}| exp_r {$exp_f_S = $exp_r.exp_r_S;};
exp_r returns[String exp_r_S]: op exp exp_r {$exp_r_S = $op.text + $exp.exp_S + $exp_r.exp_r_S;} | ;

op : '+' | '-' | '*' | '/';

//Recursividad por la izquierda. Arreglado.
lcond returns[String lcond_S]: cond lcond_r {$lcond_S = $cond.cond_S + $lcond_r.lcond_r_S;} | 'no' cond lcond_r {$lcond_S = "no" + $cond.cond_S + $lcond_r.lcond_r_S;};
lcond_r returns[String lcond_r_S]: opl lcond lcond_r {$lcond_r_S = $opl.text + $lcond.lcond+ $lcond_r.lcond_r_S;} | ;

cond returns [String cond_S] : exp opr exp {$cond_S = $exp.exp_S + $opr.text + $exp.exp_S; System.out.println($cond_S);}| 'cierto' {$cond_S = "cierto";} | 'falso' {$cond_S = "falso";};

opl : 'y' | 'o';

opr : '=='| '<>' | '<' | '>' | '>=' | '<=';

IDENTIFICADOR : ('_' | WORD)('_' | WORD | DECIMAL )*;

CONSTENTERO : ((('+'|'-')? DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+));

CONSTREAL : ((('+'|'-')? DECIMAL+ '.' DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+ '.' HEXADECIMAL+));

CONSTLIT : (('"' (WORD | '\'' | '""' | SYMBOL | WS)+ '"') | ('\'' (WORD | '"' | '\'\'' | WS)+ '\''));

COMENTARIOL : '%%'.*?[\r\n]-> skip;

COMENTARIOM : '%-' .*?[\r\n]* '-%'-> skip;

WS : [ \n\t\r] -> skip;


fragment

DECIMAL : [0-9];

HEXADECIMAL: [0-9A-F];

SYMBOL : [ !#-&(-~];

ALPHA : [A-Za-z];
WORD : ALPHA+;