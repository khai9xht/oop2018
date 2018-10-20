package week5_6;

import java.awt.*;


/**
 * Created by CCNE on 17/10/2018.
 */
class Circle extends Shape {
    private Point point;
    private double radius;

    public Circle(Point point, double radius,Color color, Point vector) {
        this.color = color;
        this.vector = vector;
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
    public void draw(Graphics g){
        g.setColor (color);
        g.fillOval (point.getX(),point.getY(),(int)radius,(int)radius);

    }

    @Override
    public void move() {
            point.setX(point.getX()+vector.getX());
            point.setY(point.getY()+vector.getY());
    }

    @Override
    public void handle() {
        if(point.getX()-radius == 0 || point.getX()+radius == 500) vector.setX(this.vector.getX()*(-1));
        if(point.getY()-radius == 0 || point.getY()+radius == 500) vector.setY(this.vector.getY()*(-1));
    }
}
