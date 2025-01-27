package S03.POO.UML;

import S03.POO.UML.Circle;

public class TestMain {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle c1 = new Circle(1.1);
        System.out.println(c1); // toString()
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);
        c1.setRadius(2.2);
        System.out.println(c1); // toString()
        System.out.println("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
