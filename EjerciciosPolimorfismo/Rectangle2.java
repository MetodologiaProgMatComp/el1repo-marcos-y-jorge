package EjerciciosPolimorfismo;

public class Rectangle2 {
    private double width;
    private double length;
    public Rectangle2(double width, double length){
        this.width=width;
        this.length=length;
    }
    @Override
    public String toString(){
        return "Circle[widht=" + width + ", length=" + length + "]";
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }

}
