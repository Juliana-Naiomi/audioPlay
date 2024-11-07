package br.com.junaiomi.audioplay.modelos;

public class Musicas extends Audio{
    private String generos;
    private String album;
    private String artista;

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 200){
            return 10;
        } else {
            return 7;
        }
    }
}
