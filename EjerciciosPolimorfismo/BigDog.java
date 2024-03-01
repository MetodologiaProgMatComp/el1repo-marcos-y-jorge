package EjerciciosPolimorfismo;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooof");
    }
}




