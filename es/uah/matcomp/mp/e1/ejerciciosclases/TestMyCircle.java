public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint2 point1 = new MyPoint2(3, 4);
        MyCircle circle1 = new MyCircle(point1, 5);
        System.out.println("Detalles del Círculo 1:");
        System.out.println("Centro: " + circle1.getCenter());
        System.out.println("Radio: " + circle1.getRadius());
        System.out.println("Área: " + circle1.getArea());
        System.out.println("Circunferencia: " + circle1.getCircumference());
        System.out.println();

        // Crear otro círculo con valores predeterminados
        MyCircle circle2 = new MyCircle();

        // Mostrar los detalles del segundo círculo
        System.out.println("Detalles del Círculo 2:");
        System.out.println("Centro: " + circle2.getCenter());
        System.out.println("Radio: " + circle2.getRadius());
        System.out.println("Área: " + circle2.getArea());
        System.out.println("Circunferencia: " + circle2.getCircumference());
        System.out.println();

        // Calcular la distancia entre los dos círculos
        double distance = circle1.distance(circle2);
        System.out.println("Distancia entre los círculos: " + distance);
    }
}