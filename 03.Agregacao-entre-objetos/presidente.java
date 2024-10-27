package class5;

public class Presidente {
	private String NmPresidente;
	private int AgePresidente;
	
	public Presidente(String NmPresidente,int AgePresidente){
		this.NmPresidente=NmPresidente;
		this.AgePresidente=AgePresidente;
	}

	public String getNmPresidente() {
		return NmPresidente;
	}
	public void setNmPresidente(String nmPresidente) {
		NmPresidente = nmPresidente;
	}

	public int getAgePresidente() {
		return AgePresidente;
	}
	public void setAgePresidente(int agePresidente) {
		AgePresidente = agePresidente;
	}	
	
}
