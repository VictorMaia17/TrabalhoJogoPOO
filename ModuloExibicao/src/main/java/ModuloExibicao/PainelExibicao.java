package ModuloExibicao;

import Entidades.Entity;
import javax.swing.*;
import java.awt.*;

public class PainelExibicao extends JPanel {

    private Entity[] entities;

    public PainelExibicao(Entity[] entities) {
        this.entities = entities;
        setFocusable(true);              // permite capturar teclado
        requestFocusInWindow();          // requisita foco
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Entity e : entities) {
            e.drawEntity(g);
        }
    }
}
