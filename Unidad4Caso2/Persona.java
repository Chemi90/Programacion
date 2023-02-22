package Unidad4Caso2;

public class Persona {
	private String nombre;
	private String apellido;
	private String telefono;
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
		
		if (telefono.length()==9) {
			this.telefono=telefono;
		}
		else {
			this.telefono= telefono + "Telefono no valido.";
		}
	}
	public Persona(String nombre, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		setTelefono(telefono);
	}
	public Persona() {
		super();
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}
	
	
}