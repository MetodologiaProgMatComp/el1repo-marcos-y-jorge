public class MovableCircle {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        this.x=new MovablePoint.(x);
        this.y=new MovablePoint(y);
        this.xSpeed=new MovablePoint(xSpeed);
        this.ySpeed=new MovablePoint(ySpeed);
        this.radius=radius;
    }
    public String toString(){
        return "("+new MovablePoint(x) + ","+new MovablePoint(y)+"), speed=("+new MovablePoint(xSpeed)+","+new MovablePoint(ySpeed)"), radius=" +radius+"
    }
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}
