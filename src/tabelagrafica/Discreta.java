package tabelagrafica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Discreta {
    //Atributos.
    private int[] FI, FZI;
    private double[] XI, FR, FZR;
   
    //Construtores.
    public Discreta(List roll){
        //Declaração de variaveis.
        List<String> aux = roll;
        for (String item : aux) {
            item = item.trim();
        }
        List<String> aux2 = new ArrayList<>();
        boolean achei=false;
        
        //Criação e preenchimento do Array XI.
        for (String primeiro : aux) {
            achei = false;
            for (String segundo : aux2) {
                if(primeiro.equalsIgnoreCase(segundo)) achei = true;
            }
            if(!achei) aux2.add(primeiro);
        }
        
        XI = new double[aux2.size()];
        int z=0;
        for (String item : aux2) {
            XI[z] = Double.parseDouble(item);
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
            for (String string : aux) {
                if(XI[i] == Double.parseDouble(string)){
                    cont++;
                } 
            }
            FI[i] = cont;
            cont=0;
        }
        //Fi
        FZI[0] = FI[0];
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
    }
    
    //Metodos acessores.
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
    public double[] getXI() {
        return XI;
    }
    public void setXI(double[] XI) {
        this.XI = XI;
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
    @Override
    public String toString() {
        return "Discreta{" + "fi=" + FI + ", Fi=" + FZI + ", Xi=" + XI + ", fr=" + FR + ", Fr=" + FZR + '}';
    }
}
