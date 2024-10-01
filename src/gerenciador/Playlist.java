package gerenciador;

import ordenacao.Ordenacao;

import java.util.*;

public class Playlist {
    private String titulo;
    private LinkedHashMap<String, Musica> musicas;

    public Playlist(String titulo) {
        this.titulo = titulo;
        this.musicas = new LinkedHashMap<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarMusica(String key, Musica musica){
        this.musicas.put(key, musica);
    }

    public void removerMusica(String key){
        if(!this.musicas.isEmpty()){
            this.musicas.remove(key);
        }
    }

    public void listarMusicas(){
        System.out.println("PLAYLIST: " + this.titulo);

        for(Map.Entry<String, Musica> entry: this.musicas.entrySet()){
            Musica musica = entry.getValue();
            System.out.println(musica.getTitulo() + " - " + entry.getValue().getArtistas() + " - " + entry.getValue().getDuracao());
        }

        System.out.println("\n");
    }

    public void listarMusicasRecebendoLista(Map<String, Musica> musicas, String regraOrdenacao){
        System.out.println("PLAYLIST: " + this.titulo + ", ordenada por: " + regraOrdenacao );

        for(Map.Entry<String, Musica> entry: musicas.entrySet()){
            Musica musica = entry.getValue();
            System.out.println(musica.getTitulo() + " - " + entry.getValue().getArtistas() + " - " + entry.getValue().getDuracao());
        }

        System.out.println("\n");
    }

    // ORDENAÇÃO - TITULO, ARTISTA[1], DURAÇÃO
    public Map<String, Musica> ordenarPlaylistUsandoTitulo(){
        Ordenacao ordenacao = new Ordenacao();
        return ordenacao.ordenar(this.musicas, new OrdenarMusicasUsandoTitulo());
    }

    public Map<String, Musica> ordenarPlaylistUsandoArtista(){
        Ordenacao ordenacao = new Ordenacao();
        return ordenacao.ordenar(this.musicas, new OrdenarMusicasUsandoArtista());
    }

    public Map<String, Musica> ordenarPlaylistUsandoDuracao(){
        Ordenacao ordenacao = new Ordenacao();
        return ordenacao.ordenar(this.musicas, new OrdenarMusicasUsandoDurancao());
    }
}
