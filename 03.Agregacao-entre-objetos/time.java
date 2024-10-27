package class5;

public class Time {
	private String NmTime;
	private Jogador Jogadorn1;
	
	public Time(String NmTime, Jogador Jogadorn1){
		this.NmTime=NmTime;
		this.Jogadorn1=Jogadorn1;
	}

	public String getNmTime() {
		return NmTime;
	}
	public void setNmTime(String nmTime) {
		NmTime = nmTime;
	}

	public Jogador getJogadorn1() {
		return Jogadorn1;
	}
	public void setJogadorn1(Jogador jogadorn1) {
		Jogadorn1 = jogadorn1;
	}
	
	
}
