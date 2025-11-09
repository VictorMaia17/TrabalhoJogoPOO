package Entidades;

import java.awt.*;

public interface Entity {

    public abstract void drawEntity(Graphics g);

    public abstract int getX();
    public abstract int getY();
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract void setX(int x);
    public abstract void setY(int y);

}
