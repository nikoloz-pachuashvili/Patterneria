package org.patterneria.visitor;

/**
 * Visitor sample
 */
public class VisitorSample {
    public void run(){
        ArithmeticExpression expression = new BinaryArithmeticExpression(
                new BinaryArithmeticExpression(
                        new ConstantExpression(20),
                        new ConstantExpression(2),
                        '+'),
                new ConstantExpression(5),
                '-');

        ArithmeticExpressionPrettyPrinter printer = new ArithmeticExpressionPrettyPrinter();
        expression.accept(printer);
        System.out.print(" = ");
        ArithmeticExpressionEvaluator evaluator = new ArithmeticExpressionEvaluator();
        expression.accept(evaluator);
        System.out.println(evaluator.getResult());

        expression = new NegateExpression(expression);
        expression.accept(printer);
        System.out.print(" = ");
        expression.accept(evaluator);
        System.out.println(evaluator.getResult());
    }
}
