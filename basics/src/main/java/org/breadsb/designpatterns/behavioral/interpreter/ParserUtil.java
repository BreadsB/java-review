package org.breadsb.designpatterns.behavioral.interpreter;

public class ParserUtil {
    public static boolean isOperator(String symbol) {
        return symbol.equals("+");
    }

    public static Expression getExpressionObject(Expression firstExpression, Expression secondExpression, String symbol) {
        if (symbol.equals("+")) {
            return new AdditionExpression(firstExpression, secondExpression);
        } else {
            return new NumberExpression(0);
        }
    }
}
