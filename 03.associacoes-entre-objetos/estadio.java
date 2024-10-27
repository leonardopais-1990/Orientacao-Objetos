package class5;

public class Estadio {
	private String NmEstadio;
	private double CepEstadio;
	
	public Estadio(String NmEstadio, double CepEstadio){
		this.NmEstadio=NmEstadio;
		this.CepEstadio=CepEstadio;
	}

	public String getNmEstadio() {
		return NmEstadio;
	}
	public void setNmEstadio(String nmEstadio) {
		NmEstadio = nmEstadio;
	}

	public double getCepEstadio() {
		return CepEstadio;
	}
	public void setCepEstadio(double cepEstadio) {
		CepEstadio = cepEstadio;
	}
	
}
