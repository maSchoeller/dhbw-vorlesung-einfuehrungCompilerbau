grammar Expression;

expr :  Bopen expr Bclose |
        expr (Mul | Div) expr |
        expr (Add | Sub) expr |
        Number;

Bopen : '(';
Bclose :')';
Add :'+';
Sub : '-';
Mul : '*';
Div : '/';

Number : [1-9][0-9]* | '0';
WS: [ ]+ -> skip;
