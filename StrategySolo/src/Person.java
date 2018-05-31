public class Person {
    Moving moving;

    public void setMoving(Moving moving) {
        this.moving = moving;
    }

    public void executeMoving(){
        moving.typeOfMoving();
    }
}
