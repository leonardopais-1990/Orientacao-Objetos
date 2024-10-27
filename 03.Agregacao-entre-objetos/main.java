package class5;

public class Main {
	public static void main(String[] args) {
		Jogador Pele = new Jogador(1,"Pele");
		Jogador Xuxa = new Jogador(2,"Xuxa");
		Tecnico Didi = new Tecnico("Didi");
		Estadio FHO = new Estadio("FHO",13607.339);
		Presidente Leila = new Presidente("Leila",59);
		
		Time Varzea = new Time("Varzea",Pele);
		System.out.println("Nome Time: " + Varzea.getNmTime());
		System.out.println("Nome Tecnico: " + Didi.getNmTecnico());
		System.out.println("Nome Presidente: " + Leila.getNmPresidente());
		System.out.println("Idade Presidente: " + Leila.getAgePresidente());		
		
		System.out.println("");		
		System.out.println("Nome Jogador: " + Pele.getNmJogador());
		System.out.println("Id Jogador: " + Pele.getIdJogador());	
		
		System.out.println("");	
		System.out.println("Nome Jogador: " + Xuxa.getNmJogador());
		System.out.println("Id Jogador: " + Xuxa.getIdJogador());
		
		System.out.println("");	
		System.out.println("Nome do Estádio: " + FHO.getNmEstadio());
		System.out.println("CEP do Estádio: " + FHO.getCepEstadio());		
	}

}
