public class SimpleColor {
    private int red;
    private int green;
    private int blue;
    public SimpleColor() {}
    public SimpleColor(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }
    public SimpleColor(SimpleColor simpleColor) {
        this(simpleColor.red, simpleColor.green,simpleColor.blue);
    }
    public int getRed() {
        return red;
    }
    public void setRed(int red) {
        this.red = red;
    }
    public int getGreen() {
        return green;
    }
    public void setGreen(int green) {
        this.green = green;
    }
    public int getBlue() {
        return blue;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }
    public void setColor(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }
    @Override
    public String toString() {
        return "(" + red + ", " + green + ", " + blue + ")";
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof SimpleColor)) {
            return false;
        }
        SimpleColor color = (SimpleColor) object;
        return this.red == color.red
                && this.green == color.green
                && this.blue == color.blue;
    }
}