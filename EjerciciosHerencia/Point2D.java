package EjerciciosHerencia;
public class Point2D {
    private float x;
    private float y;
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point2D(){
        x=0.0f;
        y=0.0f;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] xy= new float[2];
        xy[0]=x;
        xy[1]=y;
        return xy;
    }
    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
