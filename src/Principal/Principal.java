package Principal;

import Modelos.MinhasPreferidas;
import Modelos.Musica;
import Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();
        MinhasPreferidas prefeirdas = new MinhasPreferidas();

        minhaMusica.setTitulo("O descobridor dos 7 mares");
        minhaMusica.setTotalCurtidas(90);
        minhaMusica.setTotalReproducoes(3000);
        minhaMusica.setCantor("Tim Maia");
        minhaMusica.setAlbum("O descobridor dos 7 mares");
        minhaMusica.setGenero("MPB");
        minhaMusica.exibirInfosMusica();
        prefeirdas.inclui(minhaMusica);

        System.out.println("------------------------------------------------------");

        meuPodcast.setTitulo("Podpah");
        meuPodcast.setTotalCurtidas(87);
        meuPodcast.setTotalReproducoes(3400);
        meuPodcast.setApresentador("Igão");
        meuPodcast.setDescricao("Podcast com tom de humor e convidados legais");
        meuPodcast.exibirInfosPodcast();
        prefeirdas.inclui(meuPodcast);


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();

        }



        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();

        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();

        }




    }
}
