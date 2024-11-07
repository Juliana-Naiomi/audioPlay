package br.com.junaiomi.audioplay.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " está entre as preferidas do AudioPlay.");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa opção para ouvir mais tarde.");
        }
    }
}
