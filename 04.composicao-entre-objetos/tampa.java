package ex5;

public class Tampa {
	private int id;
	private String material;
	
	public Tampa(int id,String material) {
		this.id=id;
		this.material=validate(material);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	String validate(String material) {
		if(this.material!="Vidro" || this.material!="Acrílico") {
			return "Indisponível neste material.";
		}else {
			return material;
		}
	}
}
