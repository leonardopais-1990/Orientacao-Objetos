package exercicio;

public class Marca {

	private String nome;
	private int nrModelos;
	private int anoLancamento;
	private int codigo;
	
	public Marca(String nome, int modelos, int ano, int codigo) {
		this.nome = nome;
		this.nrModelos = modelos;
		this.anoLancamento = ano;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNrModelos() {
		return nrModelos;
	}

	public void setNrModelos(int nrModelos) {
		this.nrModelos = nrModelos;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
