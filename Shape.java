import java.awt.*;
/**
 * This is the superclass in a hierarchy of shapes that you have to construct
 *
 * @author Rob Nash
 */
//the superclass in our inheritance hierarchy
//all "common" features, functions and data should go here
//for example, all shapes in Java2D have a x,y that declares their position
//and many of the shapes exposed have a width and a height (but not all, so we didn't put
// width and height here)

//  note that this class is mostly empty, as there is no algorithm generic enough to
// guess an arbitrary shape's area (future subclasses must override getArea() to
// provide something reasonable) also, the draw method is empty too, as we don't know
// what shape to draw here! (again, our subclasses will need to replace this method
// with one that actually draws things)
public abstract class Shape {
    private int x = 0;
    private int y = 0;
    private Color color;
    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract void draw(Graphics g);
}