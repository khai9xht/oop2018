package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class Division extends BinaryExpression {
    public Division(Expression left,Expression right) {
        setLeft(left);
        setRight(right);
    }

    @Override
    int ivaluate(){
        try{
            return left().ivaluate()/right().ivaluate();
        }catch (ArithmeticException e){
            System.out.println(e);
            return 0;
        }
    }

    @Override
    String tostring(){return left()+" / "+right();}
}
