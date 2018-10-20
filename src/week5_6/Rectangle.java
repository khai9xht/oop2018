package week5_6;

import java.awt.*;


/**
 * Created by CCNE on 17/10/2018.
 */
class Rectangle extends Shape {
    private Point point = new Point();
    private double width;
    private double height;
    public Rectangle(Point point, double width, double height,Color color, Point vector) {
        this.color = color;
        this.vector = vector;
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
            point.setX(point.getX()+vector.getX());
            point.setY(point.getY()+vector.getY());
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(point.getX(),point.getY(),(int)width,(int)height);
    }

    @Override
    public void handle() {
        if(point.getX()+width==500 || point.getX() == 0) vector.setX(this.vector.getX()*(-1));
        if(point.getY()+height==500 || point.getY() == 0) vector.setY(this.vector.getY()*(-1));
    }
}
