package ex5;

public class Botao {
	private int id,qtd;
	
	public Botao(int id) {
		this.id=id;
		this.qtd=count(id);
	}
	
	int count(int id) {
		if(this.id>12) {
			return 6;
		}else {
			return 4;
		}
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}
