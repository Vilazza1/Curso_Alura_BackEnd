package br.com.alura.screenmatch.modelos;

import br.com.alura.calculos.Classicavel;

public class Episodio implements Classicavel {

    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisulizacao;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public int getTotalVisulizacao() {
        return totalVisulizacao;
    }

    public void setTotalVisulizacao(int totalVisulizacao) {
        this.totalVisulizacao = totalVisulizacao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Serie getSerie() {
        return serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisulizacao > 100) {
            return 4;
        } else {
            return 0;
        }
    }
}
