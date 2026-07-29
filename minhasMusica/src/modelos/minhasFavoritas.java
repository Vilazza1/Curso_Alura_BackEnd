package modelos;

public class minhasFavoritas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " melhor musica do momento");
        } else {
            System.out.println(audio.getTitulo() + " mais ouvidas");
        }
    }
}
