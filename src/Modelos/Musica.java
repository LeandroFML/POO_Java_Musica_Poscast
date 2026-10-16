package Modelos;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 2000){
            return 10;
        }else{
            return 7;
        }

    }
    public void exibirInfosMusica() {
        System.out.println("****MUSICA****");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Total de Reproduções: " + getTotalReproducoes());
        System.out.println("Curtida: : " + getTotalCurtidas());
        System.out.println("ALbum: " + getAlbum());
        System.out.println("Cantor: " + getCantor());
        System.out.println("Genero: " + getGenero());

    }


}
