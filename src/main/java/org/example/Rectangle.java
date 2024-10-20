package dkit.oop;     // SOLUTION

//TODO
// change Rectangle declaration so that Rectangle inherits from Shape

public class Rectangle extends Shape{

    //TODO
    // Rectangle requires fields 'width' and 'height'.
    private int width;
    private int height;

    // constructor

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    // implement toString() and getters/setters.

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }

    // implement the area() method that is inherited from Shape
    //
    @Override
    public double area() {
        return width*height;
    }
}
