package tabelagrafica;


public class Dados {
    private String ip;
    private String data;
    private String horario;
    private String localizacao;
    private String cabecalho;
    private String requisicao;
    private String codigoStatus;
    private String tamanhoBytes;
    private String caminhoURL;
    private String so;
    private String browser;

    public Dados() {
    }
    public Dados(String ip, String data, String horario, String localizacao, String cabecalho, String requisicao, String codigoStatus, String tamanhoBytes, String caminhoURL, String so, String browser) {
        this.ip = ip;
        this.data = data;
        this.horario = horario;
        this.localizacao = localizacao;
        this.cabecalho = cabecalho;
        this.requisicao = requisicao;
        this.codigoStatus = codigoStatus;
        this.tamanhoBytes = tamanhoBytes;
        this.caminhoURL = caminhoURL;
        this.so = so;
        this.browser = browser;
    }
    public Dados(String linha){
        String[] linhaDividida;
        linhaDividida = linha.split("\t");
        
        ip = linhaDividida[0];
        data = linhaDividida[1];
        horario = linhaDividida[2];
        localizacao = linhaDividida[3];
        cabecalho = linhaDividida[4];
        requisicao = linhaDividida[5];
        codigoStatus = linhaDividida[7];
        tamanhoBytes = linhaDividida[8];
        caminhoURL = linhaDividida[9];
//        so = linhaDividida[7];
//        browser = linhaDividida[8];
//        System.out.println(linhaDividida.length);
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
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getCabecalho() {
        return cabecalho;
    }
    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
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
        return "Dados{" + "ip=" + ip + ", data=" + data + 
                ", localizacao=" + localizacao + ", requisicao=" + requisicao + 
                ", codigoStatus=" + codigoStatus + ", tamanhoBytes=" + tamanhoBytes + 
                ", caminhoURL=" + caminhoURL + ", so=" + so + ", browser=" + browser + '}';
    }
    
    
    
}
