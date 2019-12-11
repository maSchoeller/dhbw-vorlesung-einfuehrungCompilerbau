grammar Markdown;

document : blockElement? (LineFeed+ blockElement)* LineFeed*;

blockElement : (list | headline | textElement | codeElement);

textElement: Text;
codeElement: CodeSeparator LineFeed (textElement LineFeed)* CodeSeparator;

headline: h1 | h2 | h3 | h4 | h5 | h6;

h1: '# ' Text;
h2: '## ' Text;
h3: '### ' Text;
h4: '#### ' Text;
h5: '##### ' Text;
h6: '###### ' Text;


list: unorderedList | orderedList;

orderedList: orderedListElement (LineFeed orderedListElement)*;
orderedListElement: (Count'.' Text);

unorderedList: unorderedListElement (LineFeed unorderedListElement)*;
unorderedListElement: ('*' Text);


Count: [1-9]+;
CodeSeparator: '```';
Text: [a-zA-z0-9äöüÄÖÜ:!? ]+;
LineFeed : '\r'? '\n';