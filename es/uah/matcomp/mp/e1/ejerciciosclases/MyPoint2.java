package es.uah.matcomp.mp.e1.ejerciciosclases;
///Ejercicio 2.7,2.8 y 2.9

public class MyPoint2 {
    private int x;
    private int y;


    public MyPoint2() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint2(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }
    ///Ejercicio 2.9
    public double distance(MyPoint2 anotherPoint) {
        int deltaX = this.x - anotherPoint.getX();
        int deltaY = this.y - anotherPoint.getY();

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}