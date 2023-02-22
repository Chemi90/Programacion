package Unidad4Caso2;

public class Main {

	public static void main(String[] args) {
		Persona p1=new Persona("Pepito", "Grillo", "456987123");
		Persona p2=new Persona("Juanita", "Campanilla", "7123");
		Cuenta c1=new Cuenta("123456789987", 1000.50, p1);
		Cuenta c2=new Cuenta("789987", 5902.5, p2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.transaccion(1500, "Reintegro");
		c1.transaccion(2389, "ingreso");
		
		c2.transaccion(1500, "Reintegro");
		c2.transaccion(2389, "ingreso");
	}

}
