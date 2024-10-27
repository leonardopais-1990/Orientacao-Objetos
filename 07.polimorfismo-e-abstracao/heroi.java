package exe;

public abstract class Heroi {

	private String nome;
	private String codinome;
	private String universo;
	
	public Heroi(String nome, String codinome, String universo) {
		this.nome = nome;
		this.codinome = codinome;
		this.universo = universo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodinome() {
		return codinome;
	}

	public void setCodinome(String codinome) {
		this.codinome = codinome;
	}

	public String getUniverso() {
		return universo;
	}

	public void setUniverso(String universo) {
		this.universo = universo;
	}
	
	public abstract void executarPoder();
	
	
}
