package EjerciciosPolimorfismo;

public class TestShape {
        public static void main(String[] args) {
            // Crear instancias de Shape
            Shape shape1 = new Circle(5.0, "blue", true);
            Shape shape2 = new Rectangle(4.0, 6.0, "green", false);

            // Imprimir detalles de las formas
            System.out.println("Shape 1:");
            System.out.println("Color: " + shape1.getColor());
            System.out.println("Filled: " + shape1.getFilled());
            System.out.println("Area: " + shape1.getArea());
            System.out.println("Perimeter: " + shape1.getPerimeter());
            System.out.println(shape1);
            System.out.println();

            System.out.println("Shape 2:");
            System.out.println("Color: " + shape2.getColor());
            System.out.println("Filled: " + shape2.getFilled());
            System.out.println("Area: " + shape2.getArea());
            System.out.println("Perimetro: " + shape2.getPerimeter());
            System.out.println(  shape2);
        }
    }

