package S03.POO.UML;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.width=width;
        this.length=length;

    }
    public Rectangle(){
        this.length=1.0f;
        this.width=1.0f;

    }
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width){
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (2*length)+(2*width);
    }
    public String toString() {
        return "S03.POO.UML.Rectangle[length=" + length + " width= " + width + " ]";
    }

}
