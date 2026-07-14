
public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacao;
    int notaDoFilme;
    int duracao;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano De Lancamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacao += nota;
        notaDoFilme++;
    }

    double mediaDasNotas(){
        return  somaDasAvaliacao / notaDoFilme;
    }
}
