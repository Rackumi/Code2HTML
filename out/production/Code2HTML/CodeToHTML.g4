grammar CodeToHTML;

r : program;

//program : part program | part;
// factorizacion. Arreglado
program : part programAux;
programAux : program | ;

part : F type restpart | P restpart;

//restpart : IDENTIFICADOR ABRE listparam CIERRA blq | IDENTIFICADOR ABRE CIERRA blq;
// factorizacion. Arreglado
restpart : IDENTIFICADOR ABRE restpartAux;
restpartAux : listparam CIERRA blq | CIERRA blq;

//listparam : listparam COMA type IDENTIFICADOR | type IDENTIFICADOR;
// recursividad por la izquierda. Arreglado
listparam : type IDENTIFICADOR listparamAux;
listparamAux : COMA type IDENTIFICADOR listparamAux | ;

type : ENTERO  | REAL | CAR ;

blq : INICIO sentlist FIN;

//sentlist : sentlist sent | sent;
// recursicidad por la izquierda. Arreglado
//1 o varios sent que son asignaciones operaciones etc
sentlist : sent sentlistAux;
sentlistAux : sent sentlistAux | ;

//sent : type lid PUNTOYCOMA
//    | IDENTIFICADOR asig exp PUNTOYCOMA
//    | 'return' exp ';'
//    | IDENTIFICADOR ABRE lid CIERRA PUNTOYCOMA
//    | IDENTIFICADOR ABRE CIERRA PUNTOYCOMA
//    | B ABRE lcond CIERRA E blq S blq
//    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq
//    | 'buclemientras' '(' lcond ')' blq
//    | 'bucle' blq 'hasta' '(' lcond ')'
//    | blq
//    ;
// factorizacion. Arreglado
sent : type lid PUNTOYCOMA
    | IDENTIFICADOR sentId
    | 'return' exp ';'
    | B ABRE lcond CIERRA E blq S blq
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq
    | 'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq;
sentId : asig exp PUNTOYCOMA | ABRE sentAbre;
sentAbre : lid CIERRA PUNTOYCOMA | CIERRA PUNTOYCOMA;

//lid : IDENTIFICADOR | (IDENTIFICADOR COMA) lid;
// factorizacion. Arreglar
lid : IDENTIFICADOR lidAux;
lidAux : | COMA lid;

asig : IGUAL | '+=' | '-=' | '*=' | '/=';

//exp : exp op exp | IDENTIFICADOR '(' lid ')' | '(' exp ')' | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT;
//recursicidad por la izquierda. Arreglar
exp : (IDENTIFICADOR ABRE lid CIERRA | ABRE exp CIERRA | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT) expAux;
expAux : op exp expAux | ;

op : '+' | '-' | '*' | '/';

//lcond : lcond opl lcond | cond | 'no' cond;
// recursicidad por la izquierda. Arreglar
lcond :  (cond | 'no' cond) lcondAux;
lcondAux : opl lcond lcondAux | ;

cond : exp opr exp | 'cierto' | 'falso';

opl : 'y' | 'o';

opr : '==' | '<>' | '<' | '>' | '>=' | '<=';

B : 'bifurcacion';
E : 'entonces';
S : 'sino'{System.out.println("fUNCIONA");};

ABRE : '(';
CIERRA : ')';

F : 'funcion'{System.out.println("fUNCIONA");};
P : 'procedimiento';

INICIO : 'inicio'{System.out.println("fUNCIONA");};
FIN : 'fin';

ENTERO : 'entero';
REAL : 'real';
CAR : 'caracter';

PUNTOYCOMA : ';';
COMA : ',';
IGUAL : '=';

IDENTIFICADOR : ('_' | WORD)('_' | WORD | DECIMAL )+ {System.out.println(getText());};

CONSTENTERO : ((('+'|'-')? DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+)) {System.out.println(getText());};

CONSTREAL : ((('+'|'-')? DECIMAL+ '.' DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+ '.' HEXADECIMAL+)) {System.out.println(getText());};

CONSTLIT : (('"' (WORD | '\'' | '""' | WS)+ '"') | ('\'' (WORD | '"' | '\'\'' | WS)+ '\'') ) {System.out.println(getText());};

COMENTARIOL : ('%%' (WORD)+ '\r\n') {System.out.println(getText());};

COMENTARIOM : ('%-' (WORD | WS)+ '-%') {System.out.println(getText());};

WS : [ \n\t\r] -> skip;

fragment

DECIMAL : [0-9];

HEXADECIMAL: [0-9A-F];

ALPHA : [A-Za-z];
WORD : ALPHA+;