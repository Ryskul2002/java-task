public abstract class Figure {

    protected double radius;
    protected int height;
    private int length;
    private int width;


    public Figure() {
    }

    public Figure(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public abstract void calculateFigure() throws Exception;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

}
