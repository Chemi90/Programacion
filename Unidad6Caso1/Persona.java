package Unidad6Caso1;

public class Persona {

	private int idPersona;
	private String nombre;
	private static int contadorPersonas;
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public Persona() {
		super();
		contadorPersonas++;
		idPersona=contadorPersonas;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		contadorPersonas++;
		idPersona=contadorPersonas;
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]"+" contador personas: "+contadorPersonas;
	}
	

	
}
