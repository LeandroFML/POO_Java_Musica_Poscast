package Modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        }else{
            return 8;
            }

    }

    public void exibirInfosPodcast() {
        System.out.println("****PODCAST****");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Total de Reproduções: " + getTotalReproducoes());
        System.out.println("Curtida: : " + getTotalCurtidas());
        System.out.println("Apresentador: : " + getApresentador());
        System.out.println("Descrição: " + getDescricao());


    }
}
