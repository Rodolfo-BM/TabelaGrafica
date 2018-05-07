package tabelagrafica;

public class Elemento {
    private String elemento;

    public Elemento() {
    }
    public Elemento(String elemento) {
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    @Override
    public String toString() {
        return elemento;
    }
    
}
