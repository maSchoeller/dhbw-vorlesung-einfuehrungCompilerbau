grammar uebung1;
namen : namen NewLine+ name | name;
name : ID ',' ID ; // vorname, Name
ID : [A-Z][a-z]*;
WS : [ ]+ -> skip ; //Leerzeichen ignorieren
NewLine: '\r'? '\n';