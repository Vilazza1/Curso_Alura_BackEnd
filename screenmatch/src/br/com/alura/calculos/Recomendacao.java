package br.com.alura.calculos;

public class Recomendacao {

    private String recomendacao;

    public static void filtra(Classicavel classicavel) {
        if (classicavel.getClassificacao() >= 4) {
            System.err.println("Está entre os preferidos do momento");
        } else if (classicavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Salvar na lista");
        }
    }
}
