grammar CodeToHTML;

r : program;

IDENTIFICADOR : ('_' | WORD)('_' | WORD | DECIMAL)+ {System.out.println(getText());};

CONSTENTERO : ((('+'|'-')? DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+)) {System.out.println(getText());};

CONSTREAL : ((('+'|'-')? DECIMAL+ '.' DECIMAL+) | ('$' ('+'|'-')? HEXADECIMAL+ '.' HEXADECIMAL+)) {System.out.println(getText());};

CONSTLIT : (('"' (WORD | '\'' | '""' | WS)+ '"') | ('\'' (WORD | '"' | '\'\'' | WS)+ '\'')) {System.out.println(getText());};

COMENTARIOL : ('%%' (WORD)+ '\r\n') {System.out.println(getText());};

COMENTARIOM : ('%-' (WORD | WS)+ '-%') {System.out.println(getText());};

WS : [ \n\t\r] -> skip;

program : part program | part;

part : 'funcion' type restpart | 'procedimiento' restpart;

restpart : IDENTIFICADOR '(' listparam ')' blq | IDENTIFICADOR '(' ')' blq;

listparam : listparam ',' type IDENTIFICADOR | type IDENTIFICADOR;
// recursividad por la izquierda. Arreglado
//listparam : type IDENTIFICADOR listparamAux;
//listparamAux : listparam ',' type IDENTIFICADOR listparamAux | ;

type : 'entero' | 'real' | 'caracter';

blq : 'inicio' sentlist 'fin';

sentlist : sentlist sent | sent;
// recursicidad por la izquierda. Arreglado
//1 o varios sent que son asignaciones operaciones etc
//sentlist : sent sentlistAux;
//sentlistAux : sentlist sent sentlistAux | ;

sent : type lid ';'
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq
    | 'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | 'return' exp ';'
    | IDENTIFICADOR asig exp ';'
    | IDENTIFICADOR '(' lid ')' ';'
    | IDENTIFICADOR '(' ')' ';'
    | blq
    ;

lid : IDENTIFICADOR | IDENTIFICADOR ',' lid; //variables 1 o mas

asig : '=' | '+=' | '-=' | '*=' | '/=';

exp : exp op exp | IDENTIFICADOR '(' lid ')' | '(' exp ')' | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT;
//recursicidad por la izquierda. Arreglar
//exp : (IDENTIFICADOR '(' lid ')' | '(' exp ')' | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT) expAux;
//expAux :  exp op exp expAux | ;

op : '+' | '-' | '*' | '/';

lcond : lcond opl lcond | cond | 'no' cond;
// recursicidad por la izquierda. Arreglar
//lcond :  (cond | 'no' cond) lcondAux;
//lcondAux : lcond opl lcond lcondAux | ;

cond : exp opr exp | 'cierto' | 'falso';

opl : 'y' | 'o';

opr : '==' | '<>' | '<' | '>' | '>=' | '<=';

fragment

DECIMAL : [0-9];

HEXADECIMAL: [0-9A-F];

ALPHA : [A-Za-z];
WORD : ALPHA+;