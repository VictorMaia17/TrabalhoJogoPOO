package ModuloExibicao;

import java.util.ArrayList;
import Entidades.Entity;
import javax.swing.*;
import java.awt.*;

public class PainelExibicao extends JPanel {

    private ArrayList<Entity> entities;

    public PainelExibicao() {
        entities = new ArrayList<>();
        setFocusable(true);              // permite capturar teclado
        requestFocusInWindow();          // requisita foco
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Entity e : entities) {
            e.drawEntity(g);
        }
    }
}
