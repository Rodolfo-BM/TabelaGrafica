package tabelagrafica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Continua {
    //Atributos.
    private int N;
    private int[] FI, FZI;
    private double[] XI, FR, FZR, XIFI, XIXFI, classe;
    private double H, HZ, K, media, moda, mediana, M, MZ, variancia, desvioPadrao;

//  Construtores.
    public Continua() {
    }
    public Continua(List roll) {
        //Declaração de variaveis.
        List<String> aux;
        aux = roll;
        Collections.sort(aux);
        
        List<Double> aux2 = new ArrayList<>();
        for (String item : aux) {
            aux2.add(Double.parseDouble(item));
        }
        
        Collections.sort(aux2);
        
        //Valores que nao fazem parte da tabela
        N = roll.size();
        M = aux2.get(0);
        MZ = aux2.get(aux2.size()-1);
        HZ = MZ - M;
        K = 1 + 3.33 * Math.log10(N);
        H = HZ/K;
        
//      Determinação do valor maximo de cada classe.
        if((int)K%K == 0) classe = new double[(int)K];
        else classe = new double[(int)K + 1];
        classe[0] = M + H;
        for (int i = 1; i < classe.length; i++) {
            classe[i] = classe[i-1] + H;
        }
        
//      O Xi nesse caso é a media de cada classe (valor maximo)+(valor minimo)/2
        XI = new double[classe.length];
        for (int i = 0; i < XI.length; i++) {
            XI[i] = ((classe[i])+(classe[i] - H))/2;
        }
        
        
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
            for (Double item : aux2) {
                if(item >= classe[i]-H && item < classe[i] ){
                    cont++;
                } 
            }
            FI[i] = cont;
            cont=0;
        }
        //Fi
        FZI[0] = FI[0];
//      FZI = FI;
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
        double sum=0;
        for (String string : aux) {
            sum += Double.parseDouble(string);
        }
        media = sum/aux.size();
        
        int j = 0;
        moda = XI[0];
        for (int i = 1; i < XI.length; i++) {
            if(FI[i] > FI[j]){ 
                moda = XI[i];
                j = i;
            }
        }
        
        mediana = XI[XI.length/2];
        
        sum = 0;
        for (double d : XIXFI) {
            sum += d;
        }
        variancia = sum/N-1;

        desvioPadrao = Math.sqrt(variancia);
        
    }
    public Continua(List roll, double[] classe){
        //Declaração de variaveis.
        List<String> aux;
        aux = roll;
        Collections.sort(aux);
        
        String[] numerosDivididos;
        String[] numerosReagrupados = new String[aux.size()];
        int p = 0;
        for (String item : aux) {
            numerosDivididos = item.split(":");
            numerosReagrupados[p] = numerosDivididos[0] + numerosDivididos[1] + numerosDivididos[2];
            p++;
        }
        
        List<Double> aux2 = new ArrayList<>();
        for (String item : numerosReagrupados) {
            aux2.add((double)(Double.parseDouble(item)/10000));
        }
        Collections.sort(aux2);
        
        //Valores que nao fazem parte da tabela
        N = roll.size();
        M = aux2.get(0);
        MZ = aux2.get(aux2.size()-1);
        HZ = MZ - M;
        K = classe.length;
        H = classe[1] - classe[0];
        
//      Determinação do valor maximo de cada classe.
        this.classe = classe;
        
//      O Xi nesse caso é a media de cada classe (valor maximo)+(valor minimo)/2
        XI = new double[classe.length];
        for (int i = 0; i < XI.length; i++) {
            XI[i] = ((classe[i])+(classe[i] - H))/2;
        }
        
        
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
            for (Double item : aux2) {
                if(item >= classe[i]-H && item < classe[i] ){
                    cont++;
                } 
            }
            FI[i] = cont;
            cont=0;
        }
        //Fi
        FZI[0] = FI[0];
//      FZI = FI;
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
        double sum=0;
        for (String string : numerosReagrupados) {
            sum += Double.parseDouble(string);
        }
        media = sum/aux.size();
        
        int j = 0;
        moda = XI[0];
        for (int i = 1; i < XI.length; i++) {
            if(FI[i] > FI[j]){ 
                moda = XI[i];
                j = i;
            }
        }
        
        mediana = XI[XI.length/2];
        
        sum = 0;
        for (double d : XIXFI) {
            sum += d;
        }
        variancia = sum/N-1;

        desvioPadrao = Math.sqrt(variancia);
        
    }

//  Acessores.
    public int getN() {
        return N;
    }
    public void setN(int N) {
        this.N = N;
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
    public double[] getClasse() {
        return classe;
    }
    public void setClasse(double[] classe) {
        this.classe = classe;
    }
    public double getH() {
        return H;
    }
    public void setH(double H) {
        this.H = H;
    }
    public double getHZ() {
        return HZ;
    }
    public void setHZ(double HZ) {
        this.HZ = HZ;
    }
    public double getK() {
        return K;
    }
    public void setK(double K) {
        this.K = K;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
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
    public double getVariancia() {
        return variancia;
    }
    public void setVariancia(double variancia) {
        this.variancia = variancia;
    }
    public double getDesvioPadrao() {
        return desvioPadrao;
    }
    public void setDesvioPadrao(double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }
    @Override
    public String toString() {
        return "Continua{" + "N=" + N + ", FI=" + FI + ", FZI=" + FZI + ", XI=" + XI + ", FR=" + FR + ", FZR=" + FZR + ", XIFI=" + XIFI + ", XIXFI=" + XIXFI + ", classe=" + classe + ", H=" + H + ", HZ=" + HZ + ", K=" + K + ", media=" + media + ", moda=" + moda + ", mediana=" + mediana + ", M=" + M + ", MZ=" + MZ + '}';
    }
    
    
}
