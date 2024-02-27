public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth(); // El lado es igual al ancho (width) del cuadrado
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    public void setLength(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    @Override
    public String toString() {
        return "Square["+ super.toString() +"]";
    }
}
