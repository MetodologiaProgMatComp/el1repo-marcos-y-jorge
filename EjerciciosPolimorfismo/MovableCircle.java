package EjerciciosPolimorfismo;

public class MovableCircle implements Movable  {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center=new MovablePoint(x, y, xSpeed, ySpeed);

        this.radius=radius;
    }
    public String toString(){
        return "(" + center.getX() +", "+ center.getY() + ", speed=(" + center.getXSpeed() + "," + center.getYSpeed()  +"), radius=" + radius;
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveRight(){
        center.moveRight();
    }
    public void moveLeft(){
        center.moveLeft();
    }
}
