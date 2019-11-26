grammar expression;

expr :  '(' expr ')' |
        expr OperatorCom expr |
        expr OperatorPrim expr |
        Number;


OperatorPrim :  '+' | '-';
OperatorCom : '*' | '/';
Number : [1-9][0-9]* | '0';
WS: [ ]+ -> skip;