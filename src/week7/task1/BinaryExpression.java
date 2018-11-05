package week7.task1;

public abstract class BinaryExpression extends Expression {
    private Expression left;
    private Expression right;
    public Expression left(){return left;}
    public Expression right(){return right;}
    public void setLeft(Expression left) {this.left = left;}
    public void setRight(Expression right) {this.right = right;}
}

