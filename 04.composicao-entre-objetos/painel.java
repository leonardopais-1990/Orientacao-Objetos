package ex5;

public class Painel {
	private Botao bt;
	private String color;
	private int id;
	
	public Painel(int id,String color) {
		this.id=id;
		this.color=validate(color);
		this.bt=new Botao(id);
	}

	public Botao getBt() {
		return bt;
	}
	public void setBt(Botao bt) {
		this.bt = bt;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	String validate(String color) {
		if(this.color=="Preto" || this.color=="Branco"){
			return color;
		}else {
			return "Indisponível nesta cor";
		}
	}
}
