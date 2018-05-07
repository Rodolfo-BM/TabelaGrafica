package tabelagrafica;

import java.util.Arrays;

public class Discreta {
    //Atributos.
    private int[] Xi, fi, Fi;
    private float[] fr, Fr;
   
    //Construtores.
    public Discreta(String[] roll){
        //Declaração de variaveis.
        int cont=0;
        
        //Criação e preenchimento do ArrayList Xi.
        for (int i = 1; i < roll.length; i++) {
            cont++;
            if(roll[i] == roll[i-1]){
                cont--;
            }
        }
        Xi = new int[cont];
        
        Arrays.sort(Xi);
        
        //Criação dos outros valores da tabela baseados no tamanho de Xi.
        fi = new int[Xi.length];
        Fi = new int[Xi.length];
        fr = new float[Xi.length];
        Fr = new float[Xi.length];
    
        //Preenchimento dos outros valores da tabela
        int f = 0;
        fi[0] = 1; Fi[0] = 1; Fr[0] =0;
        for (int i = 1; i < roll.length; i++) {
            if(roll[i].equals(roll[i-1])){
                fi[f]++;
                Fi[f]++;
            }else{
                fr[f] = ((float)fi[f]/(float)roll.length)*100f;
                Fr[f] = fr[f];
                if(f != 0) Fr[f] = Fr[f]+Fr[f-1];
//                f++;
//                fi[f] = 1;
//                Fi[f] = Fi[f-1] + 1;
            }
        }
        fr[f] = ((float)fi[f]/(float)roll.length)*100;
        Fr[f] = fr[f];
        if(f != 0) Fr[f] = Fr[f]+Fr[f-1];
    }
    
    //Metodos acessores.
    public int[] getXi() {
        return Xi;
    }
    public void setXi(int[] Xi) {
        this.Xi = Xi;
    }
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
    public float[] getfr() {
        return fr;
    }
    public void setfr(float[] fr) {
        this.fr = fr;
    }
    public float[] getFr() {
        return Fr;
    }
    public void setFr(float[] Fr) {    
        this.Fr = Fr;
    }
    @Override
    public String toString() {
        return "Discreta{" + "Xi=" + Xi + ", fi=" + fi + ", Fi=" + Fi + ", fr=" + fr + ", Fr=" + Fr + '}';
    }
}
