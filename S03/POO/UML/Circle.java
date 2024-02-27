package S03.POO.UML;

public class Circle {
    private double radius;

    public Circle(){
        this.radius=1.0;

    }
    public Circle(double r){
        radius= r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
            this.radius = radius;
    }
    public double getArea(){
        return Math.PI*(radius*radius);
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }
    public String toString() {
        return "S03.POO.UML.Circle[radius=" + radius + " ]";
    }
}
