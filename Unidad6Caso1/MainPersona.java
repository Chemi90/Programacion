package Unidad6Caso1;

public class MainPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Juan");
		System.out.println(p1);
		Persona p2 = new Persona("karla");
		System.out.println(p2);
		Persona p3 = new Persona("Carlos");
		System.out.println(p3);

		
		System.out.println("contadorPersonas: " + Persona.getContadorPersonas());
	}

}
