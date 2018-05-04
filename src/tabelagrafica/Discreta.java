package tabelagrafica;

import java.util.List;

public class Discreta {
    //Atributos.
    private int[] Xi, fi, Fi;
    private float[] fr, Fr;
   
    //Construtores.
    public Discreta(List<Object> roll){
        //Declaração de variaveis.
        int cont=0;
        int[] Xi, fi, Fi;
        float[] fr, Fr;
        
        //Criação e preenchimento do ArrayList Xi.
        for (int i = 1; i < roll.size(); i++) {
            cont++;
            if(roll.get(i).equals(roll.get(i-1))){
                cont--;
            }
        }
        Xi = new int[cont];
        
        //Criação dos outros valores da tabela baseados no tamanho de Xi.
        fi = new int[Xi.length];
        Fi = new int[Xi.length];
        fr = new float[Xi.length];
        Fr = new float[Xi.length];
    
        //Preenchimento dos outros valores da tabela
        int f = 0;
        fi[0] = 1; Fi[0] = 1; Fr[0] =0;
        for (int i = 1; i < roll.size(); i++) {
            if(roll.get(i).equals(roll.get(i-1))){
                fi[f]++;
                Fi[f]++;
            }else{
                fr[f] = ((float)fi[f]/(float)roll.size())*100;
                Fr[f] = fr[f];
                if(f != 0) Fr[f] = Fr[f]+Fr[f-1];
                f++;
                fi[f] = 1;
                Fi[f] = Fi[f-1] + 1;
            }
        }
        fr[f] = ((float)fi[f]/(float)roll.size())*100;
        Fr[f] = fr[f];
        if(f != 0) Fr[f] = Fr[f]+Fr[f-1];
        
        this.Xi = Xi;
        this.fi = fi;
        this.Fi = Fi;
        this.fr = fr;
        this.Fr = Fr;
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
    

    //Metodos especiais.
    public void impressao(){
        double media=0;
        for (Elemento item : roll) {
            media = media + item.getValor();
        }
        media = media/roll.size();
        
        //Impressão do Roll na tela.
        System.out.println("\nXi  |fi |Fi |   fr   |   Fr   |Xi*fi | (Xi-X)^2");
        for (int j = 0; j < Xi.size(); j++) {
        double xifi = Xi.get(j).getValor()*fi[j];
        double xiX = Math.pow(Xi.get(j).getValor() - media,2)*fi[j];
        
            System.out.print(Xi.get(j).getValor()+" | "+fi[j]+" | "+Fi[j]+" | ");
            System.out.printf("%.2f",fr[j]); System.out.print("% | ");
            System.out.printf("%.2f",Fr[j]); System.out.print("% | ");
            System.out.printf("%.2f | ",xifi);
            System.out.printf("%.2f\n",xiX);
        }
        System.out.println(" ");
    }
    
}
