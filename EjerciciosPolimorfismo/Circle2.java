public class Circle2 {
    private double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
