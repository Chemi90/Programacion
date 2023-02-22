package Unidad4Caso5;

public class Principal {

	public static void main(String[] args) {

		PuestoTrabajo puesto1 = new PuestoTrabajo("F156AFV", "Describo un poco las cosas", 8000.52);
		
		Empleado emp1 = new Empleado("1561616A", "Jose Miguel", "Ruiz Guevara", "Calle Pintor Antonio Hidalgo", "29700",
				"Vélez-Málaga", puesto1);
		Empleado emp2 = new Empleado("53742766T", "Alejandra", "Lanza", "Calle Pintor Antonio Hidalgo", "29700",
				"Vélez-Málaga", puesto1);
		Consultor con1 = new Consultor("35687423R", "Paco", "Ramirez", "Calle Abajo", "85700",
				"Málaga", puesto1, "crack");
		Administrativo ad1 = new Administrativo("9654298Y", "Jose", "Garcia", "Avenida principal", "99632",
				"Vélez", puesto1,15);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(con1);
		System.out.println(ad1);

	}

}
