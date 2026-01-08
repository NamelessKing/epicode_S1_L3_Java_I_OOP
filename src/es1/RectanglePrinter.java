package es1;

public class RectanglePrinter {
    public static void printRectangle(Rectangle rectangle) {
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }

    public static void printTwoRectangles(Rectangle rect1, Rectangle rect2) {
        System.out.println("Rectangle 1:");
        printRectangle(rect1);
        System.out.println("Rectangle 2:");
        printRectangle(rect2);

        double totalArea = rect1.calculateArea() + rect2.calculateArea();
        double totalPerimeter = rect1.calculatePerimeter() + rect2.calculatePerimeter();

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
