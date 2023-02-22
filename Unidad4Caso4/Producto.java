package Unidad4Caso4;

public class Producto {

	private String fecha_caducidad;
	private String numero_lote;

	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public String getNumero_lote() {
		return numero_lote;
	}

	public void setNumero_lote(String numero_lote) {
		this.numero_lote = numero_lote;
	}

	public Producto(String fecha_caducidad, String numero_lote) {
		super();
		this.fecha_caducidad = fecha_caducidad;
		this.numero_lote = numero_lote;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Producto [fecha_caducidad=" + fecha_caducidad + ", numero_lote=" + numero_lote + "]";
	}

}
