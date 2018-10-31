package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class ExpressionTest {
    public static void main(String[] args) {
        Numeral a = new Numeral(10);
        Numeral b = new Numeral(1);
        Numeral c = new Numeral(2);
        Numeral d = new Numeral(3);
        Square x = new Square(a);
        BinaryExpression y = new Addition(new Subtraction(x,b) , new  Multiplication(c,d));
        Square z = new Square(y);
        System.out.print("value of z = "+z.ivaluate());
    }
}
