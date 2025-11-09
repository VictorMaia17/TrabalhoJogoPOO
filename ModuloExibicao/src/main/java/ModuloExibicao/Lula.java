package ModuloExibicao;

import Entidades.*;
import Movimentacao.MoveEntity;

import java.awt.*;
import javax.swing.*;

public class Lula {

    public static void main(String[] args) {

        PainelExibicao exibicion = new PainelExibicao();

        Entity lulaEntity = new EntityForm(400, 800, new int[]{5, 5, 100, 100}, new int[]{50, 100, 100, 50}, 4);
        MovingEntityForm quadradoQueAnda = new MovingEntityForm(400, 800, new int[]{500, 500, 600, 600}, new int[]{200, 300, 300, 200}, 4, 10);

        Image lula = new ImageIcon(Lula.class.getResource("/lula2.png")).getImage();
        MovingEntitysSprite lulaEntidade = new MovingEntitysSprite(400, 800, 300, 50, 100, 100, lula, 10);

        exibicion.addEntity(lulaEntity);
        exibicion.addEntity(quadradoQueAnda);
        exibicion.addEntity(lulaEntidade);

        MoveEntity moveEntity = new MoveEntity(quadradoQueAnda);
        MoveEntity moverLula = new MoveEntity(lulaEntidade);

        exibicion.addKeyListener(moveEntity);
        exibicion.addKeyListener(moverLula);

        // Cria o frame e adiciona o painel
        JFrame frame = new JFrame("Painel");
        frame.add(exibicion);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Garante que o painel receba o foco para capturar teclas
        exibicion.requestFocusInWindow();

        // Atualização contínua da tela
        while (true) {
            exibicion.repaint();
            try {
                Thread.sleep(16); // 60 FPS aproximadamente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
