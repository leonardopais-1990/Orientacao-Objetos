package exe;

public class Batman extends Heroi implements IParceiro {

	private String endBatCaverna;
	
	public Batman(String nome, String codinome, 
			String universo, String endBatCaverna) {
		super(nome, codinome, universo);
		this.endBatCaverna = endBatCaverna;
		
	}	
	
	public String getEndBatCaverna() {
		return endBatCaverna;
	}
	
	public void setEndBatCaverna(String endBatCaverna) {
		this.endBatCaverna = endBatCaverna;
	}

	@Override
	public void executarPoder() {
		System.out.println("Batman está tacando pataco de dinheiro no inimigo!");	
	}

	@Override
	public void exibirNomeParceiro() {
		System.out.println("Robin");		
	}

	@Override
	public void executarPoderParceiro() {
		System.out.println("Robin atirou o batarangue no inimigo!");
		
	}	
}
