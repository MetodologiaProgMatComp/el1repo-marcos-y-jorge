package EjerciciosHerencia;
public class TestShape {
    public static void main(String[] args) {
        // Prueba de la clase Shape
        Shape shape = new Shape("red", true);
        System.out.println("Shape: " + shape.toString());
        System.out.println();

        // Prueba de la clase Circle
        Circle circle = new Circle(2.0, "green", false);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Area de Circle: " + circle.getArea());
        System.out.println("Perimetro de Circle: " + circle.getPerimeter());
        System.out.println();

        // Prueba de la clase Rectangle
        Rectangle rectangle = new Rectangle(1.0, 4.0, "blue", true);
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Area de Rectangle: " + rectangle.getArea());
        System.out.println("Perimetro de Rectangle: " + rectangle.getPerimeter());
        System.out.println();

        // Prueba de la clase Square
        Square square = new Square(2.5, "red", false);
        System.out.println("Square: " + square.toString());
        System.out.println("Area de Square: " + square.getArea());
        System.out.println("Perimetro de Square: " + square.getPerimeter());
    }
}
