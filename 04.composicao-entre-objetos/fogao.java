package ex5;

public class Fogao {
	private Aquecedor aqc;
	private Painel pn;
	private Forno fn;
	private Tampa tm;
	private String color,material;
	private int id;
	
	public Fogao(int id,String color,String material) {
		this.aqc=new Aquecedor(id);
		this.pn=new Painel(id,color);
		this.fn=new Forno(id);
		this.tm=new Tampa (id,material);
	}

	public Aquecedor getAqc() {
		return aqc;
	}
	public void setAqc(Aquecedor aqc) {
		this.aqc = aqc;
	}

	public Painel getPn() {
		return pn;
	}
	public void setPn(Painel pn) {
		this.pn = pn;
	}

	public Forno getFn() {
		return fn;
	}
	public void setFn(Forno fn) {
		this.fn = fn;
	}

	public Tampa getTm() {
		return tm;
	}
	public void setTm(Tampa tm) {
		this.tm = tm;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
