package org.example;

// Demonstrates the use of operator "instanceof" to
// find out the type of an object.

import java.util.ArrayList;


public class MainApp
{
    public static void main( String[] args )
    {
        System.out.println( "Using instanceof to determine class type of an object" );
        MainApp app = new MainApp();
        app.start();
    }

    public void start() {


        // create an ArrayList and populate it with two Circles and two Rectangles.
        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Circle(2, 3, 10));
        shapesList.add(new Circle(3, 4, 12));
        shapesList.add(new Rectangle(4, 8, 30, 25));
        shapesList.add(new Rectangle(12, 14, 15, 25));

        // If we want to iterate over the ArrayList and print out the
        // type of each shape object and the radius if it is a Circle but
        // the width and height if it is a Rectangle
        // then we need to use teh "instanceof" operator to determine
        // the object type.

        for (Shape shape : shapesList) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape; // cast the reference to the type Circle
                System.out.println("Circle with radius: " + circle.getRadius());
            }

            // Note that the CAST (Circle) is necessary, as we can not invoke
            // the getRadius() method using the shape reference variable as
            // getRadius is not a member method of the Shape class.
            // We are casting the reference of type Shape, to a reference of type Circle
            // which is fine because we have determined that the object is an instance of the Circle class.

            //TODO
            // Inside this loop, use the instanceof operator to determine if an object
            // in the list is of type Rectangle.  If it is a Rectangle, the print its width and height.

        }
    }
}
