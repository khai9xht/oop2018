/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;

/**
 * lớp hình (Shape)
 */
class Shape{
    //TODO: khai báo thuộc tính
    String color = "red";
    Boolean filled = true;

    //TODO: tạo contructor
    public Shape() {}

    public Shape(String color, Boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    //TODO: tạo getter, setter cho mỗi thuộc tính
    public String getColor() { return color; }

    public Boolean isFilled() { return filled; }

    public void setColor(String color) { this.color = color; }

    public void setFilled(Boolean filled) { this.filled = filled; }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}

class Circle extends Shape{
    //TODO: khai báo thuộc tính
    double radius = 1.0;
    private static final double PI = 3.14;

    //TODO: tạo contructor
    public Circle() {}

    public Circle(double radius) { this.radius = radius; }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //TODO: tạo getter, setter cho mỗi thuộc tính
    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    //TODO: viết phương thức tính diện tích và chu vi
    public double getArea(){ return PI*radius*radius; }

    public double Perimeter(){ return 2*radius*PI; }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }

}
class Rectangle extends Shape{
    //TODO: khai báo thuộc tính
    double Width = 1.0;
    double Length = 1.0;

    //TODO: tạo contructor
    public Rectangle() {}

    public Rectangle(double width, double length) {
        Width = width;
        Length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        Width = width;
        Length = length;
    }

    //TODO: tạo getter, setter cho mỗi thuộc tính
    public double getWidth() { return Width; }

    public double getLength() { return Length; }

    public void setWidth(double width) { Width = width; }

    public void setLength(double length) { Length = length; }

    //TODO: viết phương thức tính diện tích và chu vi
    /**
     * hàm setArea() tình diện tích hình chữ nhật
     * @return diện tích hình chữ nhật
     */
    public double setArea(){ return Width*Length; }

    public double Perimeter(){ return 2*(Width+Length); }

    @Override
    public String toString() {
        return "Rectangle{" + "color='" + color + '\'' + ", filled=" + filled + ", Width=" + Width + ", Length=" + Length + '}';
    }
}

/**
 * lớp hình vuông(Square) kế thừa lớp hình chứ nhật(rectangle)
 */
class Square extends Rectangle{
    //TODO: tạo contructor
    public Square() {}

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }

    @Override
    public String toString() {
        return "Square{" + "color='" + color + '\'' + ", filled=" + filled + ", Side=" + Width + '}';
    }
}
