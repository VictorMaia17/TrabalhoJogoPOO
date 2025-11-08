package Entidades;

import java.awt.*;

public class EntitySprite extends BaseEntity {

    private int positionX;
    private int positionY;
    private int height;
    private int width;
    private Image sprite;

    public EntitySprite(int movementSpeed, int PAINEL_HEIGHT, int PAINEL_WIDTH, int positionX, int positionY, int height, int width, Image sprite) {
        super(movementSpeed, PAINEL_HEIGHT, PAINEL_WIDTH);
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
        this.sprite = sprite;
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

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void drawEntity(Graphics g) {
        g.drawImage(sprite, positionX, positionY, width, height, null);
    }

    public void interactionBorder() {

        if(positionX > PAINEL_WIDTH) {
            positionX = 0;
        }
        if(positionY > PAINEL_HEIGHT) {
            positionY = 0;
        }
        if(positionX < 0) {
            positionX = PAINEL_WIDTH - width;
        }
        if(positionY < 0) {
            positionY = PAINEL_HEIGHT - height;
        }

    }

}
