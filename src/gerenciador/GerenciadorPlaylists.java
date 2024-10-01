package gerenciador;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorPlaylists {
    private HashMap<String, Playlist> playlists;

    public GerenciadorPlaylists() {
        this.playlists = new HashMap<>();
    }

    public void criarPlaylist(String titulo){
        this.playlists.put(titulo, new Playlist(titulo));
    }

    public Playlist acessarPlaylist(String titulo){
        return this.playlists.get(titulo);
    }

    public void listarPlaylists() {
        System.out.println("PLAYLISTS: ");

        if(!this.playlists.isEmpty()){
            for(Map.Entry<String, Playlist> playlist: this.playlists.entrySet()){
                System.out.println(playlist.getValue().getTitulo());
            }
        }
        System.out.println("\n");
    }

}
