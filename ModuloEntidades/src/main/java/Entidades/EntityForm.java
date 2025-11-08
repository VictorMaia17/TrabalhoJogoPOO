package Entidades;

import java.awt.*;

public abstract class EntityForm implements Entity {

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

    protected void interactionBorder() {

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
