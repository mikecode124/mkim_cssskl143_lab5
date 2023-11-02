public class ColorWithAlpha extends SimpleColor {
    private int alpha;

    // constructors
    public ColorWithAlpha(int alpha) {
        super(0, 0, 0);
        if (this.alpha + alpha > 255 || this.alpha + alpha < 0) {
            throw new ColorArgumentException();
        }
        this.alpha = alpha;
    }

    public ColorWithAlpha(int red, int green, int blue, int alpha) {
        super(red, green, blue);
        if (this.alpha + alpha > 255 || this.alpha + alpha < 0) {
            throw new ColorArgumentException();
        }
        this.alpha = alpha;
    }

    public ColorWithAlpha(Object toCopy) {

        ColorWithAlpha color = (ColorWithAlpha) toCopy;

        setColor(color.getRed(), color.getGreen(), color.getBlue());
        if (this.alpha + alpha > 255 || this.alpha + alpha < 0) {
            throw new ColorArgumentException();
        }
        this.alpha = color.getAlpha();
    }

    public int getAlpha() {
        int returnInt = 0;
        returnInt = this.alpha;
        return returnInt;
    }

    public void setAlpha(int alpha) {
        if (this.alpha + alpha > 255 || this.alpha + alpha < 0) {
            throw new ColorArgumentException();
        }

        this.alpha = alpha;
    }

    @Override
    public boolean equals(Object toCompare) {
        boolean returnBool = false;

        if (this == toCompare) {
            returnBool = true;
        }
        if (!super.equals(toCompare)) {
            returnBool = false;
        }
        if (!(toCompare instanceof ColorWithAlpha)) {
            returnBool = false;
        }
        ColorWithAlpha color = (ColorWithAlpha) toCompare;
        // compare the alpha values
        if (color.getAlpha() == color.getAlpha()) {
            returnBool = true;
        }

        return returnBool;
    }

    @Override
    public String toString() {
        return "(" + this.getRed() + ", " + this.getGreen() + ", " + this.getBlue() + ", " + this.getAlpha() +")";
    }

}
