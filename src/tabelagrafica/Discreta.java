package tabelagrafica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Discreta {
    //Atributos.
    private int N;
    private double media, moda, mediana, M, MZ;
    private int[] FI, FZI;
    private double[] XI, FR, FZR;
    private double[] XIFI;
    private double[] XIXFI;
   
    //Construtores.
    public Discreta(){
    
    }
    public Discreta(List roll) {
        //Declaração de variaveis.
        List<String> aux = roll;
        Collections.sort(aux);
//        for (String item : aux) {
//            item = item.trim();
//        }
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
//      Xi*Fi
        XIFI = new double[XI.length];
        for (int i = 0; i < XI.length; i++) {
            XIFI[i] = XI[i]*FI[i];
        }
//      (Xi-media)²*Fi
        XIXFI = new double[XI.length];
        for (int i = 0; i < XI.length; i++) {
            XIXFI[i] = Math.pow((XI[i] - media),2) * FI[i];
        }
        
//      Outros valores.
        N = roll.size();
        M = XI[0];
        MZ = XI[XI.length - 1];
        
        double sum=0;
        for (String string : aux) {
            sum += Double.parseDouble(string);
        }
        media = sum/aux.size();
        
        moda = 0;
        for (int i = 0; i < XI.length; i++) {
            if(FI[i] > moda) moda = XI[i];
        }
        
        mediana = XI[XI.length/2];

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
    public double getModa() {
        return moda;
    }
    public void setModa(double moda) {
        this.moda = moda;
    }
    public double getMediana() {
        return mediana;
    }
    public void setMediana(double mediana) {
        this.mediana = mediana;
    }
    public double[] getXIFI() {
        return XIFI;
    }
    public void setXIFI(double[] XIFI) {
        this.XIFI = XIFI;
    }
    public double[] getXIXFI() {
        return XIXFI;
    }
    public void setXIXFI(double[] XIXFI) {
        this.XIXFI = XIXFI;
    }
    public int getN(){
        return N;
    }
    public void setN(int N){
        this.N = N;
    }
    public double getMedia(){
        return media;
    }
    public void setMedia(double media){
        this.media = media;
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
    @Override
    public String toString() {
        return "Discreta{" + "N=" + N + ", media=" + media + ", moda=" + moda + ", mediana=" + mediana + ", M=" + M + ", MZ=" + MZ + ", FI=" + FI + ", FZI=" + FZI + ", XI=" + XI + ", FR=" + FR + ", FZR=" + FZR + '}';
    }
    
}
