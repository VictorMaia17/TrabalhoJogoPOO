package Entidades;

import javax.swing.*;
import java.awt.*;

public class EntitySprite implements Entity {

    protected int painelHeight;
    protected int painelWidth;
    protected int positionX;
    protected int positionY;
    protected int height;
    protected int width;
    protected Image sprite;

    public EntitySprite(int painelHeight, int painelWidth, int positionX, int positionY, int height, int width, Image sprite) {
        this.painelHeight = painelHeight;
        this.painelWidth = painelWidth;
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
        this.sprite = sprite;
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

    @Override
    public int getX() {
        return positionX;
    }

    @Override
    public int getY() {
        return positionY;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setX(int x) {
        positionX = x;
    }

    @Override
    public void setY(int y) {
        positionY = y;
    }

}
