package Unidad8Caso1;

public class telefonoFijo extends telefono{

	private String marca;
	private String modelo;

	public telefonoFijo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public telefonoFijo(int llamar, int recibirllamada) {
		super(llamar, recibirllamada);
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	private void setMarca() {
		this.marca = "Panasonic";
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo() {
		this.modelo = "KX-TGE310SPB";
	}

	@Override
	public String toString() {
		return "telefonoFijo [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
