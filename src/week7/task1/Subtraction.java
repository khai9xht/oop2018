package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left,Expression right) {
        setLeft(left);
        setRight(right);
    }

    @Override
    int ivaluate(){return left().ivaluate()-right().ivaluate();}

    @Override
    String tostring(){return left()+" - "+right();}

}
