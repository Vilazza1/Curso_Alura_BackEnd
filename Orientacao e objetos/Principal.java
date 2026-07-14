
public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Devoradores De Estrelas";
        meuFilme.anoDeLancamento = 2026;
        meuFilme.duracao = 156;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacao);
        System.out.println(meuFilme.notaDoFilme);
        System.out.println(meuFilme.mediaDasNotas());
        meuFilme.somaDasAvaliacao = 10;
        meuFilme.notaDoFilme = 1;
        System.out.println(meuFilme.mediaDasNotas());

    }
}
