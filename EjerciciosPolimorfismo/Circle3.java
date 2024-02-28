package EjerciciosPolimorfismo;

public class Circle3 implements GeometricObject {
    protected double radius;
    public Circle3(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }
}
//Superclase Circle3
