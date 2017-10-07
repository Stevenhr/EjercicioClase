import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {
	RegistroUsuario regis;
	Publicidad pub;
	ArrayList  listaPersonas;
	public VentanaPrincipal() {
        this("Demo");
    }

    public VentanaPrincipal(String titulo) {
        super(titulo);

        this.iniciar(); // Configurar mi JFRAME
        this.configurarComponentes();

        this.pack();
        this.setVisible(true);
        
        listaPersonas = new ArrayList<Persona>();
        
        
    }

    private VentanaPrincipal iniciar() {
        Dimension dims = new Dimension(750, 700);
        this.setSize(dims);
        this.setPreferredSize(dims);
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        return this;
    }

    private void configurarComponentes() {
    	Publicidad pub = new Publicidad();
    	add(pub, BorderLayout.NORTH);
    	
        RegistroUsuario regis = new RegistroUsuario();
        add(regis, BorderLayout.CENTER);
    }
}
