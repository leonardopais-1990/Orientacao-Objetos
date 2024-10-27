package ex5;

public class Forno {
	private int id;
	private double aquecimentomin,aquecimentomax,tamanho;
	
	public Forno(int id) {
		this.id=id;
		this.aquecimentomin=aquecmin(id);
		this.aquecimentomax=aquecmax(id);
		this.tamanho=tam(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public double getAquecimentomin() {
		return aquecimentomin;
	}
	public void setAquecimentomin(double aquecimentomin) {
		this.aquecimentomin = aquecimentomin;
	}

	public double getAquecimentomax() {
		return aquecimentomax;
	}
	public void setAquecimentomax(double aquecimentomax) {
		this.aquecimentomax = aquecimentomax;
	}

	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	double aquecmin(int id) {
		if(this.id>20) {
			return 100.65;
		}else {
			return 84.89;
		}
	}
	
	double aquecmax(int id) {
		if(this.id>20) {
			return 285.63;
		}else {
			return 212.15;
		}
	}
	
	double tam(int id) {
		if(this.id>9) {
			return 33.12;
		}else {
			return 27.80;
		}
	}
}
