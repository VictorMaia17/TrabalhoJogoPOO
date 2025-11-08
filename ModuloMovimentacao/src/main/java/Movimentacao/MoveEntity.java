package Movimentacao;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Entidades.*;

public class MoveEntity implements KeyListener {

    private final MovementEntitys movementEntity;

    public MoveEntity(MovementEntitys movementEntity) {

        this.movementEntity = movementEntity;

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                movementEntity.moveToTop(movementEntity.getMovementSpeed());
                break;
            case KeyEvent.VK_S:
                movementEntity.moveToBottom(movementEntity.getMovementSpeed());
                break;
            case KeyEvent.VK_A:
                movementEntity.moveToLeft(movementEntity.getMovementSpeed());
                break;
            case KeyEvent.VK_D:
                movementEntity.moveToRight(movementEntity.getMovementSpeed());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
