package Unidad5Caso5;

public class Television extends Electrodomestico {

	private double pulgadas;
	private boolean tdt;

	// constructor con todos los atributos, incluso los heredados
	public Television(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, double pulgadas,
			boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.pulgadas = pulgadas;
		this.tdt = tdt;
	}

	// constructor con precio, peso y el resto por defecto
	public Television(double precioBase, double peso) {
		super(precioBase, Color.blanco, ConsumoEnergetico.F, peso);
	}

	// contructor con todos por defecto
	public Television() {
		this(100, Color.blanco, ConsumoEnergetico.F, 5, 20, false);
	}

	// metodos getter de pulgadas y tdt
	public double getPulgadas() {
		return pulgadas;
	}

	public boolean isTdt() {
		return tdt;
	}

	// metodo precio final con sumamos el de la clase padre
	@Override
	public double precioFinal() {
		double precio = super.precioFinal();
		if (pulgadas > 40) {
			precio = precio * 1.3;
		}
		if (tdt == true) {
			precio += 50;
		}
		return precio;
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", tdt=" + tdt + ", toString()=" + super.toString();
	}

}
