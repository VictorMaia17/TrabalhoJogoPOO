package Entidades;

import javax.swing.*;
import java.awt.*;

public class MovingEntitysSprite extends EntitySprite implements MovementEntitys{

    private int movementSpeed;

    public MovingEntitysSprite(int painelHeight, int painelWidth, int positionX, int positionY, int height, int width, Image sprite, int movementSpeed) {
        super(painelHeight, painelWidth, positionX, positionY, height, width, sprite);
        this.movementSpeed = movementSpeed;
    }

    @Override
    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    public void moveToTop(int movementDistance) {
        this.positionY -= movementDistance;
        interactionBorder();
    }

    @Override
    public void moveToBottom(int movementDistance) {
        this.positionY += movementDistance;
        interactionBorder();
    }

    @Override
    public void moveToLeft(int movementDistance) {
        this.positionX -= movementDistance;
        interactionBorder();
    }

    @Override
    public void moveToRight(int movementDistance) {
        this.positionX += movementDistance;
        interactionBorder();
    }

    private void interactionBorder() {

        if(positionX > painelWidth) {
            positionX = 0;
        }
        if(positionY > painelHeight) {
            positionY = 0;
        }
        if(positionX < 0) {
            positionX = painelWidth - width;
        }
        if(positionY < 0) {
            positionY = painelHeight - height;
        }

    }

}
