package es.uah.matcomp.mp.e1.ejerciciosclases;

public class MyCircle {
    private MyPoint2 center;
    private int radius;
    public MyCircle(){
        this.center= new MyPoint2();
        this.radius =1;
    }
    public MyCircle(int x, int y, int radius){
        this.radius=radius;
        this.center= new MyPoint2(x,y);
    }
    public MyCircle(MyPoint2 center, int radius){
        this.radius=radius;
        this.center=center;
    }

    public int getRadius() {
        return radius;
    }
    public MyPoint2 getCenter() {
        return center;
    }

    public void setCenter(MyPoint2 center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // Other methods
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center.toString() + "]";
    }
}
