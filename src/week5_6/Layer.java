package week5_6;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by CCNE on 17/10/2018.
 */
class Layer {
    ArrayList<Shape> layer = new ArrayList<>();

    public Layer(ArrayList<Shape> layer) {
        this.layer = layer;
    }

    public Layer() {
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
