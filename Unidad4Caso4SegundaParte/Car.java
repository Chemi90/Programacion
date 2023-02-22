package Unidad4Caso4SegundaParte;

public class Car {

	private int speed;
	private double regularPrice;
	private String color;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSalePrice() {
		return this.regularPrice;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + ", SalePrice="
				+ getSalePrice() + "]";
	}

	

	
}
