
public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Devoradores De Estrelas";
        meuFilme.anoDeLancamento = 2026;
        meuFilme.duracao = 156;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
    }
}
