package Unidad4Caso4SegundaParte;

public class Truck extends Car {

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
	}

	public double SalePrice() {
		if (weight > 2000) {
			return getRegularPrice() * 90 / 100;
		} else
			return getRegularPrice() * 80 / 100;

	}

	@Override
	public String toString() {
		return super.toString() + "Truck [weight=" + weight + ", SalePrice=" + getSalePrice() + "]";
	}

}
