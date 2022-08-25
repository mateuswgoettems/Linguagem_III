import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame {
    private JButton button;

    public Botao(String message) {
        super("Criando Botoes");

        button = new JButton(message);
        add(button);
    }
}
