package Unidad5Caso1;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// primer objeto con los datos de escaner
		System.out.println("Introduce el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce la edad: ");
		int edad = sc.nextInt();
		System.out.println("Introduce el sexo M o H: ");
		String sexo = sc.next();
		System.out.println("Introduce el peso en kg: ");
		double peso = sc.nextDouble();
		System.out.println("Introduce la altura en metros: ");
		double altura = sc.nextDouble();

		// Iniciamos los 3 objetos
		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();

		// segundo objeto con solo algunos datos
		persona2.setNombre(persona1.getNombre());
		persona2.setEdad(persona1.getEdad());
		persona2.setSexo(persona1.getSexo());

		// tercer objeto con los metodos SET
		persona3.setNombre("Alberto");
		persona3.setEdad(48);
		persona3.setSexo("M");
		persona3.setPeso(120);
		persona3.setAltura(1.60);

		// Iniciar metodo IMC con los 3 objetos
		persona1.calculasIMC();
		persona3.calculasIMC();

		// Iniciamos metodo para saber si es mayor de edad
		persona1.esMayorDeEdad();
		persona2.esMayorDeEdad();
		persona3.esMayorDeEdad();

		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);

		sc.close();
	}

}
