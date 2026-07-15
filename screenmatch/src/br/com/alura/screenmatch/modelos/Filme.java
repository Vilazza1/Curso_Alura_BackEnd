package br.com.alura.screenmatch.modelos;

public class Filme {

    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int notaDoFilme;
    public int duracao;

    public int getNotaDoFilme() {
        return notaDoFilme;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacao += nota;
        notaDoFilme++;
    }

    public double mediaDasNotas() {
        return somaDasAvaliacao / notaDoFilme;
    }
}