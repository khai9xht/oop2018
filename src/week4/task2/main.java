package week4.task2;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println(shape.color);
        System.out.println("area ò circle = "+circle.getArea());
        System.out.println("premeter of square  = "+ square.Perimeter());
    }
}
