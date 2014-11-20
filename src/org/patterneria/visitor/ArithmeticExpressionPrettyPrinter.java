package org.patterneria.visitor;

/**
 * Arithmetic expression pretty printer (Concrete visitor)
 * Prints Arithmetic expression
 */
public class ArithmeticExpressionPrettyPrinter implements ArithmeticExpressionVisitor {

    /**
     * Prints constant expression
     *
     * @param expression expression
     */
    @Override
    public void visit(ConstantExpression expression) {
        System.out.print(expression.getValue());
    }

    /**
     * Prints binary arithmetic expression
     *
     * @param expression expression
     */
    @Override
    public void visit(BinaryArithmeticExpression expression) {
        expression.getLeft().accept(this);
        System.out.printf(" %c ", expression.getOperation());
        expression.getRight().accept(this);
    }

    /**
     * Prints negated arithmetic expression
     *
     * @param expression expression
     */
    @Override
    public void visit(NegateExpression expression) {
        if (expression.getExpressionToNegate() instanceof ConstantExpression) {
            ConstantExpression constant = (ConstantExpression) expression.getExpressionToNegate();
            if (constant.getValue() < 0) {
                System.out.print(-constant.getValue());

            } else {
                System.out.print("-");
                constant.accept(this);
            }

            return;
        }

        System.out.print("-(");
        expression.getExpressionToNegate().accept(this);
        System.out.print(")");
    }
}
