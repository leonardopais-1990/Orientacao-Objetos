package ex5;

public class Aquecedor {
	private int id,furos;
	private double aquecimentomin,aquecimentomax;
	private boolean working;
	
	public Aquecedor(int id) {
		this.id=id;
		this.working=works(id);
		this.furos=buracos(id);
		this.aquecimentomin=aquecmin(id);
		this.aquecimentomax=aquecmax(id);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getFuros() {
		return furos;
	}
	public void setFuros(int furos) {
		this.furos = furos;
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

	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
	
	boolean works(int id) {
		if(this.id>10) {
			return true;
		}else {
			return false;
		}
	}
	
	int buracos(int id) {
		if(this.id>15) {
			return 30;
		}else {
			return 20;
		}
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
			return 174.15;
		}
	}	
}
