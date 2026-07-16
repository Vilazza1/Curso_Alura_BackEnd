package br.com.alura.screenmatch.modelos;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int notaDoFilme;
    private int duracao;

    public int getNotaDoFilme() {
        return notaDoFilme;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
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
