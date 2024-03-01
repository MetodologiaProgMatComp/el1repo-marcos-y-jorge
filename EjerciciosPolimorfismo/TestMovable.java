package EjerciciosPolimorfismo;

public class TestMovable {

    public static void main(String[] args) {
        testMovablePoint();
        testMovableCircle();
    }
    public static void testMovablePoint() {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);

        System.out.println("Testing MovablePoint:");
        System.out.println("Original Point: " + point);

        point.moveUp();
        System.out.println("After moveUp: " + point); // Tiene que dar: (1, -2) speed=(3,4)

        point.moveDown();
        System.out.println("After moveDown: " + point); // Tiene que dar: (1, 2) speed=(3,4)

        point.moveLeft();
        System.out.println("After moveLeft: " + point); // Tiene que dar: (-2, 2) speed=(3,4)

        point.moveRight();
        System.out.println("After moveRight: " + point); // Tiene que dar: (1, 2) speed=(3,4)
    }

    public static void testMovableCircle() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);

        System.out.println("\nTesting MovableCircle:");
        System.out.println("Original Circle: " + circle);

        circle.moveUp();
        System.out.println("After moveUp: " + circle); // Tiene que dar: (0, -1, speed=(1,1), radius=5)

        circle.moveDown();
        System.out.println("After moveDown: " + circle); // Tiene que dar: (0, 0, speed=(1,1), radius=5)

        circle.moveLeft();
        System.out.println("After moveLeft: " + circle); // Tiene que dar: (-1, 0, speed=(1,1), radius=5)

        circle.moveRight();
        System.out.println("After moveRight: " + circle); // Tiene que dar:, 0, speed=(1,1), radius=5)
    }
}