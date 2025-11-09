package Entidades;

import java.awt.*;

public class EntityForm implements Entity {

    protected int painelHeight;
    protected int painelWidth;
    protected int[] xPoints;
    protected int[] yPoints;
    protected int numberPoints;

    public EntityForm(int painelHeight, int painelWidth, int[] xPoints, int[] yPoints, int numberPoints) {
        this.painelHeight = painelHeight;
        this.painelWidth = painelWidth;
        this.xPoints = xPoints;
        this.yPoints = yPoints;
        this.numberPoints = numberPoints;
    }

    @Override
    public void drawEntity(Graphics g) {
        g.fillPolygon(xPoints, yPoints, numberPoints);
    }

    @Override
    public int getX() {
        return xPoints[0];
    }

    @Override
    public int getY() {
        return yPoints[0];
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void setX(int x) {
        int diference = x - xPoints[0];

        for(int i = 0; i < numberPoints; i++) {
            xPoints[i] += diference;
        }
    }

    @Override
    public void setY(int y) {
        int diference = y - yPoints[0];

        for(int i = 0; i < numberPoints; i++) {
            yPoints[i] += diference;
        }
    }

}
