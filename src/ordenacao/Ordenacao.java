package ordenacao;

import gerenciador.Musica;

import java.util.*;

public class Ordenacao {
    public Map<String, Musica> ordenar(Map<String, Musica> mapList, Comparator<Map.Entry<String, Musica>> comparator) {
        List<Map.Entry<String, Musica>> listaParaOrdenar = new ArrayList<>(mapList.entrySet());
        Collections.sort(listaParaOrdenar, comparator);

        Map<String, Musica> musicarOrdenadas = new LinkedHashMap<>();

        for(Map.Entry<String, Musica> entry: listaParaOrdenar){
            musicarOrdenadas.put(entry.getKey(), entry.getValue());
        }

        return musicarOrdenadas;
    }
}

