package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by CCNE on 17/10/2018.
 */
class Layer extends JPanel {
    ArrayList<Shape> layer = new ArrayList<>();
    private Graphics g = this.getGraphics();

    public Layer(ArrayList<Shape> layer) {
        this.layer = layer;
        this.setBackground(Color.GREEN);
        this.setVisible(true);
    }

    public Layer() {
        this.setBackground(Color.GREEN);
        this.setVisible(true);
    }

    void removeRectangle(){
        for(Shape shape : layer){
            if(shape instanceof Rectangle) layer.remove(shape);
        }
    }
    void removeCircle(){
        for(Shape shape : layer){
            if(shape instanceof Circle) layer.remove(shape);
        }
    }
}
