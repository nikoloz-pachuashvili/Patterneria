package org.patterneria.visitor;

/**
 * Represents abstract node
 */
public abstract class ArithmeticExpression {

    /**
     * Accepts visitor
     * @param visitor
     */
    public abstract void accept(ArithmeticExpressionVisitor visitor);
}
