package exemplo;

public class Main {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno(124563, "Seilá da Silva", false);
        aluno1.imprimir();

        System.out.println("--------------------------------------------------");

        AlunoGrad aluno2 = new AlunoGrad(123456, "Roberto Williams", true, 7.7);
        aluno2.imprimir();

        System.out.println("--------------------------------------------------");

        AlunoPosGrad aluno3 = new AlunoPosGrad(654321, "Fulano Fuleiro", true, "Rogerio Skylab", "Crítica da Faculdade do C#");
        aluno3.imprimir();
    }
}
