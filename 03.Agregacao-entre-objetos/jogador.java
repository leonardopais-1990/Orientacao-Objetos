package class5;

public class Jogador {
	private int IdJogador;
	private String NmJogador;
	
	public Jogador(int IdJogador, String NmJogador){
		this.IdJogador=IdJogador;
		this.NmJogador=NmJogador;
	}

	public int getIdJogador() {
		return IdJogador;
	}
	public void setIdJogador(int idJogador) {
		IdJogador = idJogador;
	}

	public String getNmJogador() {
		return NmJogador;
	}
	public void setNmJogador(String nmJogador) {
		NmJogador = nmJogador;
	}
	
}
