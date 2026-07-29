package principal;

import modelos.Musica;
import modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica minMusica = new Musica();
        minMusica.setTitulo("Forever");
        minMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minMusica.curti();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Vilazza");
        meuPodcast.setHost("Vilaça");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curti();
        }
    }
}
