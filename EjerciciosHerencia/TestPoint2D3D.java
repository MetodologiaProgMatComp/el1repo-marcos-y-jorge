

public class TestPoint2D3D {
    public static void main(String[] args) {
        // Prueba la clase Point2D
        Point2D point2D1 = new Point2D(2.0f, 3.0f);
        System.out.println("Point2D1: " + point2D1.toString());

        Point2D point2D2 = new Point2D();
        System.out.println("Point2D2: " + point2D2.toString());

        point2D2.setX(1.4f);
        point2D2.setY(3.1f);
        System.out.println("Point2D2: " + point2D2.toString());

        // Prueba la clase Point3D
        Point3D point3D1 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D1: " + point3D1.toString());

        Point3D point3D2 = new Point3D();
        System.out.println("Point3D2: " + point3D2.toString());

        point3D2.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Point3D2: " + point3D2.toString());
    }
}
