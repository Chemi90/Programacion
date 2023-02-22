package Unidad4Caso4;

public class ProductoFresco extends Producto {

	private String FechaEnvasado;
	private String PaisOrigen;

	public String getFechaEnvasado() {
		return FechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		FechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return PaisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}

	public ProductoFresco(String fecha_caducidad, String numero_lote, String fechaEnvasado, String paisOrigen) {
		super(fecha_caducidad, numero_lote);
		FechaEnvasado = fechaEnvasado;
		PaisOrigen = paisOrigen;
	}

	public ProductoFresco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoFresco(String fecha_caducidad, String numero_lote) {
		super(fecha_caducidad, numero_lote);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoFresco [FechaEnvasado=" + FechaEnvasado + ", PaisOrigen=" + PaisOrigen + "]";
	}

}
