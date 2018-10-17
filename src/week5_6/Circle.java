package week5_6;

import java.awt.*;

/**
 * Created by CCNE on 17/10/2018.
 */
class Circle extends Shape {
    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        super();
        this.point = point;
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void move() {

    }
}
