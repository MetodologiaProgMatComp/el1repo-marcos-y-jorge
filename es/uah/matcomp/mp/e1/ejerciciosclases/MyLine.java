package es.uah.matcomp.mp.e1.ejerciciosclases;

public class MyLine {
    private MyPoint2 begin;
    private MyPoint2 end;
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint2(x1, y1);
        this.end = new MyPoint2(x2, y2);
    }
    public MyLine(MyPoint2 begin, MyPoint2 end) {
        this.begin = begin;
        this.end = end;
    }
    public MyPoint2 getBegin() {
        return begin;
    }
    public void setBegin(MyPoint2 begin) {
        this.begin = begin;
    }
    public MyPoint2 getEnd() {
        return end;
    }
    public void setEnd(MyPoint2 end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}

