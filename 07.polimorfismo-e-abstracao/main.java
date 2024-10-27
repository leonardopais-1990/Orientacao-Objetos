package exe;

public class Main {

	public static void main(String[] args) {
		
		Batman batman = new Batman("Bruce Wayne", "Batman", "DC", "Alguma caverna de Gotham");
		HomemAranha homemAranha = new HomemAranha("Peter Parker", "Spiderman",
				"Marvel", 10);
		
		batman.executarPoder();
		batman.exibirNomeParceiro();
		batman.executarPoderParceiro();
		
		System.out.println("--------------");
		
		homemAranha.executarPoder();
		
	}

}
