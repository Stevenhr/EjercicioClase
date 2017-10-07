import java.awt.*;
import javax.swing.*;
public class Publicidad extends JPanel{
	public JLabel imagen;
	public Publicidad() {
		  setLayout( new BorderLayout());
	        JLabel imagen = new JLabel();
	        ImageIcon icono = new ImageIcon( "img/images.jpg" );
	        imagen.setIcon( icono );
	        imagen.setHorizontalAlignment( JLabel.CENTER );
	        add( imagen, BorderLayout.CENTER );
	        setBackground( Color.WHITE );
    }
}
