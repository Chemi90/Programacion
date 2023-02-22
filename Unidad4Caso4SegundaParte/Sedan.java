package Unidad4Caso4SegundaParte;

public class Sedan extends Car {

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sedan(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
	}

	public double SalePrice() {
		if (length > 20) {
			return getRegularPrice() * 95 / 100;
		} else
			return getRegularPrice() * 90 / 100;

	}

	@Override
	public String toString() {
		return super.toString() + "Sedan [length=" + length + ", SalePrice=" + SalePrice() + "]";
	}

}
