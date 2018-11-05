package test_week5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class main {

    public static void main(String[] args) {
        Diagram diagram = new Diagram(Diagram.WIDTH, Diagram.HEIGHT);

        // bottom layer
        Layer circleLayer = new Layer(Diagram.WIDTH, Diagram.HEIGHT);
        circleLayer.setBackground(Color.BLUE);

        Layer rectangleLayer = new Layer(Diagram.WIDTH, Diagram.HEIGHT);
        rectangleLayer.setOpaque(false); // make layer transparent

        // add bottom layer first
        diagram.addLayer(circleLayer);

        // add other layers
        diagram.addLayer(rectangleLayer);

        Rectangle rec = new Rectangle();
        rec.start = new Point(0, 0);
        rec.color = Color.BLUE;
        rec.length = 50;
        rec.width = 70;
        rec.velocity = new Point(ranVelocity(), ranVelocity());

        Circle circle = new Circle();
        circle.color = Color.RED;
        circle.radius = 50;
        circle.point = new Point(100, 100);
        circle.velocity = new Point(ranVelocity(), ranVelocity());

        Circle circle2 = new Circle();
        circle2.color = Color.RED;
        circle2.radius = 50;
        circle2.point = new Point(100, 100);
        circle2.velocity = new Point(ranVelocity(), ranVelocity());

        Triangle tri = new Triangle();
        tri.color = Color.YELLOW;
        tri.a = new Point(200, 200);
        tri.b = new Point(250, 200);
        tri.c = new Point(200, 250);
        tri.velocity = new Point(ranVelocity(), ranVelocity());

        rectangleLayer.addShape(rec);
        circleLayer.addShape(circle);

        rectangleLayer.addShape(circle2);
        rectangleLayer.addShape(tri);

        diagram.moveShapes();
    }

    static Random ran = new Random();
    public static int ranVelocity() {
        return 5 + ran.nextInt(5);
    }
}

abstract class Shape {
    protected Color color;
    protected Point velocity;

    public abstract void draw(Graphics g);
    public abstract void move();
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle extends Shape {
    protected Point point;
    protected double radius;

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.point.x, this.point.y, (int)this.radius, (int)this.radius);
    }

    @Override
    public void move() {
        this.point.x += this.velocity.x;
        this.point.y += this.velocity.y;

        if (this.point.x <= 0 || (this.point.x + this.radius) >= Diagram.WIDTH) { // out of horizontal range
            this.velocity.x = -this.velocity.x;
        }

        if (this.point.y <= 0 || (this.point.y + this.radius) >= Diagram.HEIGHT) { // out of vertical range
            this.velocity.y = -this.velocity.y;
        }
    }

    @Override
    public String toString() {
        return String.format("Circle[%s]", this.point);
    }
}

class Rectangle extends Shape {
    protected Point start;
    protected int length;
    protected int width;

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(start.x, start.y, width, length);
    }

    @Override
    public void move() {
        this.start.x += this.velocity.x;
        this.start.y += this.velocity.y;

        if (this.start.x <= 0 || this.start.x + this.width >= Diagram.WIDTH) {
            this.velocity.x = -this.velocity.x;
        }

        if (this.start.y <= 0 || this.start.y + this.length >= Diagram.HEIGHT) {
            this.velocity.y = -this.velocity.y;
        }

    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s]", this.start);
    }
}

class Diagram extends JFrame implements KeyListener {
    static int WIDTH = 600;
    static int HEIGHT = 600;

    private JLayeredPane layeredPane = new JLayeredPane();
    private java.util.List<Layer> layers = new ArrayList<>();

    public Diagram(int w, int h) {
        this.setPreferredSize(new Dimension(h, w));
        this.setLayout(new BorderLayout());

        this.add(this.layeredPane, BorderLayout.CENTER);
        this.layeredPane.setBounds(0, 0, w, h);

        this.addKeyListener(this);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'c') {
            this.removeCircles();
        }
    }

    public void removeCircles() {
        for (Layer layer : layers) {
            layer.removeCircles();
        }
    }

    public void moveShapes() {
        while (true) {
            for (Layer layer : layers) {
                layer.moveShapes();
            }
            try {
                Thread.sleep(20);
            } catch(Exception e) {}
        }
    }

    private static int layerIndex = 0;
    public void addLayer(Layer layer) {
        this.layers.add(layer);
        this.layeredPane.add(layer, layerIndex++, 0);
    }
}

class Triangle extends Shape {

    Point a;
    Point b;
    Point c;

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillPolygon(
                new int[]{ a.x , b.x, c.x },
                new int[]{ a.y, b.y, c.y },
                3
        );
    }

    @Override
    public void move() {
        this.a.x += this.velocity.x;
        this.a.y += this.velocity.y;

        this.b.x += this.velocity.x;
        this.b.y += this.velocity.y;

        this.c.x += this.velocity.x;
        this.c.y += this.velocity.y;

        int minX = Math.min(Math.min(this.a.x, this.b.x), this.c.x);
        int minY = Math.min(Math.min(this.a.y, this.b.y), this.c.y);

        int maxX = Math.max(Math.max(this.a.x, this.b.x), this.c.x);
        int maxY = Math.max(Math.max(this.a.y, this.b.y), this.c.y);

        if (minX <= 0 || maxX >= Diagram.WIDTH) {
            this.velocity.x = -this.velocity.x;
        }

        if (minY <= 0 || maxY >= Diagram.HEIGHT) {
            this.velocity.y = -this.velocity.y;
        }

    }
}

class Layer extends JPanel {

    private java.util.List<Shape> shapes = new ArrayList<>();

    public Layer(int w, int h) {
        this.setBounds(0, 0, w, h);
    }

    public void moveShapes() {
        for (Shape shape : shapes) {
            shape.move();
            //System.out.println(shape);
        }
        this.repaint();
    }

    public void removeTriangles() {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);
            if (s instanceof Triangle) {
                shapes.remove(i);
            }
        }
    }

    public void removeCircles() {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);
            if (s instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
}