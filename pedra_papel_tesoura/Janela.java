import javax.swing.JButton;
import javax.swing.*;

public class Janela extends JFrame {

    public JFrame janela;

    public Janela() {
        janela = new JFrame("Pedra Papel e Tesoura");

    }

    public void iniciarJogo() {
        new JButton("Tesoura");
        new JButton("Pedra");
        new JButton("Papel");
    }
}
