package EjerciciosHerencia;

public class TestAnimal {

    public static void main (String[]args){
        Dog d1 = new Dog("pepe");
        d1.greets();
        Cat c1 = new Cat("Pedro");
        c1.greets();
        System.out.println(d1);
        System.out.println(c1);

    }
}
//Test Subclases Gato y Perro
