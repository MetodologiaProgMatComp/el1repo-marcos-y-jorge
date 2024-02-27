package EjerciciosPolimorfismo;

public class Square extends Rectangle {
    protected double side;
    public Square(){
        this.side=1.0;
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color, Boolean filled){
        this.side=side;
        color=getColor();
        filled=getFilled();


    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Boolean getFilled() {
        return super.getFilled();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color= "+ color + ",filled="+ filled +"] width=" + width+"length="+length+"]";
    }
}
