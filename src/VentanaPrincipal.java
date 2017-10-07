import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
	
	public VentanaPrincipal() {
        this("Demo");
    }

    public VentanaPrincipal(String titulo) {
        super(titulo);

        this.iniciar(); // Configurar mi JFRAME
        this.configurarComponentes();

        this.pack();
        this.setVisible(true);
    }

    private VentanaPrincipal iniciar() {
        Dimension dims = new Dimension(750, 700);
        this.setSize(dims);
        this.setPreferredSize(dims);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        return this;
    }

    private void configurarComponentes() {
        
    }
}
