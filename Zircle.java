import java.awt.*;

public class Zircle extends Shape {
    int width;
    int height;
    int arcWidth;
    int arcHeight;

    public Zircle(int x, int y, Color color, int width, int height, int arcWidth, int arcHeight) {
        // call the super constructor here
        super(x, y, color);

        this.width = width;
        this.height = height;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArcWidth() {
        return this.arcWidth;
    }

    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    public int getArcHeight() {
        return this.arcHeight;
    }

    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
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
        g2d.fillRoundRect(getX(), getY(), getArcWidth(), getHeight(), getArcWidth(), getArcHeight());
    }
}
