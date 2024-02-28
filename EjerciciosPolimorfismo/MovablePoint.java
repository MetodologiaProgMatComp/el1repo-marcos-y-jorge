    package EjerciciosPolimorfismo;

    public class MovablePoint implements Movable {
        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;
        public MovablePoint(int x, int y, int xSpeed, int ySpeed){
            this.x=x;
            this.y=y;
            this.xSpeed=xSpeed;
            this.ySpeed=ySpeed;
        }
        public void setySpeed(int ySpeed) {
            this.ySpeed = ySpeed;
        }
        public void setxSpeed(int xSpeed) {
            this.xSpeed = xSpeed;
        }
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public int getXSpeed() {
            return xSpeed;
        }
        public int getYSpeed() {
            return ySpeed;
        }
        @Override
        public String toString() {
            return "("+ x +","+ y + ")speed=("+ xSpeed+","+ySpeed+")";
        }
        public void moveUp(){
            y-=ySpeed;
        }
        public void moveDown(){
            y+=ySpeed;
        }
        public void moveRight(){
            x+=xSpeed;
        }
        public void moveLeft(){
            x-=xSpeed;
        }
    }
    //Subclase MovablePoint