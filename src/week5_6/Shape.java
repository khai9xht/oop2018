package week5_6;

import java.awt.*;

/**
 * Created by CCNE on 17/10/2018.
 */
public abstract class Shape{
    protected Color color ;
    protected Point vector;

    public Color getColor(Color green) { return color; }

    public void setColor(Color color) { this.color = color; }

    /**
     * hàm vẽ hình
     * @param g đồ họa
     */
    public abstract void draw(Graphics g);

    /**
     * hàm di chuyển hình
     */
    public abstract void move();

    /**
     * hàm xủ xi chạm biên
     */
    public abstract void handle();
}
