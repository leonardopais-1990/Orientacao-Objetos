package exe;

public class HomemAranha extends Heroi {

	private int numMortesTioBen;
	
	public HomemAranha(String nome, String codinome, 
			String universo, int numMortesTioBen) {
		super(nome, codinome, universo);
		this.numMortesTioBen = numMortesTioBen;
	}

	public int getNumMortesTioBen() {
		return numMortesTioBen;
	}

	public void setNumMortesTioBen(int numMortesTioBen) {
		this.numMortesTioBen = numMortesTioBen;
	}

	@Override
	public void executarPoder() {
		System.out.println("Homem Aranha está soltando teia no inimigo!");
		
	}
}
