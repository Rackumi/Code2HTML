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

listparam : listparam ',' type IDENTIFICADOR | type IDENTIFICADOR;
// recursividad por la izquierda. Arreglado
//listparam : type IDENTIFICADOR listparamAux;
//listparamAux : COMA type IDENTIFICADOR listparamAux | ;

type : 'entero'  | 'real' | 'caracter' ;

blq : 'inicio' sentlist 'fin';

sentlist : sentlist sent | sent;
// recursicidad por la izquierda. Arreglado
//1 o varios sent que son asignaciones operaciones etc
//sentlist : sent sentlistAux;
//sentlistAux : sent sentlistAux | ;

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

lid : IDENTIFICADOR | (IDENTIFICADOR ',') lid;
// factorizacion. Arreglado
//lid : IDENTIFICADOR lidAux;
//lidAux : COMA lid | ;

asig : '=' | '+=' | '-=' | '*=' | '/=';

exp : exp op exp | IDENTIFICADOR '(' lid ')' | '(' exp ')' | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT;
//recursicidad por la izquierda. Sin arreglar
//exp : (IDENTIFICADOR ABRE lid CIERRA | ABRE exp CIERRA | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT) expAux;
//expAux : op exp expAux | ;

op : '+' | '-' | '*' | '/';

lcond : lcond opl lcond | cond | 'no' cond;
// recursicidad por la izquierda. Arreglar
//lcond :  (cond | 'no' cond) lcondAux;
//lcondAux : opl lcond lcondAux | ;

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