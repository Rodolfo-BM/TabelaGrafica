package tabelagrafica;

import java.util.Arrays;
import java.util.List;

public class Discreta {
    //Atributos.
    private int[] fi, Fi;
    private double[] Xi, fr, Fr;
   
    //Construtores.
    public Discreta(List roll){
        //Declaração de variaveis.
        List<String> aux;
        aux = roll;
        
        //Criação e preenchimento do Array Xi.
        for (int i = 0; i < aux.size(); i++) {
            for (int j = 0; j < aux.size(); j++) {
                if(aux.get(i).equalsIgnoreCase(aux.get(j))) aux.remove(aux.get(j));
            }
        }
        Xi = new double[aux.size()];
        for (int i = 0; i < aux.size(); i++) {
            Xi[i] = Double.parseDouble(aux.get(i));
        }
        Arrays.sort(Xi);
        
        //Criação dos outros valores da tabela baseados no tamanho de Xi.
        fi = new int[Xi.length];
        Fi = new int[Xi.length];
        fr = new double[Xi.length];
        Fr = new double[Xi.length];
    
        //Preenchimento dos outros valores da tabela
        //fi
        for (int i = 0; i < Xi.length; i++) {
            for (int j = 0; j < roll.size(); j++) {
                if(roll.get(j).equals(Xi[i])){
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
