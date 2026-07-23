package br.com.alura.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    // public void inclui(Filme f) {
    //     tempoTotal += f.getDuracao();
    // }
    // public void inclui(Serie f) {
    //     tempoTotal += f.getDuracao();
    // }
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracao();
    }
}
