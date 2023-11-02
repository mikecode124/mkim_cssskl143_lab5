import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Class PolyDemo (is a JFrame) and PolyDemoPanel (is a JPanel)
 *
 * @author Rob Nash
 */
class PolyDemo extends JFrame {
    public PolyDemo() {
// Adds a PolyDemoPanel to the content of this frame.
        getContentPane().add(new PolyDemoPanel());
// Sets the dimensions of this frame.
        setSize(300,300);
// Sets this frame to be visible.
        setVisible(true);
// Sets the frame to exit when the frame is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        PolyDemo myApp = new PolyDemo();
    }
    /***
     * this is our first "inner" or internal class
        the purpose of this class is solely to support the JFrame class above,
        and I don't want it reused in arbitrary contexts, so by nesting this class here
        I can indicate the intent a bit more clearly that this class "goes with" the class above it
        In general, each class is a separate entity that should be contained in a separate file
     */
    public static class PolyDemoPanel extends JPanel {
        List<Shape> shapes = new ArrayList<>();
        public PolyDemoPanel() {
// TODO Uncomment the following code and run this program after you have finished your Circle class.
            Shape circle = new Circle(100, 100, Color.BLUE, 50);
            shapes.add(circle);
// TODO Construct a circle with your choice of parameters and add it to the list of shapes.
            Shape bigCircle = new Circle(2, 10, Color.RED, 100);
            shapes.add(bigCircle);

            Shape smBtmRightCircle = new Circle(250, 250, Color.getHSBColor(77.7F,77.7F,77.7F) , 10);
            shapes.add(smBtmRightCircle);

            Shape medCircle = new Circle(125, 250, Color.getHSBColor(7.7F,7.7F,7.7F) , 77);
            shapes.add(medCircle);
// Note that coordinates (0, 0) represents the top-left corner of the frame,
// and the x and y values increase as you move down and right.
// TODO Construct two shapes from your custom class and add them to the list of shapes.
            Shape Zircle1 = new Zircle(5, 50, Color.getHSBColor(7.7F,7.7F,7.7F), 40, 20, 14, 20);
            shapes.add(Zircle1);

            Shape Can = new Zircle(130, 15, Color.getHSBColor(127.7F,737.7F,457.7F), 80, 200, 140, 20);
            shapes.add(Can);
        }
        /**
         * Code for drawing our shapes doesn't change at all! Since we intended
         to take advantage of polymorphism, we coded
         * this "in general" with respect to the superclass, and not specific
         to any subclass.
         *
         * @param g the <code>Graphics</code> context in which to paint
         */
        public void paint(Graphics g) {
            super.paint(g); // required for GUI widgets to draw correctly
            for(Shape shape : shapes) {
// The JVM calls the appropriate draw method for each shape.
                        shape.draw(g);
            }
        }
    }
}