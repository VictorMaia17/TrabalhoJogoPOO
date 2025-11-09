package ModuloColisao;
import Entidades.*;

import java.util.ArrayList;

public class ColisionEntitys {

    private boolean isColision(Entity entity1, Entity entity2) {

        //ENTITY 1 RELEVANT POINTS
        final int OUTSET_ENTITY1_X = entity1.getX();
        final int OUTSET_ENTITY1_Y = entity1.getY();
        final int END_ENTITY1_X = entity1.getX() + entity1.getWidth();
        final int END_ENTITY1_Y = entity1.getY() + entity1.getHeight();

        //ENTITY 2 RELEVANT POINTS
        final int OUTSET_ENTITY2_X = entity2.getX();
        final int OUTSET_ENTITY2_Y = entity2.getY();
        final int END_ENTITY2_X = entity2.getX() + entity1.getWidth();
        final int END_ENTITY2_Y = entity2.getY() + entity1.getHeight();

        //IF ENTITY 1 OCCUPIES THE SAME SPACE PARTIALLY AND HORIZONTALLY AS ENTITY 1 TO THE LEFT
        boolean occupiesSameCoordinatesXLeft = END_ENTITY1_X >= OUTSET_ENTITY2_X && OUTSET_ENTITY1_X <= OUTSET_ENTITY2_X;
        boolean occupiesSameCoordinatesXRight = OUTSET_ENTITY1_X <= END_ENTITY2_X && END_ENTITY1_X >= END_ENTITY2_X;
        boolean occupiesSameCoordinatesXInternally = OUTSET_ENTITY1_X >= OUTSET_ENTITY2_X && END_ENTITY1_X <= END_ENTITY2_X;
        boolean occupiesSameCoordinatesXExternally = OUTSET_ENTITY1_X <= OUTSET_ENTITY2_X && END_ENTITY1_X >= END_ENTITY2_X;
        boolean occupiesSameCoordinatesYTop = END_ENTITY1_Y >= OUTSET_ENTITY2_Y && END_ENTITY1_Y <= END_ENTITY2_Y;
        boolean occupiesSameCoordinatesYBottom = OUTSET_ENTITY1_Y <= END_ENTITY2_Y && END_ENTITY1_Y >= END_ENTITY2_Y;
        boolean occupiesSameCoordinatesYInternally = OUTSET_ENTITY1_Y >= OUTSET_ENTITY2_Y && END_ENTITY1_Y <= END_ENTITY2_X;
        boolean occupiesSameCoordinatesYExternally = OUTSET_ENTITY1_Y <= OUTSET_ENTITY2_X && END_ENTITY1_X >= END_ENTITY2_X;

        //VERIFY COLISIONS LEFT SIDE
        if( occupiesSameCoordinatesXLeft && occupiesSameCoordinatesYBottom ||
                occupiesSameCoordinatesXLeft && occupiesSameCoordinatesYTop ||
                occupiesSameCoordinatesXLeft && occupiesSameCoordinatesYInternally ||
                occupiesSameCoordinatesXLeft && occupiesSameCoordinatesYExternally ||

                //VERIFY COLISIONS RIGHT SIDE
                occupiesSameCoordinatesXRight && occupiesSameCoordinatesYBottom ||
                occupiesSameCoordinatesXRight && occupiesSameCoordinatesYTop ||
                occupiesSameCoordinatesXRight && occupiesSameCoordinatesYInternally ||
                occupiesSameCoordinatesXRight && occupiesSameCoordinatesYExternally ||

                //VERIFY COLISIONS INTERNALLY CASES
                occupiesSameCoordinatesXInternally && occupiesSameCoordinatesYBottom ||
                occupiesSameCoordinatesXInternally && occupiesSameCoordinatesYTop ||
                occupiesSameCoordinatesXInternally && occupiesSameCoordinatesYInternally ||
                occupiesSameCoordinatesXInternally && occupiesSameCoordinatesYExternally ||

                //VERIFY COLISIONS EXTERNALLY CASES
                occupiesSameCoordinatesXExternally && occupiesSameCoordinatesYBottom ||
                occupiesSameCoordinatesXExternally && occupiesSameCoordinatesYTop ||
                occupiesSameCoordinatesXExternally && occupiesSameCoordinatesYInternally ||
                occupiesSameCoordinatesXExternally && occupiesSameCoordinatesYExternally
        ) {
            return true;
        }

        return false;
    }

    public void verifyColisionsBetweenEntities(ArrayList<Entity> entities) {

        for(int i = 0; i < entities.size(); i++) {
            for(int j = i + 1; j < entities.size(); j++) {
                isColision(entities.get(i), entities.get(j));
            }
        }

    }
}
