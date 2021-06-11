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

blq returns [String blq_S] : 'inicio' sentlist 'fin' {$blq_S = "a";};

//Recursividad por la izquierda. Arreglado.
sentlist : sent sentlist_r;
sentlist_r : sent sentlist_r | ;

//Factorizacion. Arreglado
sent: type lid ';'
    | IDENTIFICADOR sent_f1
    | 'return' exp ';'
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq
    | 'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq;
sent_f1 : asig exp ';' | '(' sent_f2;
sent_f2 : lid ')' ';' | '(' ')' ';';

//Factorizacion. Arreglado
lid returns[String lid_S]: IDENTIFICADOR lid_f {$lid_S = $IDENTIFICADOR.text + $lid_f.lid_f_S;};
lid_f returns[String lid_f_S]: ',' lid {$lid_f_S = "," + $lid.lid_S;} | ;

asig : '=' | '+=' | '-=' | '*=' | '/=';

//Recursividad por la izquierda. Arreglado.
//Factorizacion. Arreglado
exp returns[String exp_S]: IDENTIFICADOR exp_f {$exp_S = $IDENTIFICADOR.text + $exp_f.exp_f_S;} | '(' exp ')' exp_r | CONSTENTERO exp_r | CONSTREAL exp_r | CONSTLIT exp_r;
exp_f returns[String exp_f_S]: '(' lid ')' exp_r {$exp_f_S = "(" + $lid.lid_S + ")" + $exp_r.exp_r_S;}| exp_r{$exp_f_S = $exp_r.exp_r_S;};
exp_r returns[String exp_r_S]: op exp exp_r {$exp_r_S = $op.text + $exp.exp_S + $exp_r.exp_r_S;} | ;

op : '+' | '-' | '*' | '/';

//Recursividad por la izquierda. Arreglado.
lcond : cond lcond_r | 'no' cond lcond_r;
lcond_r : opl lcond lcond_r | ;

cond returns [String cond_S] : exp opr  exp {$cond_S = $exp.exp_S + $opr.text + $exp.exp_S; System.out.println($cond_S);}| 'cierto' {$cond_S = "cierto";} | 'falso' {$cond_S = "falso";};

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