package ex5;

public class Main {

	public static void main(String[] args) {
		Fogao fg1=new Fogao(12,"Preto","Vidro");
		System.out.println("Status fogao: "+fg1.getAqc().works(fg1.getId()));
		System.out.println("Aquecimento máximo: "+fg1.getAqc().aquecmax(fg1.getId()));
		System.out.println("Aquecimento máximo do forno: "+fg1.getFn().aquecmax(fg1.getId()));
		System.out.println("Cor do painel: "+fg1.getPn().validate(fg1.getColor()));
		System.out.println("Quantidade de botoes do fogão: "+fg1.getPn().getBt().count(fg1.getId()));
		System.out.println("Material da tampa: "+fg1.getTm().getMaterial());
		
		System.out.println("");
		Fogao fg2=new Fogao(35,"Branco","Plástico");
		System.out.println("Status fogao: "+fg2.getAqc().works(fg2.getId()));
		System.out.println("Aquecimento máximo: "+fg2.getAqc().aquecmax(fg2.getId()));
		System.out.println("Aquecimento máximo do forno: "+fg2.getFn().aquecmax(fg2.getId()));
		System.out.println("Cor do painel: "+fg2.getPn().validate(fg2.getColor()));
		System.out.println("Quantidade de botoes do fogão: "+fg2.getPn().getBt().count(fg2.getId()));
		System.out.println("Material da tampa: "+fg2.getTm().getMaterial());
	}
}
