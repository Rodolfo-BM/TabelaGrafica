package tabelagrafica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Roll {
    public static List ler(String dados){
        //Declaração das variaveis que serão utilizadas no metodo;
        String[] dadosDivididos;
        List lista = new ArrayList<>();
        
        //Separação dos dados e transformação em ArrayList<Elemento>;
        dadosDivididos = dados.split(";");
        for (int i = 0; i < dadosDivididos.length; i++) {
            lista.add(dadosDivididos[i]);
        }
        return lista;
    }
}
