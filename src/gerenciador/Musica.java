package gerenciador;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Musica {
    private String titulo;
    private LinkedHashSet<String> artistas = new LinkedHashSet<>();
    private double duracao;

    public Musica(String titulo, List<String> artistas, double duracao) {
        this.titulo = titulo;
        this.artistas.addAll(artistas);
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public LinkedHashSet<String> getArtistas() {
        return artistas;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + titulo + '\'' +
                ", artistas=" + artistas +
                ", duracao=" + duracao +
                '}';
    }
}

class OrdenarMusicasUsandoTitulo implements Comparator<Map.Entry<String, Musica>>{
    @Override
    public int compare(Map.Entry<String, Musica> musicaUm, Map.Entry<String, Musica> musicaDois){
        return musicaUm.getValue().getTitulo().compareToIgnoreCase(musicaDois.getValue().getTitulo());
    }
}

class OrdenarMusicasUsandoArtista implements Comparator<Map.Entry<String, Musica>>{
    @Override
    public int compare(Map.Entry<String, Musica> musicaUm, Map.Entry<String, Musica> musicaDois){
        return musicaUm.getValue().getArtistas().getFirst().compareToIgnoreCase(musicaDois.getValue().getArtistas().getFirst());
    }
}

class OrdenarMusicasUsandoDurancao implements Comparator<Map.Entry<String, Musica>>{
    @Override
    public int compare(Map.Entry<String, Musica> musicaUm, Map.Entry<String, Musica> musicaDois){
        return Double.compare(musicaUm.getValue().getDuracao(), musicaDois.getValue().getDuracao());
    }
}