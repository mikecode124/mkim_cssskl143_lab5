import java.awt.*;

public class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, Color color, int radius) {
        // call the super constructor here
        super(x, y, color);
        // initialize the radius here
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int newRad) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        // Draws an oval given the top-left corner, width, and
        // height of the rectangle that bounds this circle.
        g2d.fillOval(getX() - radius, getY() - radius, 2 * radius, 2 * radius);
    }
}
