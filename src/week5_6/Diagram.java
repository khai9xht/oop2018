package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Diagram extends JFrame{
    private static final int max_height = 500;
    private static final int max_width = 500;
    private JLayeredPane layeredPane = new JLayeredPane();
    ArrayList<Layer> diagram = new ArrayList<>();
    public Diagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
        this.setPreferredSize(new Dimension(max_height, max_width));
        this.setBounds(500,150,max_width,max_height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(this.layeredPane, BorderLayout.CENTER);
        this.layeredPane.setBounds(0, 0, max_width, max_height);
        this.pack();
        this.setBackground(Color.GREEN);
        this.setVisible(true);
    }

    public Diagram() {
        this.diagram = diagram;
        this.setPreferredSize(new Dimension(max_height, max_width));
        this.setBounds(500,150,max_width,max_height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(this.layeredPane, BorderLayout.CENTER);
        this.layeredPane.setBounds(0, 0, max_width, max_height);
        this.pack();
        this.setBackground(Color.GREEN);
        this.setVisible(true);
    }

    void removeCircle(){
        for(Layer layer : diagram){
            layer.removeCircle();
        }
    }
    private static int layerIndex = 0;
    public void addLayer(Layer layer) {
        this.diagram.add(layer);
        this.layeredPane.add(layer, layerIndex++, 0);
    }
}
