package EjerciciosHerencia;

public class Mammal extends Animal {
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[Animal[name="+getName()+"]]";
    }

}
//SubClase (De la clase Animal) y SuperClase(de las clase Cat y Dog) Mammal
