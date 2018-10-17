package week5_6;

import java.awt.*;

/**
 * Created by CCNE on 17/10/2018.
 */
class Rectangle extends Shape {
    private Point point = new Point();
    private double width;
    private double height;
    public Rectangle(Point point, double width, double height) {
        super();
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public Rectangle() {super();}

    public Point getPoint() {return point;}

    public void setPoint(Point point) {this.point = point;}

    public double getWidth() {return width;}

    public void setWidth(double width) {this.width = width;}

    public double getHeight() {return height;}

    public void setHeight(double height) {this.height = height;}

    @Override
    public void move() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(point.getX(),point.getY(),(int)width,(int)height);
        g.setColor(Color.RED);
        g.fillRect(point.getX(),point.getY(),(int)width,(int)height);
    }
}
