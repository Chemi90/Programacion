package Unidad4Caso4;

public class ProductoRefrigerado extends Producto {

	private String CodigoOrganismo;

	public String getCodigoOrganismo() {
		return CodigoOrganismo;
	}

	public void setCodigoOrganismo(String codigoOrganismo) {
		CodigoOrganismo = codigoOrganismo;
	}

	public ProductoRefrigerado(String fecha_caducidad, String numero_lote, String codigoOrganismo) {
		super(fecha_caducidad, numero_lote);
		CodigoOrganismo = codigoOrganismo;
	}

	public ProductoRefrigerado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoRefrigerado(String fecha_caducidad, String numero_lote) {
		super(fecha_caducidad, numero_lote);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoRefrigerado [CodigoOrganismo=" + CodigoOrganismo + "]";
	}

}
