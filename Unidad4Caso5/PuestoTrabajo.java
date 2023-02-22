package Unidad4Caso5;

public class PuestoTrabajo {

	private String codigo;
	private String descripcion;
	private double SueldoBruto;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getSueldoBruto() {
		return SueldoBruto;
	}
	public void setSueldoBruto(double sueldoBruto) {
		SueldoBruto = sueldoBruto;
	}
	public PuestoTrabajo(String codigo, String descripcion, double sueldoBruto) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		SueldoBruto = sueldoBruto;
	}
	public PuestoTrabajo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PuestoTrabajo [codigo=" + codigo + ", descripcion=" + descripcion + ", SueldoBruto=" + SueldoBruto
				+ "]";
	}
	
	
	
}
