package Unidad5Caso5;

public class Electrodomestico {

	// atributos con valores por defecto
	private double precioBase;
	private Color color;
	private ConsumoEnergetico consumoEnergetico;
	private double peso;

	// constructor normal
	public Electrodomestico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	// contructor con precio base y peso, el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, Color.blanco, ConsumoEnergetico.F, peso);
	}

	// constructor con todos los parametros por defecto
	public Electrodomestico() {
		this(100, Color.blanco, ConsumoEnergetico.F, 5);
	}

	// metodos getter y setter
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// metodo para comprobar el consumo energetico
	private ConsumoEnergetico comprobarConsumoEnergetico(char letra) {

		if (letra == 'A')
			return consumoEnergetico.A;
		if (letra == 'B')
			return consumoEnergetico.B;
		if (letra == 'C')
			return consumoEnergetico.C;
		if (letra == 'D')
			return consumoEnergetico.D;
		if (letra == 'E')
			return consumoEnergetico.E;
		else
			return consumoEnergetico;
	}

	// metodo para comprobar el color
	private Color comprobarColor(String color) {

		switch (color) {
		case "negro":
			return Color.negro;
		case "rojo":
			return Color.rojo;
		case "azul":
			return Color.azul;
		case "gris":
			return Color.gris;
		default:
			return Color.blanco;
		}
	}

	// metodo donde ponemos el precio segun el consumo y el peso
	public double precioFinal() {

		double precioTotal = 0;
		if (consumoEnergetico == ConsumoEnergetico.A)
			precioTotal = precioTotal + 100;
		if (consumoEnergetico == ConsumoEnergetico.B)
			precioTotal = precioTotal + 80;
		if (consumoEnergetico == ConsumoEnergetico.C)
			precioTotal = precioTotal + 60;
		if (consumoEnergetico == ConsumoEnergetico.D)
			precioTotal = precioTotal + 50;
		if (consumoEnergetico == ConsumoEnergetico.E)
			precioTotal = precioTotal + 30;
		if (consumoEnergetico == ConsumoEnergetico.F)
			precioTotal = precioTotal + 10;
		if (peso >= 0 && peso <= 19)
			precioTotal = precioTotal + 10;
		if (peso >= 20 && peso <= 49)
			precioTotal = precioTotal + 50;
		if (peso >= 50 && peso <= 79)
			precioTotal = precioTotal + 80;
		if (peso >= 80)
			precioTotal = precioTotal + 100;

		return precioTotal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "precio final " + precioFinal() + "]";
	}

}
