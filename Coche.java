
public class Coche {
	private String matricula;
	private String marca;
	private int numeroRueda;
	


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumeroRueda() {
		return numeroRueda;
	}
	public void setNumeroRueda(int numeroRueda) {
		this.numeroRueda = numeroRueda;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public Coche(String matricula, String marca, int numeroRueda) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.numeroRueda = numeroRueda;
	}
	public Coche() {
		super();
	}
	
	
}
