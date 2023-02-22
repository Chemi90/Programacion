package Unidad4Caso4;

public class ProductoCongelado extends Producto {

	private String TemperaturaCongelacionRecomendada;

	public String getTemperaturaCongelacionRecomendada() {
		return TemperaturaCongelacionRecomendada;
	}

	public void setTemperaturaCongelacionRecomendada(String temperaturaCongelacionRecomendada) {
		TemperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	public ProductoCongelado(String fecha_caducidad, String numero_lote, String temperaturaCongelacionRecomendada) {
		super(fecha_caducidad, numero_lote);
		TemperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	public ProductoCongelado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoCongelado(String fecha_caducidad, String numero_lote) {
		super(fecha_caducidad, numero_lote);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoCongelado [TemperaturaCongelacionRecomendada="
				+ TemperaturaCongelacionRecomendada + "]";
	}

}
