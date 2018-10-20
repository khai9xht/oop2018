/**
 * Package làm bài tập tuần 5 và tuần 6
 * Đọc yêu cầu đề bài ở week5_6.pdf
 */
package week5_6;


import java.awt.*;
public class main{
    public static void main(String[] args) {
        Point rec_point = new Point(10,10);
        Point cir_point = new Point(300,50);
        Point vector1 = new Point(1,1);
        Point vector2 = new Point(1,1);
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        Rectangle rectangle = new Rectangle(rec_point,50,80,Color.RED,vector1);
        Circle circle = new Circle(cir_point,40,Color.RED,vector2);
        diagram.diagram.add(layer);
        layer.layer.add(circle);
        layer.layer.add(rectangle);
        diagram.add(layer);
        Graphics g = diagram.getGraphics();
        while(true) {
            for (Shape shape : layer.layer) {
                shape.handle();
                shape.setColor(Color.GREEN);
                shape.draw(g);
                shape.setColor(Color.RED);
                shape.move();
                shape.draw(g);
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}