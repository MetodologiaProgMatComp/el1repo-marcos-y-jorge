public class Rectangle extends Shape{
        protected double width;
        protected double length;
        public Rectangle(){
            this.width=1.0;
            this.length=1.0;
        }
        public Rectangle(double width,double length){
            this.width=width;
            this.length=length;
        }
        public Rectangle(double width, double length,String color,Boolean filled){
            super(color,filled);
        }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return"Rectangle[Shape[color= "+ color + ",filled="+ filled+"] width=" + width+"length="+length+"]";
    }
}
