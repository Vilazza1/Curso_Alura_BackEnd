
public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int notaDoFilme;
    int duracao;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano De Lancamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacao += nota;
        notaDoFilme++;
    }

    double mediaDasNotas() {
        return somaDasAvaliacao / notaDoFilme;
    }
}
