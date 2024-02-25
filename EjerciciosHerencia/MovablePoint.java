package EjerciciosHerencia;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){
        xSpeed=0.0f;
        ySpeed=0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] speed= new float[2];
        speed[0]=xSpeed;
        speed[1]=ySpeed;
        return speed;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+")"+",speed=("+ xSpeed+","+ySpeed+")";
    }
    MovablePoint move(){
        this.setX(this.getX()+this.getxSpeed());
        this.setY(this.getY()+this.getySpeed());
        return this;
    }
}
//SubClase EjerciciosHerencia.MovablePoint
