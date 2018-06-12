package tabelagrafica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qualitativa {
    //Atributos.
    private int N;
    private double moda, M, MZ;
    private int[] FI, FZI;
    private double[] FR, FZR;
    private String[] XI;

//  Construtores.
    public Qualitativa() {
    }
    public Qualitativa(List roll) {
        //Declaração de variaveis.
        List<String> aux = roll;
        for (String item : aux) {
            item = item.trim();
        }
        List<String> aux2 = new ArrayList<>();
        boolean achei;
        
        //Criação e preenchimento do Array XI.
        for (String primeiro : aux) {
            achei = false;
            for (String segundo : aux2) {
                if(primeiro.equalsIgnoreCase(segundo)) achei = true;
            }
            if(!achei) aux2.add(primeiro);
        }
        
        XI = new String[aux2.size()];
        int z=0;
        for (String item : aux2) {
            XI[z] = item;
            z++;
        }
        
        Arrays.sort(XI);
        
        //Criação dos outros valores da tabela baseados no tamanho de XI.
        FI = new int[XI.length];
        FZI = new int[XI.length];
        FR = new double[XI.length];
        FZR = new double[XI.length];
    
        //Preenchimento dos outros valores da tabela, inicialmente com 0.
        for (int i = 0; i < XI.length; i++) {
            FI[i] = 0;
            FZI[i] = 0;
            FR[i] = 0;
            FZR[i] = 0;
        }
        
        //fi
        int cont=0;
        for (int i = 0; i < XI.length; i++) {
            for (String item : aux) {
                if(XI[i].equalsIgnoreCase(item)){
                    cont++;
                } 
            }
            FI[i] = cont;
            cont=0;
        }
        //Fi
        FZI[0] = FI[0];
//        FZI = FI;
        for (int i = 1; i < FZI.length; i++) {
            FZI[i] = FI[i];
            FZI[i] = FZI[i] + FZI[i-1];
        }
        //fr
        for (int i = 0; i < FR.length; i++) {
            FR[i] = (double)FI[i]/roll.size()*100;
        }
        //Fr
        FZR[0] = FR[0];
        for (int i = 1; i < FZR.length; i++) {
            FZR[i] = FR[i];
            FZR[i] = FZR[i] + FZR[i-1];
        }
        
//      Outros valores.
        N = roll.size();
        
    }

//  Acessores.
    public int getN() {
        return N;
    }
    public void setN(int N) {
        this.N = N;
    }
    public double getModa() {
        return moda;
    }
    public void setModa(double moda) {
        this.moda = moda;
    }
    public double getM() {
        return M;
    }
    public void setM(double M) {
        this.M = M;
    }
    public double getMZ() {
        return MZ;
    }
    public void setMZ(double MZ) {
        this.MZ = MZ;
    }
    public int[] getFI() {
        return FI;
    }
    public void setFI(int[] FI) {
        this.FI = FI;
    }
    public int[] getFZI() {
        return FZI;
    }
    public void setFZI(int[] FZI) {
        this.FZI = FZI;
    }
    public double[] getFR() {
        return FR;
    }
    public void setFR(double[] FR) {
        this.FR = FR;
    }
    public double[] getFZR() {
        return FZR;
    }
    public void setFZR(double[] FZR) {
        this.FZR = FZR;
    }
    public String[] getXI() {
        return XI;
    }
    public void setXI(String[] XI) {
        this.XI = XI;
    }
    @Override
    public String toString() {
        return "Qualitativa{" + "N=" + N + ", moda=" + moda + ", M=" + M + ", MZ=" + MZ + ", FI=" + FI + ", FZI=" + FZI + ", FR=" + FR + ", FZR=" + FZR + ", XI=" + XI + '}';
    }
    
    
    
}
