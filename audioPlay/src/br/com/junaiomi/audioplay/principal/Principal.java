package br.com.junaiomi.audioplay.principal;

import br.com.junaiomi.audioplay.modelos.MinhasPreferidas;
import br.com.junaiomi.audioplay.modelos.Musicas;
import br.com.junaiomi.audioplay.modelos.Podcasts;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Anunciação");
        minhaMusica.setArtista("Zé Ramalho");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("Platitudes");
        meuPodcast.setApresentador("Leandro Karnal");

        for (int i = 0; i < 1500; i++) {
            meuPodcast.reproduz();            
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}