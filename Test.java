
public class Test {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche();
		miCoche.setMarca("Ferrari");
		miCoche.setMatricula("1234ABC");
		miCoche.setNumeroRueda(5);
		
		System.out.println(miCoche.getMarca());
		System.out.println(miCoche.getMatricula());
		System.out.println("Numero de ruedas:" + miCoche.getNumeroRueda());
		
		Coche miSegundoCoche = new Coche("Peugeot","5698EDC",14);
		
		System.out.println(miSegundoCoche.getMarca());
		System.out.println(miSegundoCoche.getMatricula());
		System.out.println("Numero de ruedas:" + miSegundoCoche.getNumeroRueda());

	}

}
