package ExamenSegundoTrimestre;

public class Espectador{

	//atributos de la clase
	private String nombre;
	private int edad;
	private double dineroDisponible;
	

	//constructor con solamente los parametros de espectador
	public Espectador(String nombre, int edad, double dineroDisponible) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dineroDisponible = dineroDisponible;
	}


	//metodos getter y setter de la clase espectadores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	//metodo tostring
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible
				+ ", toString()=" +  "]";
	}

}
