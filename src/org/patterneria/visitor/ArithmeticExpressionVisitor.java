package org.patterneria.visitor;

/**
 * Represents abstract visitor (operation)
 */
public interface ArithmeticExpressionVisitor {

    /**
     * Visits constant expression
     * @param expression
     */
    public void visit(ConstantExpression expression);

    /**
     * Visits binary arithmetic expression
     * @param expression
     */
    public void visit(BinaryArithmeticExpression expression);

    /**
     * Visits negate expression
     * @param expression
     */
    public void visit(NegateExpression expression);
}
