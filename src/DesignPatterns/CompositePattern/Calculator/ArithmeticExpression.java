package DesignPatterns.CompositePattern.Calculator;

public class ArithmeticExpression implements Expression{

    private Expression leftExpression;
    private Expression rightExpression;
    private Operator operation;

    public ArithmeticExpression(Expression leftExpression, Expression rightExpression, Operator operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = switch (operation) {
            case ADD -> leftExpression.evaluate() + rightExpression.evaluate();
            case SUBSTRACT -> leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY -> leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE -> leftExpression.evaluate() / rightExpression.evaluate();
        };
        return value;
    }
}
