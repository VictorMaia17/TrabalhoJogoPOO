package ModuloExibicao;

import Entidades.Entity;
import Entidades.EntityForm;
import Movimentacao.MovimentacaoEntidade;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        EntityForm quadrado = new EntityForm(10, 400, 800,
                new int[] {5, 5, 20, 20},
                new int[] {5, 20, 20, 5},
                4
        );

        PainelExibicao exibicao = new PainelExibicao(new Entity[]{quadrado});
        MovimentacaoEntidade movimentacao = new MovimentacaoEntidade(quadrado);

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
