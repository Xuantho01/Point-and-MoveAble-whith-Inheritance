import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] array = new float[4];
    public MoveAblePoint(){}
    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        super.setXY();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getArray() {
        return array;
    }

    public String move(){
        xSpeed += getX();
        ySpeed += getY();
        return "Speed("+xSpeed+","+ySpeed+")";
    }


    public void setXYZ(){
        array[0] = getX();
        array[1] = getY();
//        getXY();
        array[2] = this.xSpeed;
        array[3] = this.ySpeed;
    }
    @Override
    public String toString(){
        return "Toa do 3D: "+ Arrays.toString(getArray()) +"\n"+move();
    }
}
