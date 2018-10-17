package week5_6;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Diagram extends JFrame{
    private static final int max_height = 500;
    private static final int max_width = 500;
    ArrayList<Layer> diagram = new ArrayList<>();
    public Diagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
        this.setBounds(100,100,max_width,max_height);
        this.setVisible(true);
    }

    public Diagram() {
        this.setBounds(500,150,max_width,max_height);
        this.setVisible(true);
    }

    void removeCircle(){
        for(Layer layer : diagram){
            layer.removeCircle();
        }
    }
}
