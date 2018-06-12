package tabelagrafica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Roll {
    public static List lerLinha(String dados){
        String[] dadosDivididos;
        List lista = new ArrayList<>();
        
        dadosDivididos = dados.split(";");
        lista.addAll(Arrays.asList(dadosDivididos));
        Collections.sort(lista);
        
        return lista;
    }
    public static List lerVetor(String[] dados){
        List lista = new ArrayList<>();
        
        lista.addAll(Arrays.asList(dados));
        Collections.sort(lista);
        
        return lista;
        
    }
}
