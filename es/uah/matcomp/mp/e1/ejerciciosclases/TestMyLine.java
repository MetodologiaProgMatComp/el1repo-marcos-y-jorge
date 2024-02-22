package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TestMyLine {
    public static void main(String[] args) {
        // Crear instancias de MyPoint para los puntos de la línea
        MyPoint2 point1 = new MyPoint2(1, 2);
        MyPoint2 point2 = new MyPoint2(4, 6);

        // Crear instancia de MyLine usando los puntos
        MyLine line1 = new MyLine(point1, point2);

        // Imprimir información sobre la línea
        System.out.println("Line 1:");
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        // Modificar puntos y probar nuevamente
        point1.setXY(0, 0);
        point2.setXY(3, 4);

        // Imprimir información después de modificar puntos
        System.out.println("\nLine 1 (after modifying points):");
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());
    }
}
