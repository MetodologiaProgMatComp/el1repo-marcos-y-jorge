package es.uah.matcomp.mp.e1.ejerciciosclases;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){

    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] coordenadas={this.x, this.y};
        return coordenadas;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x + ","+ y + ")";
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }


    public double distance(MyPoint otroMyPoint) {
        return Math.sqrt(Math.pow((this.x - otroMyPoint.x), 2) + Math.pow((this.y - otroMyPoint.y), 2));
    }


    public double distanceOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    }

