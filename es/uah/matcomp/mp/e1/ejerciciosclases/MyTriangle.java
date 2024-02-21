public class MyTriangle {
    private MyPoint2 v1;
    private MyPoint2 v2;
    private MyPoint2 v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint2(x1, y1);
        this.v2 = new MyPoint2(x2, y2);
        this.v3 = new MyPoint2(x3, y3);
    }
    public MyTriangle(MyPoint2 v1, MyPoint2 v2, MyPoint2 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }
    public double getPerimeter() {
        double edge1 = v1.distance(v2);
        double edge2 = v2.distance(v3);
        double edge3 = v3.distance(v1);

        return edge1 + edge2 + edge3;
    }
    public String getType() {
        double edge1 = v1.distance(v2);
        double edge2 = v2.distance(v3);
        double edge3 = v3.distance(v1);

        if (edge1 == edge2 && edge2 == edge3) {
            return "Equilateral";
        } else if (edge1 == edge2 || edge2 == edge3 || edge3 == edge1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}