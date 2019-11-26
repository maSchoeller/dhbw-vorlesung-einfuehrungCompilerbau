package maSchoeller.compilers;

import maSchoeller.compilers.uebung1.gen.*;
import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromString("100 + 2 * 3");
        ExpressionLexer lexer = new ExpressionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);
        ExpressionParser.ExprContext tree = parser.expr(); //Parsen

        ExpressionCalculator calc = new ExpressionCalculator();
        int ergebnis = calc.calculate(tree); // initiate walk of tree with listener
        System.out.println(ergebnis);
    }
}
