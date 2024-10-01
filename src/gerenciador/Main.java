package gerenciador;

import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GerenciadorPlaylists gerenciadorPlaylists = new GerenciadorPlaylists();

        gerenciadorPlaylists.criarPlaylist("Español, yo hablo");
        gerenciadorPlaylists.criarPlaylist("Brasileiras");
        gerenciadorPlaylists.criarPlaylist("Musicas para relaxar");

        gerenciadorPlaylists.listarPlaylists();

        // MUSICAS PARA RELAXAR

        Playlist musicasParaRelaxar = gerenciadorPlaylists.acessarPlaylist("Musicas para relaxar");

        musicasParaRelaxar.adicionarMusica("musicaMyWay", new Musica("My Way", Arrays.asList("Limp Bizkit"), 4.33));
        musicasParaRelaxar.adicionarMusica("musicaBeware", new Musica("Beware", Arrays.asList("Deftones"), 6.00));
        musicasParaRelaxar.adicionarMusica("musicaBoom", new Musica("Boom!", Arrays.asList("System Of A Down"), 2.15));
        musicasParaRelaxar.adicionarMusica("musicaSevenWords", new Musica("7 words", Arrays.asList("Deftones"), 3.44));
        musicasParaRelaxar.adicionarMusica("musicaFallingAwayFromMe", new Musica("Falling Away From Me", Arrays.asList("Korn"), 4.30));

        musicasParaRelaxar.listarMusicas();

        Map<String, Musica> musicasOrdenadasPorTitulo = musicasParaRelaxar.ordenarPlaylistUsandoTitulo();
        musicasParaRelaxar.listarMusicasRecebendoLista(musicasOrdenadasPorTitulo, "TITULO");

        // ESPANOL YO HABLO

        Playlist espanholYoHablo = gerenciadorPlaylists.acessarPlaylist("Español, yo hablo");

        espanholYoHablo.adicionarMusica("musicaLaPatrulla", new Musica("LA PATRULLA", Arrays.asList("Peso Plumma", "Neton Vega"), 2.11));
        espanholYoHablo.adicionarMusica("musicaPunto40", new Musica("PUNTO 40", Arrays.asList("Rauw Alejandro", "Baby Rasta"),  3.11));
        espanholYoHablo.adicionarMusica("musicaCallaita", new Musica("Callaita", Arrays.asList("Bad Bunny", "Tainy"), 4.11));

        espanholYoHablo.listarMusicas();

        Map<String, Musica> musicasOrdenadasPorArtista = espanholYoHablo.ordenarPlaylistUsandoArtista();
        espanholYoHablo.listarMusicasRecebendoLista(musicasOrdenadasPorArtista, "ARTISTA");


        // BRASILEIRAS

        Playlist brasileiras = gerenciadorPlaylists.acessarPlaylist("Brasileiras");

        brasileiras.adicionarMusica("musicaAmanhecer", new Musica("Amanhecer", Arrays.asList("BK", "Nansy Silvvz", "Gigantes"),3.32));
        brasileiras.adicionarMusica("musicaVeludoMarrom", new Musica("VELUDO MARROM", Arrays.asList("Liniker"), 7.17));
        brasileiras.adicionarMusica("musicaObrigadoMainstream", new Musica("OBRIGADO MAINSTREAM", Arrays.asList("FEBEM", "CESRV"), 2.22));
        brasileiras.adicionarMusica("musicaTurmaDaDuq", new Musica("Turma da Duq", Arrays.asList("Duquesa", "Go Dassisti"), 2.23));

        brasileiras.listarMusicas();

        Map<String, Musica> musicasOrdenadasPorDuracao = brasileiras.ordenarPlaylistUsandoDuracao();
        brasileiras.listarMusicasRecebendoLista(musicasOrdenadasPorDuracao, "DURAÇÃO");

    }
}
