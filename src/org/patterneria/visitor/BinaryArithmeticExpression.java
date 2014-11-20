package org.patterneria.visitor;

/**
 * Concrete element
 */
public class BinaryArithmeticExpression extends ArithmeticExpression {
    private final ArithmeticExpression left;
    private final ArithmeticExpression right;
    private final char operation;

    /**
     * Left expression
     * @return expression
     */
    public ArithmeticExpression getLeft() {
        return left;
    }

    /**
     * Right expression
     * @return expression
     */
    public ArithmeticExpression getRight() {
        return right;
    }

    /**
     * Arithmetic operation
     * @return operation
     */
    public char getOperation() {
        return operation;
    }

    /**
     * Creates instance of binary arithmetic expression
     * @param left Left expression
     * @param right Right expression
     * @param operation Binary operation
     */
    public BinaryArithmeticExpression(ArithmeticExpression left, ArithmeticExpression right, char operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public void accept(ArithmeticExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
