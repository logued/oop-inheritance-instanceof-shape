package dkit.oop;

// Abstract class
// If we identify that there are a number of types of objects that have
// a lot in common, then we can create an abstract class to represent
// the generality of those objects.  In this abstract class we can define
// the fields and methods that are common to all the relevant objects.
//
// A good example is when we want to represent shapes in a program.
// We could reasonably identify that :
// -- circle, rectangle, triangle, line are all shapes
// - all shape objects must have a position, an (x,y) co-ordinate that represents
//   the top left corner of the object's position (bounding rectangle).
// - all shapes have an area, so we can provide an area() method to calculate the area.
//
// The position and area() are common to all shapes, so we can create a class
// called Shape and define the (x,y) fields and the area() method in it.
// However, we can not implement the area() method in Shape,as the area
// will depend on the type or the shape, which will be defined in a "concrete class"
// such as Circle or Rectangle.  A method with only a header but no implementation
// is called an abstract method.  So, area() is an abstract method here.
// Rules:
// - if a class defines one or more abstract methods then
//   the class itself must be declared as abstract (as in this example)
// - an abstract class can NOT be instantiated (i.e. it is not
//   possible to create an object of the class using 'new Shape()' )
//  ( we wouldn't want a shape object that wasn't of a particular type!)
// - subclasses MUST implement all abstract methods e.g. area()
//   (the compiler will indicate an error if a subclass does not
//   implement a method that has been declared as 'abstract'
//   (So, writers of subclasses are forced to implement all methods)
//
// - the area() method is declared as "abstract", so developers who
//   extend this class must implement an area() method. In this way we can
//   force all subclasses to provide an area() method.

// Class designers sometimes create an abstract class to represent a general concept,
// and when specific concrete classes are defined, they are required to extend
// the abstract class. In this way, a commonality of structure and behaviour is
// imposed on all objects of a certain type. In this example, all concrete shapes
// (i.e. Circle, Rectangle,...) must extend from Shape, so they then become Shape objects
// via the "is-a" inheritance relationship.
// The abstract Shape defines the things that will be present in
// all concrete classes (as long as they extend Shape).

public abstract class Shape {
    // position top left corner - required in all subclasses
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * area() - Abstract method that must be implemented by all subclasses that extend
     * this class. Declaring the method as 'abstract' will force classes that
     * inherit from this class to implement the method.
     *
     * @return area of the shape
     * (see Rectangle::area() and Circle::area() for implementations)
     */
    public abstract double area();   // no method body allowed


    // methods common to all Shape objects
    public int getX() { return x; }
    public void setX(int x) { this.x = x;}
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public String toString() {
        return this.getClass().getName() +
                "(x=" + this.x + ",y=" + this.y + ")";
    }
}
