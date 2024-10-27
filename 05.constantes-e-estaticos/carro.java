package exercicio;

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private Marca marca;
	private String chassi;
	private Proprietario proprietario;
	private final int velocidadeMaxima;
	private int velocidadeAtual;
	private int nrPortas;
	private boolean tetoSolar;
	private final int nrMarchas;
	private int marchaAtual;
	private boolean cambioAutomatico;
	private double volumeCombustivel;
	
	public Carro(String modelo, String cor, int ano, Marca marca,
			String chassi, Proprietario proprietario, int velocidadeMaxima,
			int nrPortas, boolean tetoSolar, int nrMarchas, boolean cambioAutomatico,
			double volumeCombustivel) {
		
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.proprietario = proprietario;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = 0;
		this.nrPortas = nrPortas;
		this.tetoSolar = tetoSolar;
		this.nrMarchas = nrMarchas;
		this.marchaAtual = 0;
		this.cambioAutomatico = cambioAutomatico;
		this.volumeCombustivel = volumeCombustivel;	
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNrPortas() {
		return nrPortas;
	}

	public void setNrPortas(int nrPortas) {
		this.nrPortas = nrPortas;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public double getVolumeCombustivel() {
		return volumeCombustivel;
	}

	public void setVolumeCombustivel(double volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public int getNrMarchas() {
		return nrMarchas;
	}
	
	public String acelerar() {
		if(this.velocidadeAtual < this.velocidadeMaxima) {
			this.velocidadeAtual++;
		}
		
		return("Velocidade Atual: " + this.velocidadeAtual);
	}
	
	public String frear() {
		this.velocidadeAtual = 0;
		return("Velocidade Atual: " + this.velocidadeAtual);
	}
	
	public String aumentarMarcha() {
		if(this.marchaAtual < this.nrMarchas) {
			this.marchaAtual++;
		}
		return("Marcha Atual: " + this.marchaAtual);
	}
	
	public String reduzMarcha() {
		if((this.marchaAtual > 0)) {
			this.marchaAtual--;
		}else {
			if((this.marchaAtual == 0) && (this.velocidadeAtual == 0)) {				
					this.marchaAtual--;				
			}
		}		
		return("Marcha Atual: " + this.marchaAtual);
	}
	
	public String autonomiaViagem(int km) {
		return ("Autonomia : " + this.volumeCombustivel * km);
	}
	
	
}
