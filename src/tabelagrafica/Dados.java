package tabelagrafica;


public class Dados {
    private String ip;
    private String data;
    private String local;
    private String requisicao;
    private String codigoStatus;
    private String tamanhoBytes;
    private String caminhoURL;
    private String so;
    private String browser;

    public Dados() {
    }
    public Dados(String ip, String data, String local, String requisicao, 
                 String codigoStatus, String tamanhoBytes, String caminhoURL, 
                 String so, String browser) {
        this.ip = ip;
        this.data = data;
        this.local = local;
        this.requisicao = requisicao;
        this.codigoStatus = codigoStatus;
        this.tamanhoBytes = tamanhoBytes;
        this.caminhoURL = caminhoURL;
        this.so = so;
        this.browser = browser;
    }
    public Dados(String linha){
        String[] linhaDividida;
        linhaDividida = linha.split(" ");
        
        ip = linhaDividida[0];
        data = linhaDividida[1];
        local = linhaDividida[2];
        requisicao = linhaDividida[3];
        codigoStatus = linhaDividida[4];
        tamanhoBytes = linhaDividida[5];
        caminhoURL = linhaDividida[6];
        so = linhaDividida[7];
        browser = linhaDividida[8];
        System.out.println(linhaDividida.length);
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getRequisicao() {
        return requisicao;
    }
    public void setRequisicao(String requisicao) {
        this.requisicao = requisicao;
    }
    public String getCodigoStatus() {
        return codigoStatus;
    }
    public void setCodigoStatus(String codigoStatus) {
        this.codigoStatus = codigoStatus;
    }
    public String getTamanhoBytes() {
        return tamanhoBytes;
    }
    public void setTamanhoBytes(String tamanhoBytes) {
        this.tamanhoBytes = tamanhoBytes;
    }
    public String getCaminhoURL() {
        return caminhoURL;
    }
    public void setCaminhoURL(String caminhoURL) {
        this.caminhoURL = caminhoURL;
    }
    public String getSo() {
        return so;
    }
    public void setSo(String so) {
        this.so = so;
    }
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }
    @Override
    public String toString() {
        return "Dados{" + "ip=" + ip + ", data=" + data + ", local=" + local + 
               ", requisicao=" + requisicao + ", codigoStatus=" + codigoStatus +
               ", tamanhoBytes=" + tamanhoBytes + ", caminhoURL=" + caminhoURL + 
               ", so=" + so + ", browser=" + browser + '}';
    }
    
    
    
}
