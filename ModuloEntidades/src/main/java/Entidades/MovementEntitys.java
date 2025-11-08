package Entidades;

public interface MovementEntitys {

    public abstract int getMovementSpeed();

    public abstract void setMovementSpeed(int movementSpeed);

    public abstract void moveToTop(int movementDistance);

    public abstract void moveToBottom(int movementDistance);

    public abstract void moveToLeft(int movementDistance);

    public abstract void moveToRight(int movementDistance);

}
