public class TestAnimals {

    public static void main(String[] args) {
        testCat();
        testDog();
        testBigDog();
    }

    public static void testCat() {
        Cat cat = new Cat("Whiskers");

        System.out.println("Cat greets: " + cat.greets()); // Expected: Meow
    }

    public static void testDog() {
        Dog dog = new Dog("Buddy");

        System.out.println("Dog greets: " + dog.greets()); // Expected: Woof
    }

    public static void testBigDog() {
        BigDog bigDog = new BigDog("Max");

        System.out.println("BigDog greets: " + bigDog.greets());
        System.out.println("BigDog greets Dog: " + bigDog.greets(new Dog("Buddy")));
        System.out.println("BigDog greets BigDog: " + bigDog.greets(new BigDog("Charlie")));
    }
}