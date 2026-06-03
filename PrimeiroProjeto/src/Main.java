public class Main {
    public static void main(String[] args){
        System.out.println("Esse é o Screem Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano De Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        // Media calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.printf("Media: %.2f%n", media);
        String sinopse= """
        Filme de aventura com galã dos anos 80
        Muito Bom!
        Ano de lançamento
        """ + anoDeLancamento;
        System.out.println("Sinopse:\n" + sinopse);

        int classficacao = (int) (media / 2);
        System.out.println(classficacao);

    }
}
