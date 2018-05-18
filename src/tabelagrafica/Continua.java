package tabelagrafica;

import java.util.List;

public class Continua extends Discreta{
    private double[] XIFI, XIXFI, classe;
    private double H, HZ, K;

//  Construtores.
    public Continua() {
    }
    public Continua(List roll) {
        
        super(roll);
        
        XIFI = new double[getXI().length];
        for (int i = 0; i < getXI().length; i++) {
            XIFI[i] = getXI()[i]*getFI()[i];
        }
        
        XIXFI = new double[getXI().length];
        for (int i = 0; i < getXI().length; i++) {
            XIXFI[i] = Math.pow((getXI()[i] * getMedia()),2) * getFI()[i];
        }
        
        HZ = getMZ() - getM();
        
        K = 1 + (3.33*Math.log(getN()));
        
        H = HZ/K;
        
        classe = new double[getXI().length];
        for (int i = 0; i < classe.length; i++) {
            classe[i] = (i+1)*H;
        }
    }

//  Acessores.
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
    public double[] getClasse() {
        return classe;
    }
    public void setClasse(double[] classe) {
        this.classe = classe;
    }
    @Override
    public String toString() {
        return super.toString()+"Continua{" + "XIFI=" + XIFI + ", XIXFI=" + XIXFI + ", H=" + H + ", HZ=" + HZ + ", K=" + K + '}';
    }
    
}
