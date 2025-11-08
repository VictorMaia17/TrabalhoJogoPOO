package ModuloExibicao;

import Entidades.Entity;
import Entidades.EntityForm;
import Entidades.EntitySprite;
import Movimentacao.MovimentacaoEntidade;

import javax.swing.*;
import java.awt.*;

public class Lula {

    public static void main(String[] args) {

        Image lula = new ImageIcon("C:\\Users\\VICTOR MAIA\\Downloads\\lula.png").getImage();
        Image prisao = new ImageIcon("C:\\Users\\VICTOR MAIA\\Downloads\\prisao.png").getImage();


        EntitySprite lulaEntidade = new EntitySprite(10, 400, 800, 5, 5, 40, 72, lula);

        PainelExibicao exibicao = new PainelExibicao(new Entity[]{lulaEntidade});
        MovimentacaoEntidade movimentacao = new MovimentacaoEntidade(lulaEntidade);

        exibicao.addKeyListener(movimentacao);

        // Cria o frame e adiciona o painel
        JFrame frame = new JFrame("Painel");
        frame.add(exibicao);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Garante que o painel receba o foco para capturar teclas
        exibicao.requestFocusInWindow();

        // Atualização contínua da tela
        while (true) {
            exibicao.repaint();
            try {
                Thread.sleep(16); // 60 FPS aproximadamente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
