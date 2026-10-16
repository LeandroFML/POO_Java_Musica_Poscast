import Modelos.Musica;
import Modelos.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();

        minhaMusica.setTitulo("Talvez você precise de mim");
        minhaMusica.setTotalCurtidas(90);
        minhaMusica.setTotalReproducoes(3000);
        minhaMusica.exibirInfos();
    }
}