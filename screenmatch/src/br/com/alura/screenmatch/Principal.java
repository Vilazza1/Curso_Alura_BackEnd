package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Devoradores De Estrelas");
        meuFilme.setAnoDeLancamento(2026);;
        meuFilme.setDuracao(156);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getNotaDoFilme());

        System.out.println(meuFilme.mediaDasNotas());

    }
}
