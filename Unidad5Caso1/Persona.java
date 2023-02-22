package Unidad5Caso1;

import java.util.Random;

public class Persona {

	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;

	//Métodos Getters y Setters
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

	public String getDNI() {
		return DNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String string) {
		this.sexo = string;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	// Constructor con nombre, edad y sexo.
	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.comprobarSexo(sexo);
		generaDNI();
	}

	// Constructor sin parametros.
	public Persona() {
		super();
		generaDNI();
	}

	// Constructor con todos los párametros.
	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		generaDNI();
		this.comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	// Metodo calculas IMC.
	public int calculasIMC() {
		double imc = peso / (altura * altura);

		if (imc < 18.50)
			return -1;
		else if (imc >= 18.50 || imc < 25)
			return 0;
		else if (imc > 25 || imc < 30)
			return 1;
		else
			return 2;
		
	}

	// Método booleano para mayor de edad.
	public boolean esMayorDeEdad() {

		if (edad >= 18)
			return true;
		else
			return false;
	}

	// Método privado comprobar sexo.
	private String comprobarSexo(String sexo) {

		if (sexo == "M")
			sexo = "M";
		else
			sexo = "H";
		return sexo;
	}

	// Método generar DNI.
	private void generaDNI() {
		Random rand = new Random();
		int numDNI = rand.nextInt(100000000) + 23;
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
				'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
				'Q', 'V', 'H'
				, 'L', 'C', 'K', 'E'};
	    int rest = (int) (numDNI % 23);
	    char letraDNI = letras[rest];
		
		DNI=Integer.toString(numDNI).concat(Character.toString(letraDNI));
		
	}

	private String IMC() {
		if(calculasIMC()==-1) return "Bajo peso.";
		else if (calculasIMC()==0) return "Normal.";
		else if (calculasIMC()==1) return "Sobrepeso.";
		else return "Obesidad.";
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + comprobarSexo(sexo) + ", peso=" + peso
				+ ", altura=" + altura + ", calculasIMC()=" + IMC() + ", esMayorDeEdad()=" + (esMayorDeEdad()?"Mayor de edad":"Menor de edad") + "]";
	}

	
}
