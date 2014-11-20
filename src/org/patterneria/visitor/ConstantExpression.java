package org.patterneria.visitor;

/**
 * Concrete element
 * Used to represent number as arithmetic expression
 */
public class ConstantExpression extends ArithmeticExpression {
    private double value;

    /**
     * Gets expression value
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * Creates new instance of constant expression
     * @param value Constant value
     */
    public ConstantExpression(double value) {
        this.value = value;
    }

    /**
     * Accepts visitor
     * @param visitor
     */
    @Override
    public void accept(ArithmeticExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
