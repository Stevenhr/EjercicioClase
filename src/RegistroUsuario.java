import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class RegistroUsuario extends JPanel{
	 
	public RegistroUsuario() {
		Border borde = BorderFactory.createTitledBorder( "DATOS DE USUARIO" );
	    setBorder( borde );
		setLayout(new GridBagLayout());
		GridBagConstraints contenido = new GridBagConstraints();
		
		JLabel cedula= new JLabel("CEDULA");
		contenido .fill = GridBagConstraints.HORIZONTAL;
		contenido .gridx = 0;
		contenido .gridy = 0;
		add(cedula, contenido);
		
		JTextField cedula1=new JTextField();
		contenido.fill=GridBagConstraints.HORIZONTAL;
		contenido .gridx = 1;
		contenido .gridy = 0;
		add(cedula1, contenido);
		
		JLabel nombre= new JLabel("NOMBRE");
		contenido .fill = GridBagConstraints.HORIZONTAL;
		contenido .gridx = 0;
		contenido .gridy = 1;
		add(nombre, contenido);
		
		JTextField nombre1=new JTextField();
		contenido.fill=GridBagConstraints.HORIZONTAL;
		contenido .gridx = 1;
		contenido .gridy = 1;
		add(nombre1, contenido);
		
		JLabel apellido= new JLabel("APELLIDO");
		contenido .fill = GridBagConstraints.HORIZONTAL;
		contenido .gridx = 0;
		contenido .gridy = 2;
		add(apellido, contenido);
		
		JTextField apellido1=new JTextField();
		contenido.fill=GridBagConstraints.HORIZONTAL;
		contenido .gridx = 1;
		contenido .gridy = 2;
		add(apellido1, contenido);
		
		JLabel telefono= new JLabel("TELEFONO");
		contenido .fill = GridBagConstraints.HORIZONTAL;
		contenido .gridx = 0;
		contenido .gridy = 3;
		add(telefono, contenido);
		
		JTextField telefono1=new JTextField();
		contenido.fill=GridBagConstraints.HORIZONTAL;
		contenido .gridx = 1;
		contenido .gridy = 3;
		add(telefono1, contenido);
		
		JLabel direccion= new JLabel("DIRECCION");
		contenido .fill = GridBagConstraints.HORIZONTAL;
		contenido .gridx = 0;
		contenido .gridy = 4;
		add(direccion, contenido);
		
		JTextField direccion1=new JTextField();
		contenido .fill = GridBagConstraints.HORIZONTAL;
		contenido .gridx = 1;
		contenido .gridy = 4;
		add(direccion1, contenido);
		
		
		
		JButton registrar=new JButton("REGISTRAR");
		contenido.fill=GridBagConstraints.HORIZONTAL;
		contenido .gridx = 1;
		contenido .gridy = 5;
		add(registrar, contenido);
		
		
	
		
		
		
	 }
	
}
