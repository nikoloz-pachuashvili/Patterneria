package org.patterneria.visitor;

/**
 * Evaluates arithmetic expression (Concrete visitor)
 */
public class ArithmeticExpressionEvaluator implements ArithmeticExpressionVisitor {
    private double result;

    /**
     * Gets result
     * @return result
     */
    public double getResult() {
        return result;
    }

    /**
     * Evaluates constant expression
     * @param expression
     */
    @Override
    public void visit(ConstantExpression expression) {
        this.result = expression.getValue();
    }

    /**
     * Evaluates binary arithmetic expression
     * @param expression
     */
    @Override
    public void visit(BinaryArithmeticExpression expression) {
        //stores result in private variable `result`
        expression.getLeft().accept(this);
        double left = this.result;
        expression.getRight().accept(this);
        double right = this.result;

        switch (expression.getOperation()){
            case '+': this.result = left + right;
                break;
            case '-': this.result = left - right;
                break;
            case '*': this.result = left * right;
                break;
            case '/': this.result = left / right;
                break;
            default:
                throw new UnsupportedOperationException("Invalid arithmetic operation");
        }
    }

    /**
     * Evaluates negate expression
     * @param expression
     */
    @Override
    public void visit(NegateExpression expression){
        expression.getExpressionToNegate().accept(this);
        this.result = -this.result;
    }
}
