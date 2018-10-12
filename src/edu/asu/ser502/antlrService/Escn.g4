grammar Escn ;

program : 'start' block 'stop' ;

block : declaration control ;

declaration : declarationStmt+ ;

declarationStmt : dataType identifier ';' ;

control : controlStmt+ ;

controlStmt : assignStmt | ifStmt | whileStmt | printStmt ;

assignStmt : identifier '=' (identifier | expr | bool) ';';

ifStmt : ifSection elseSection? 'endif' ;

ifSection : 'if' logicalStmt 'then' block ;

elseSection : 'else' block ;

whileStmt : 'while' logicalStmt 'do' block 'endwhile' ;

block : assignStmt | printStmt ;

logicalStmt : logicalStmt '<=' logicalStmt
 | logicalStmt '>=' logicalStmt
 | logicalStmt '<' logicalStmt
 | logicalStmt '>' logicalStmt
 | logicalStmt '==' logicalStmt
 | logicalStmt '!=' logicalStmt
 | identifier
 | bool
 ;

printStmt : 'print' '(' (expr | logicalStmt) ')' ';' ;

expr : term '+' expr | term '-' expr | term ;

term : factor '*' term | factor '/' term | factor ;

factor : identifier | num ;

identifier : Alphabet identifier* ;

Alphabet : [a-zA-Z] ;

num : NUMBER ;

NUMBER : Digit ;

fragment Digit : [1-9][0-9]* | [0] ;

dataType : 'int' | 'boolean' ;

bool : 'true' | 'false' ;

WhiteSpace : [ \r\n\t\u000C]+ -> skip ;

LineComment : '//' ~[\n\r]* -> skip ;

BlockComment : '/*' .*? '*' -> skip ;