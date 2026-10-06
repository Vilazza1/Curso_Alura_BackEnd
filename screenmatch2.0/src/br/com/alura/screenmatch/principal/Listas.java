package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(10);

        var filmeDoVinicius = new Filme("Dogville", 2003);
        filmeDoVinicius.avalia(4);

        Serie lost = new Serie("Lost", 200);

        List<Titulo> lista = new LinkedList<>();

        lista.add(filmeDoVinicius);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo Gustavo");
        buscaPorArtista.add("Jim Carrey");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");

        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getNome));

        System.out.println("Ordem por Nome:");
        System.out.println(lista);
    }
}