package Entidades;

public class MovingEntityForm extends EntityForm implements MovementEntitys{

    private int movementSpeed;

    public MovingEntityForm (int painelHeight, int painelWidth, int[] xPoints, int[] yPoints, int numberPoints, int movementSpeed){
        super(painelHeight, painelWidth, xPoints, yPoints, numberPoints);
        this.movementSpeed = movementSpeed;
    }

    @Override
    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public void setMovementSpeed(int movementSpeed) {
        movementSpeed = movementSpeed;
    }

    @Override
    public void moveToTop(int movementDistance) {
        for(int i = 0; i < numberPoints; i++){
            yPoints[i] -= movementDistance;
        }
        interactionBorder();
    }

    @Override
    public void moveToBottom(int movementDistance) {
        for(int i = 0; i < numberPoints; i++){
            yPoints[i] += movementDistance;
        }
        interactionBorder();
    }

    @Override
    public void moveToLeft(int movementDistance) {
        for(int i = 0; i < numberPoints; i++){
            xPoints[i] -= movementDistance;
        }
        interactionBorder();
    }

    @Override
    public void moveToRight(int movementDistance) {
        for(int i = 0; i < numberPoints; i++){
            xPoints[i] += movementDistance;
        }
        interactionBorder();
    }

    private void interactionBorder() {

        if(xPoints[0] > painelWidth) {

            for(int i = 0; i < xPoints.length; i++){
                xPoints[i] -= painelWidth;
            }

        }
        if(yPoints[0] > painelHeight) {

            for(int i = 0; i < yPoints.length; i++){
                yPoints[i] -= painelHeight;
            }

        }
        if(xPoints[0] < 0) {

            for(int i = 0; i < xPoints.length; i++){
                xPoints[i] += painelWidth;
            }

        }
        if(yPoints[0] < 0) {

            for(int i = 0; i < yPoints.length; i++){
                yPoints[i] += painelHeight;
            }

        }

    }
}
