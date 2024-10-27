package exemplo;

public class AlunoGrad extends Aluno {
    private double media;

    public AlunoGrad(int ra, String nome, boolean matriculado, double media) {
        super(ra, nome, matriculado);
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.printf("Média: %.1f\n", this.media);
    }
}
