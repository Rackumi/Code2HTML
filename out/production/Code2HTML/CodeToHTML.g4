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

sentlist : sentlist sent | sent;
sent : type lid ';' | IDENTIFICADOR asig exp ';' | 'return' exp ';' | IDENTIFICADOR '(' lid ')' ';' | IDENTIFICADOR '(' ')' ';';
lid : IDENTIFICADOR | IDENTIFICADOR ',' lid;
asig : '=' | '+=' | '-=' | '*=' | '/=';
exp : exp op exp | IDENTIFICADOR '(' lid ')' | '(' exp ')' | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT;
op : '+' | '-' | '*' | '/';

fragment

DECIMAL : [0-9];

HEXADECIMAL: [0-9A-F];

ALPHA : [A-Za-z];
WORD : ALPHA+;