package Unidad5Caso5;

public class Lavadora extends Electrodomestico{

	private double carga;

	//constructor con carga y lo demas heredados llamando a la clase padre
	public Lavadora(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	//constructor con precio, peso y el resto por defecto
	public Lavadora(double precioBase, double peso) {
		super(precioBase, Color.blanco, ConsumoEnergetico.F, peso);
	}

	//contructor con todos por defecto
	public Lavadora() {
		this(100, Color.blanco, ConsumoEnergetico.F,5 , 5);
	}

	//metodo getter de carga, no hacemos el setter
	public double getCarga() {
		return carga;
	}

	//metodo precio final con sumamos el de la clase padre
	@Override
	public double precioFinal() {
	    double precio = super.precioFinal();
	    if (carga > 30) {
	      precio += 50;
	    }
	    return precio;
	  }

	@Override
	public String toString() {
		return super.toString()+"Lavadora [carga=" + carga + "]";
	}
	
	
	
}
