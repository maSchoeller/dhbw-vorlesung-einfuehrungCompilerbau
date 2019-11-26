package maSchoeller.compilers;

import maSchoeller.compilers.uebung1.gen.ExpressionParser;

import java.util.List;

public class ExpressionCalculator {

    public int calculate(ExpressionParser.ExprContext expr) {
        if (expr.Div() != null) {
            return calculate(expr.expr(0)) / calculate(expr.expr(1));
        }
        else if (expr.Mul() != null) {
            return calculate(expr.expr(0)) * calculate(expr.expr(1));
        } else if(expr.Add() != null) {
            return calculate(expr.expr(0)) + calculate(expr.expr(1));
        } else if (expr.Sub() != null) {
            return calculate(expr.expr(0)) - calculate(expr.expr(1));
        } else if(expr.Number() != null) {
            return Integer.parseInt(expr.Number().getText());
        }
        else if (expr.Bopen() != null) {
            return calculate(expr.expr(0));
        }
        return  0;
    }
}
