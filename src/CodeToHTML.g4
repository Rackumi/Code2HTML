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
type : 'entero' | 'real' | 'caracter';
blq : 'inicio' sentlist 'fin';

sentlist : sentlist sent | sent; //1 o varios sent que son asignaciones operaciones etc
sent : type lid ';' | IDENTIFICADOR asig exp ';' | 'return' exp ';' | IDENTIFICADOR '(' lid ')' ';' | IDENTIFICADOR '(' ')' ';'
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig
    exp ')' blq
    | 'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq;
lid : IDENTIFICADOR | IDENTIFICADOR ',' lid; //variables 1 o mas
asig : '=' | '+=' | '-=' | '*=' | '/=';
exp : exp op exp | IDENTIFICADOR '(' lid ')' | '(' exp ')' | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT;
op : '+' | '-' | '*' | '/';
lcond : lcond opl lcond | cond | 'no' cond;
cond : exp opr exp | 'cierto' | 'falso';
opl : 'y' | 'o';
opr : '==' | '<>' | '<' | '>' | '>=' | '<=';

fragment

DECIMAL : [0-9];

HEXADECIMAL: [0-9A-F];

ALPHA : [A-Za-z];
WORD : ALPHA+;