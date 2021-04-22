grammar CodeToHTML;

r : program;

//Factorizacion. Arreglado
program : part program_f;
program_f : program | ;

part : 'funcion' type restpart | 'procedimiento' restpart;

//Factorizacion. Arreglado
restpart : IDENTIFICADOR '(' restpart_f ')' blq;
restpart_f : listparam | ;

//Recursividad por la izquierda. Arreglado.
listparam : type IDENTIFICADOR listparam_r;
listparam_r : ',' type IDENTIFICADOR listparam_r | ;

type : 'entero' | 'real' | 'caracter';

blq : 'inicio' sentlist 'fin';

//Recursividad por la izquierda. Arreglado.
sentlist : sent sentlist_r;
sentlist_r : sent sentlist_r | ;

//Factorizacion. Arreglado
sent : type lid ';'
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
lid : IDENTIFICADOR lid_f;
lid_f : ',' lid | ;

asig : '=' | '+=' | '-=' | '*=' | '/=';

//Recursividad por la izquierda. Arreglado.
//Factorizacion. Arreglado
exp : IDENTIFICADOR exp_f | '(' exp ')' exp_r | CONSTENTERO exp_r | CONSTREAL exp_r | CONSTLIT exp_r;
exp_f : '(' lid ')' exp_r | exp_r;
exp_r : op exp exp_r | ;

op : '+' | '-' | '*' | '/';

//Recursividad por la izquierda. Arreglado.
lcond : cond lcond_r | 'no' cond lcond_r;
lcond_r : opl lcond lcond_r | ;

cond : exp opr exp | 'cierto' | 'falso';

opl : 'y' | 'o';

opr : '==' | '<>' | '<' | '>' | '>=' | '<=';

IDENTIFICADOR : ('_' | WORD)('_' | WORD | DECIMAL )*;

CONSTENTERO : ((('+'|'-')? DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+));

CONSTREAL : ((('+'|'-')? DECIMAL+ '.' DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+ '.' HEXADECIMAL+));

CONSTLIT : (('"' (WORD | '\'' | '""' | WS)+ '"') | ('\'' (WORD | '"' | '\'\'' | WS)+ '\''));

COMENTARIOL : '%%'.*?[\r\n]-> skip;

COMENTARIOM : '%-' .*?[\r\n]* '-%'-> skip;

WS : [ \n\t\r] -> skip;

fragment

DECIMAL : [0-9];

HEXADECIMAL: [0-9A-F];

ALPHA : [A-Za-z];
WORD : ALPHA+;