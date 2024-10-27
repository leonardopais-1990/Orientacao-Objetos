package exercicio;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua X", "Bairro Y", "Araras",
			"SP", "13600-000");
		
		Proprietario proprietario = new Proprietario("Alefe", "1111111111", 
				"22222222", endereco);
		
		Marca marca = new Marca("Fiat", 200, 1899, 1);
		
		Carro carro = new Carro("Uno", "Branco", 1997, marca,
			"ABCDGKJASASLK", proprietario, 220, 2, true, 5, false,2);
		
		System.out.println("-----------------------");
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Proprietario: " + carro.getProprietario().getNome());
		System.out.println("Cidade do Proprietario: " + carro.getProprietario().getEndereco().getCidade());
		System.out.println(carro.aumentarMarcha());
		System.out.println(carro.acelerar());
		System.out.println(carro.acelerar());
		System.out.println(carro.acelerar());
		System.out.println(carro.acelerar());
		System.out.println(carro.aumentarMarcha());
		System.out.println(carro.reduzMarcha());
		System.out.println(carro.reduzMarcha());
		System.out.println(carro.reduzMarcha());
		System.out.println(carro.reduzMarcha());
		System.out.println(carro.frear());
		System.out.println(carro.reduzMarcha());	

	}

}
