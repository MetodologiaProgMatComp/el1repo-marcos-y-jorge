package EjerciciosPolimorfismo;

public class TestResizableCircle {
        public static void main(String[] args) {
            // Crear un círculo redimensionable con radio 5
            ResizableCircle resizableCircle = new ResizableCircle(5);

            // Imprimir detalles del círculo redimensionable antes de la modificación
            System.out.println("Resizable Circle before resizing:");
            System.out.println("Radius: " + resizableCircle.radius);
            System.out.println("Perimeter: " + resizableCircle.getPerimeter());
            System.out.println("Area: " + resizableCircle.getArea());
            System.out.println("String representation: " + resizableCircle.toString());

            // Redimensionar el círculo redimensionable al 50%
            resizableCircle.resize(50);

            // Imprimir detalles del círculo redimensionable después de la modificación
            System.out.println("\nResizable Circle after resizing:");
            System.out.println("Radius: " + resizableCircle.radius);
            System.out.println("Perimeter: " + resizableCircle.getPerimeter());
            System.out.println("Area: " + resizableCircle.getArea());
            System.out.println("String representation: " + resizableCircle.toString());

            // Crear un círculo regular con radio 3
            Circle3 circle = new Circle3(3);

            // Imprimir detalles del círculo regular
            System.out.println("\nCircle details:");
            System.out.println("Radius: " + circle.radius);
            System.out.println("Perimeter: " + circle.getPerimeter());
            System.out.println("Area: " + circle.getArea());
            System.out.println("String representation: " + circle.toString());
        }

}
