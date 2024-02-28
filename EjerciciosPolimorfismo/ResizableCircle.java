package EjerciciosPolimorfismo;

public class ResizableCircle extends Circle implements Resizable{
    ResizableCircle(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius="+ radius+"]]";
    }
    public void resize(int percent){
        radius*=(percent/100);
    }
}
//Subclase ResizableCircle