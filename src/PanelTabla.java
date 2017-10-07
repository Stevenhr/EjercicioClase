import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelTabla extends JPanel{
	private DefaultTableModel tabla;
	private JTable tablaPersonas;
	private String[] columnas= {"Nombre","Apellido","Telefono","Cedula","Direccion"};
	private Object[][] datos;
	
	public PanelTabla(){
		tabla = new DefaultTableModel();
		tablaPersonas= new JTable(tabla);
		Object []columnas = {"Nombre","Apellido","Telefono","Cedula","Direccion"};
		for(Object columna1 : columnas) {  //para crear columnas
			tabla.addColumn(columna1);
		}
		this.add(tablaPersonas);
		setBorder( new TitledBorder( "Panel tabla" ) );
        setLayout( new GridLayout( 1, 1 ) );
	}
}
