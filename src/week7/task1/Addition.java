package week7.task1;

public class Addition extends BinaryExpression {
    public Addition(Expression left,Expression right) {
        setLeft(left);
        setRight(right);
    }

    @Override
    int ivaluate(){return left().ivaluate()+right().ivaluate();}

    @Override
    String tostring(){return left()+" + "+right();}

}
