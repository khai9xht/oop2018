package week7.task1;

public class Square extends Expression {
    private Expression expression;

    public Expression getExpression() {return expression;}

    public void setExpression(Expression expression) {this.expression = expression;}

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    int ivaluate() {
        return expression.ivaluate()*expression.ivaluate();
    }
    @Override
    String tostring(){
        return "expression = "+expression;
    }
}
