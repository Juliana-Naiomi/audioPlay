package br.com.junaiomi.audioplay.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private double totalReproducoes;
    private double totalCurtidas;
    private int classificacao;
    private double somaClassificacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getTotalReproducoes() {
        return totalReproducoes;
    }

    public double getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void avalia(double nota){
        somaClassificacao += nota;
        classificacao++;
    }

    public double mediaAvaliacao(){
        return somaClassificacao / classificacao;    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
