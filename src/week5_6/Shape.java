package week5_6;

import java.awt.*;

/**
 * Created by CCNE on 17/10/2018.
 */
public abstract class Shape {
    protected String color ;
    protected Point vector;
    public abstract void draw(Graphics g);
    public abstract void move();
}
