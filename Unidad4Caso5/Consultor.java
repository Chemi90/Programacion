package Unidad4Caso5;

public class Consultor extends Empleado {

	private String categoriaProfesional;

	public String getCategoriaProfesional() {
		return categoriaProfesional;
	}

	public void setCategoriaProfesional(String categoriaProfesional) {
		this.categoriaProfesional = categoriaProfesional;
	}

	public Consultor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Consultor(String dni, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad,
			PuestoTrabajo puestoTrabajo, String categoriaProfesional) {
		super(dni, nombre, apellidos, domicilio, codigoPostal, ciudad, puestoTrabajo);
		this.categoriaProfesional = categoriaProfesional;
	}

	@Override
	public String getAtributos() {
		// TODO Auto-generated method stub
		return super.getAtributos();
	}

	@Override
	public String toString() {
		return super.toString() + "Consultor [categoriaProfesional=" + categoriaProfesional + "]";
	}

}
