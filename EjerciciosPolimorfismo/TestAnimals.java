package EjerciciosPolimorfismo;

public class TestAnimals {

    public static void main(String[] args) {
        testCat();
        testDog();
        testBigDog();
    }

    public static void testCat() {
        Cat cat = new Cat("Whiskers");

        System.out.print("Cat greets: "); cat.greets();// Tiene que salir: Meow

    }
    public static void testDog() {
        Dog dog = new Dog("Buddy");

        System.out.print("Dog greets: "); dog.greets(); // Tiene que salir: Woof
    }
    public static void testBigDog() {
        BigDog bigDog = new BigDog("Max");

        System.out.print("BigDog greets: "); bigDog.greets(); // Tiene que salir: Woof
        System.out.println("BigDog greets Dog: ");  bigDog.greets(new Dog("Buddy")); // Tiene que salir: Woooof
        System.out.println("BigDog greets BigDog: "); bigDog.greets(new BigDog("Charlie")); // Tiene que salir: Woooooof
    }
}