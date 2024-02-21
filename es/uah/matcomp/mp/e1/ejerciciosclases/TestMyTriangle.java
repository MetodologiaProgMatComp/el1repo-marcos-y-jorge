public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint2 point1 = new MyPoint2(0, 0);
        MyPoint2 point2 = new MyPoint2(0, 1);
        MyPoint2 point3 = new MyPoint2(1, 0);

        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);

        System.out.println("Triangle 1:");
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyTriangle triangle2 = new MyTriangle(0, 0, 0, 1, 1, 0);

        System.out.println("\nTriangle 2:");
        System.out.println(triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
    }
}
