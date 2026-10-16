package Modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.getTotalReproducoes();
    }

    public void exibirInfos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Total de Reproduções: " + totalReproducoes);
        System.out.println("Curtida: : " + totalCurtidas);

    }
}
