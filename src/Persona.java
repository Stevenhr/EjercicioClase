
public class Persona {
	private String nombre;
	private String apellido;
	private String telefono;
	private int cedula;
	private String direccion;
	
	public Persona(String nombre,String apellido,String telefono,int cedula,String direccion)
	{
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setTelefono(telefono);
		this.setCedula(cedula);
		this.setDireccion(direccion);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
