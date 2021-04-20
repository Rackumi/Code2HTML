grammar CodeToHTML;

r : program;

program : part program | part;
// factorizacion. Arreglado
//program : part programAux;
//programAux : program | ;

part : 'funcion' type restpart | 'procedimiento' restpart;

restpart : IDENTIFICADOR '(' listparam ')' blq | IDENTIFICADOR '(' ')' blq;
// factorizacion. Arreglado
//restpart : IDENTIFICADOR ABRE restpartAux blq;
//restpartAux : listparam CIERRA | CIERRA;

//Recursividad por la izquierda. Arreglado.
listparam : type IDENTIFICADOR listparam_r;
listparam_r : ',' type IDENTIFICADOR listparam_r | ;

type : 'entero'  | 'real' | 'caracter';

blq : 'inicio' sentlist 'fin';

//Recursividad por la izquierda. Arreglado.
sentlist : sent sentlist_r;
sentlist_r : sent sentlist_r | ;

sent : type lid ';'
    | IDENTIFICADOR asig exp ';'
    | 'return' exp ';'
    | IDENTIFICADOR '(' lid ')' ';'
    | IDENTIFICADOR '(' ')' ';'
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq
    | 'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq
    ;
// factorizacion. Arreglado
//sent : type lid PUNTOYCOMA
//    | IDENTIFICADOR sentId
//    | 'return' exp ';'
//    | B ABRE lcond CIERRA E blq S blq
//    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq
//    | 'buclemientras' '(' lcond ')' blq
//    | 'bucle' blq 'hasta' '(' lcond ')'
//    | blq;
//sentId : asig exp PUNTOYCOMA | ABRE sentAbre;
//sentAbre : lid CIERRA PUNTOYCOMA | CIERRA PUNTOYCOMA;

lid : IDENTIFICADOR | IDENTIFICADOR ',' lid;
// factorizacion. Arreglado
//lid : IDENTIFICADOR lidAux;
//lidAux : COMA lid | ;

asig : '=' | '+=' | '-=' | '*=' | '/=';

//Recursividad por la izquierda. Arreglado.
exp : IDENTIFICADOR '(' lid ')' exp_r | '(' exp ')' exp_r | IDENTIFICADOR exp_r | CONSTENTERO exp_r | CONSTREAL exp_r | CONSTLIT exp_r;
exp_r : op exp exp_r | ;

op : '+' | '-' | '*' | '/';

//Recursividad por la izquierda. Arreglado.
lcond : cond lcond_r | 'no' cond lcond_r;
lcond_r : opl lcond lcond_r | ;

cond : exp opr exp | 'cierto' | 'falso';

opl : 'y' | 'o';

opr : '==' | '<>' | '<' | '>' | '>=' | '<=';

IDENTIFICADOR : ('_' | WORD)('_' | WORD | DECIMAL )+;

CONSTENTERO : ((('+'|'-')? DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+));

CONSTREAL : ((('+'|'-')? DECIMAL+ '.' DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+ '.' HEXADECIMAL+));

CONSTLIT : (('"' (WORD | '\'' | '""' | WS)+ '"') | ('\'' (WORD | '"' | '\'\'' | WS)+ '\''));

COMENTARIOL : ('%%' (WORD)+ '\r\n');

COMENTARIOM : ('%-' (WORD | WS)+ '-%');

WS : [ \n\t\r] -> skip;

fragment

DECIMAL : [0-9];

HEXADECIMAL: [0-9A-F];

ALPHA : [A-Za-z];
WORD : ALPHA+;