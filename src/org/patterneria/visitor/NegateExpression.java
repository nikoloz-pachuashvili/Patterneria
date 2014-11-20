package org.patterneria.visitor;

/**
 * Negate expression (Concrete element)
 */
public class NegateExpression extends ArithmeticExpression {
    private ArithmeticExpression expressionToNegate;

    /**
     * Gets expression which should be negated
     * @return expression
     */
    public ArithmeticExpression getExpressionToNegate() {
        return expressionToNegate;
    }

    /**
     * Creates new instance of negate expression
     * @param expressionToNegate
     */
    public NegateExpression(ArithmeticExpression expressionToNegate) {
        this.expressionToNegate = expressionToNegate;
    }

    /**
     * Accepts visitor
     * @param visitor The visitor
     */
    @Override
    public void accept(ArithmeticExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
