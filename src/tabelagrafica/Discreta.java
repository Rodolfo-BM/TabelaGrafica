package tabelagrafica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Discreta {
    //Atributos.
    private int[] fi, Fi;
    private double[] Xi, fr, Fr;
   
    //Construtores.
    public Discreta(List roll){
        //Declaração de variaveis.
        List<String> aux = roll;
        for (String item : aux) {
            item = item.trim();
        }
        List<String> aux2 = new ArrayList<>();
//        aux2.add(aux.get(0));
        boolean achei=false;
        
        //Criação e preenchimento do Array Xi.
        for (String primeiro : aux) {
            achei = false;
            for (String segundo : aux2) {
                if(primeiro.equalsIgnoreCase(segundo)) achei = true;
            }
            if(!achei) aux2.add(primeiro);
        }
        
        Xi = new double[aux2.size()];
        int z=0;
        for (String item : aux2) {
            Xi[z] = Double.parseDouble(item);
            z++;
        }
        Arrays.sort(Xi);
        
        //Criação dos outros valores da tabela baseados no tamanho de Xi.
        fi = new int[Xi.length];
        Fi = new int[Xi.length];
        fr = new double[Xi.length];
        Fr = new double[Xi.length];
    
        //Preenchimento dos outros valores da tabela
        for (int i = 0; i < Xi.length; i++) {
            fi[i] = 0;
            Fi[i] = 0;
            fr[i] = 0;
            Fr[i] = 0;
        }
        //fi
        aux = roll;
        for (int i = 0; i < Xi.length; i++) {
            for (int j = 0; j < roll.size(); j++) {
                if(Xi[i] == Double.parseDouble(aux.get(j))){
                    fi[i]++;
                } 
            }
        }
        //Fi
        Fi = fi;
        for (int i = 1; i < Xi.length; i++) {
            Fi[i] = Fi[i] + Fi[i-1];
        }
        //fr
        for (int i = 0; i < Xi.length; i++) {
            fr[i] = fi[i]/roll.size()*100;
        }
        //Fr
        Fr = fr;
        for (int i = 1; i < Xi.length; i++) {
            Fr[i] = Fr[i] + Fr[i-1];
        }
    }
    
    //Metodos acessores.
    public int[] getfi() {
        return fi;
    }
    public void setfi(int[] fi) {
        this.fi = fi;
    }
    public int[] getFi() {
        return Fi;
    }
    public void setFi(int[] Fi) {
        this.Fi = Fi;
    }
    public double[] getXi() {
        return Xi;
    }
    public void setXi(double[] Xi) {
        this.Xi = Xi;
    }
    public double[] getfr() {
        return fr;
    }
    public void setfr(double[] fr) {
        this.fr = fr;
    }
    public double[] getFr() {
        return Fr;
    }
    public void setFr(double[] Fr) {
        this.Fr = Fr;
    }
    @Override
    public String toString() {
        return "Discreta{" + "fi=" + fi + ", Fi=" + Fi + ", Xi=" + Xi + ", fr=" + fr + ", Fr=" + Fr + '}';
    }
}
