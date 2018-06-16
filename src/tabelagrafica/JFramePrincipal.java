package tabelagrafica;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class JFramePrincipal extends javax.swing.JFrame {
    
    ArrayList<Dados> lista = new ArrayList<>();
    public static Qualitativa qualitativaIP;
    public static Qualitativa qualitativaData;
    public static Qualitativa qualitativaLocalizacao;
    public static Qualitativa qualitativaCabecalho;
    public static Qualitativa qualitativaRequisicao;
    public static Qualitativa qualitativaHTTP;
    public static Qualitativa qualitativaCodigo;
    public static Qualitativa qualitativaTamanho;
    public static Qualitativa qualitativaCaminho;
    public static Qualitativa qualitativaSO;
    public static Qualitativa qualitativaBrowser;
    public static Discreta discretaIP;
    public static Continua continuaHorario;
    
    DecimalFormat quatro = new DecimalFormat ("0.####", new DecimalFormatSymbols (new Locale ("pt", "BR")));

    public JFramePrincipal() {
        initComponents();
        esconderComponentes();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        painelComAbas = new javax.swing.JTabbedPane();
        abaArquivo = new javax.swing.JPanel();
        scrollTabelaLog = new javax.swing.JScrollPane();
        tabelaLog = new javax.swing.JTable();
        painelBotoesArquivo = new javax.swing.JPanel();
        lerLog = new javax.swing.JButton();
        campoTextoCaminhoLog = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rotuloNLog = new javax.swing.JLabel();
        campoNLog = new javax.swing.JTextField();
        abaIP = new javax.swing.JPanel();
        scrollTabelaIP2 = new javax.swing.JScrollPane();
        tabelaIP2 = new javax.swing.JTable();
        painelBotoesIP = new javax.swing.JPanel();
        botaoIP1 = new javax.swing.JButton();
        botaoIP2 = new javax.swing.JButton();
        botaoIP4 = new javax.swing.JButton();
        botaoIP3 = new javax.swing.JButton();
        painelDadosIP = new javax.swing.JPanel();
        rotuloNIP = new javax.swing.JLabel();
        campoNIP = new javax.swing.JTextField();
        rotuloModaIP = new javax.swing.JLabel();
        campoModaIP = new javax.swing.JTextField();
        scrollTabelaIP = new javax.swing.JScrollPane();
        tabelaIP = new javax.swing.JTable();
        abaData = new javax.swing.JPanel();
        scrollTabelaData = new javax.swing.JScrollPane();
        tabelaData = new javax.swing.JTable();
        painelBotoesData = new javax.swing.JPanel();
        botaoData1 = new javax.swing.JButton();
        botaoData2 = new javax.swing.JButton();
        painelDadosData = new javax.swing.JPanel();
        rotuloNData = new javax.swing.JLabel();
        campoNData = new javax.swing.JTextField();
        rotuloModaData = new javax.swing.JLabel();
        campoModaData = new javax.swing.JTextField();
        abaHorario = new javax.swing.JPanel();
        scrollTabelaHorario = new javax.swing.JScrollPane();
        tabelaHorario = new javax.swing.JTable();
        painelBotoesHorario = new javax.swing.JPanel();
        botaoHorario1 = new javax.swing.JButton();
        botaoHorario2 = new javax.swing.JButton();
        botaoHorario3 = new javax.swing.JButton();
        painelDadosHorario = new javax.swing.JPanel();
        rotuloNHorario = new javax.swing.JLabel();
        campoNHorario = new javax.swing.JTextField();
        rotuloModaHorario = new javax.swing.JLabel();
        campoModaHorario = new javax.swing.JTextField();
        abaLocalizacao = new javax.swing.JPanel();
        scrollTabelaLocalizacao = new javax.swing.JScrollPane();
        tabelaLocalizacao = new javax.swing.JTable();
        painelBotoesLocalizacao = new javax.swing.JPanel();
        botaoLocalizacao = new javax.swing.JButton();
        botaoLocalizacao2 = new javax.swing.JButton();
        painelDadosLocalizacao = new javax.swing.JPanel();
        rotuloNLocalizacao = new javax.swing.JLabel();
        campoNLocalizacao = new javax.swing.JTextField();
        rotuloModaLocalizacao = new javax.swing.JLabel();
        campoModaLocalizacao = new javax.swing.JTextField();
        abaCabecalho = new javax.swing.JPanel();
        scrollTabelaCabecalho = new javax.swing.JScrollPane();
        tabelaCabecalho = new javax.swing.JTable();
        painelBotoesCabecalho = new javax.swing.JPanel();
        botaoCabecalho1 = new javax.swing.JButton();
        botaoCabecalho2 = new javax.swing.JButton();
        painelDadosCabecalho = new javax.swing.JPanel();
        rotuloNCabecalho = new javax.swing.JLabel();
        campoNCabecalho = new javax.swing.JTextField();
        rotuloModaCabecalho = new javax.swing.JLabel();
        campoModaCabecalho = new javax.swing.JTextField();
        abaRequisicao = new javax.swing.JPanel();
        scrollTabelaRequisicao = new javax.swing.JScrollPane();
        tabelaRequisicao = new javax.swing.JTable();
        painelBotoesRequisicao = new javax.swing.JPanel();
        botaoRequisicao1 = new javax.swing.JButton();
        botaoRequisicao2 = new javax.swing.JButton();
        painelDadosRequisicao = new javax.swing.JPanel();
        rotuloNRequisicao = new javax.swing.JLabel();
        campoNRequisicao = new javax.swing.JTextField();
        rotuloModaRequisicao = new javax.swing.JLabel();
        campoModaRequisicao = new javax.swing.JTextField();
        abaHTTP = new javax.swing.JPanel();
        scrollTabelaHTTP = new javax.swing.JScrollPane();
        tabelaHTTP = new javax.swing.JTable();
        painelBotoesHTTP = new javax.swing.JPanel();
        botaoHTTP1 = new javax.swing.JButton();
        botaoHTTP2 = new javax.swing.JButton();
        painelDadosHTTP = new javax.swing.JPanel();
        rotuloNHTTP = new javax.swing.JLabel();
        campoNHTTP = new javax.swing.JTextField();
        rotunoModaHTTP = new javax.swing.JLabel();
        campoModaHTTP = new javax.swing.JTextField();
        abaCodigo = new javax.swing.JPanel();
        scrollTabelaCodigo = new javax.swing.JScrollPane();
        tabelaCodigo = new javax.swing.JTable();
        painelBotoesCodigo = new javax.swing.JPanel();
        botaoCodigo1 = new javax.swing.JButton();
        botaoCodigo2 = new javax.swing.JButton();
        painelDadosCodigo = new javax.swing.JPanel();
        rotuloNCodigo = new javax.swing.JLabel();
        campoNCodigo = new javax.swing.JTextField();
        rotuloModaCodigo = new javax.swing.JLabel();
        campoModaCodigo = new javax.swing.JTextField();
        abaTamanho = new javax.swing.JPanel();
        scrollTabelaTamanho = new javax.swing.JScrollPane();
        tabelaTamanho = new javax.swing.JTable();
        painelBotoesTamanho = new javax.swing.JPanel();
        botaoTamano1 = new javax.swing.JButton();
        botaoTamanho2 = new javax.swing.JButton();
        painelDadosTamanho = new javax.swing.JPanel();
        rotuloNTamanho = new javax.swing.JLabel();
        campoNTamanho = new javax.swing.JTextField();
        rotuloModaTamanho = new javax.swing.JLabel();
        campoModaTamanho = new javax.swing.JTextField();
        abaCaminho = new javax.swing.JPanel();
        scrollTabelaCaminho = new javax.swing.JScrollPane();
        tabelaCaminho = new javax.swing.JTable();
        painelBotoesCaminho = new javax.swing.JPanel();
        botaoCaminho1 = new javax.swing.JButton();
        botaoCaminho2 = new javax.swing.JButton();
        painelDadosCaminho = new javax.swing.JPanel();
        rotuloNCaminho = new javax.swing.JLabel();
        campoNCaminho = new javax.swing.JTextField();
        rotuloModaCaminho = new javax.swing.JLabel();
        campoModaCaminho = new javax.swing.JTextField();
        abaSo = new javax.swing.JPanel();
        scrollTabelaSO = new javax.swing.JScrollPane();
        tabelaSO = new javax.swing.JTable();
        painelBotoesSO = new javax.swing.JPanel();
        botaoSO1 = new javax.swing.JButton();
        botaoSO2 = new javax.swing.JButton();
        painelDadosSO = new javax.swing.JPanel();
        rotuloNSO = new javax.swing.JLabel();
        campoNSO = new javax.swing.JTextField();
        rotuloModaSO = new javax.swing.JLabel();
        campoModaSO = new javax.swing.JTextField();
        abaBrowser = new javax.swing.JPanel();
        scrollTabelaBrowser = new javax.swing.JScrollPane();
        tabelaBrowser = new javax.swing.JTable();
        painelBotoesBrowser = new javax.swing.JPanel();
        botaoBrowser1 = new javax.swing.JButton();
        botaoBrowser2 = new javax.swing.JButton();
        painelDadosBrowser = new javax.swing.JPanel();
        rotuloNBrowser = new javax.swing.JLabel();
        campoNBrowser = new javax.swing.JTextField();
        rotuloModaBrowser = new javax.swing.JLabel();
        campoModaBrowser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelComAbas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                painelComAbasFocusGained(evt);
            }
        });

        tabelaLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Data", "Horario", "localização", "Cabeçalho", "Requisição", "Versão do HTTP", "Codigo de status", "Tamanho em Bytes", "Caminho", "SO", "Browser"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaLog.setViewportView(tabelaLog);

        painelBotoesArquivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lerLog.setText("Ler Log");
        lerLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesArquivoLayout = new javax.swing.GroupLayout(painelBotoesArquivo);
        painelBotoesArquivo.setLayout(painelBotoesArquivoLayout);
        painelBotoesArquivoLayout.setHorizontalGroup(
            painelBotoesArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lerLog)
                .addGap(18, 18, 18)
                .addComponent(campoTextoCaminhoLog)
                .addContainerGap())
        );
        painelBotoesArquivoLayout.setVerticalGroup(
            painelBotoesArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lerLog)
                    .addComponent(campoTextoCaminhoLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNLog.setText("N de elementos distintos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNLog, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNLog)
                    .addComponent(campoNLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaArquivoLayout = new javax.swing.GroupLayout(abaArquivo);
        abaArquivo.setLayout(abaArquivoLayout);
        abaArquivoLayout.setHorizontalGroup(
            abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaArquivoLayout.setVerticalGroup(
            abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaLog, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Arquivo", abaArquivo);

        abaIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaIPFocusGained(evt);
            }
        });

        tabelaIP2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr", "Xi * fi", "(Xi - Med)²*fi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaIP2.setViewportView(tabelaIP2);

        painelBotoesIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoIP1.setText("Carregar dados de IP");
        botaoIP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIP1ActionPerformed(evt);
            }
        });

        botaoIP2.setText("Avaliar Frequencia de IPs");
        botaoIP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIP2ActionPerformed(evt);
            }
        });

        botaoIP4.setText("Estatisticas sobre frequencia de IPs");
        botaoIP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIP4ActionPerformed(evt);
            }
        });

        botaoIP3.setText("Estatisticas sobre dados de IP");
        botaoIP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIP3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesIPLayout = new javax.swing.GroupLayout(painelBotoesIP);
        painelBotoesIP.setLayout(painelBotoesIPLayout);
        painelBotoesIPLayout.setHorizontalGroup(
            painelBotoesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoIP1)
                .addGap(18, 18, 18)
                .addComponent(botaoIP3)
                .addGap(31, 31, 31)
                .addComponent(botaoIP2)
                .addGap(18, 18, 18)
                .addComponent(botaoIP4)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        painelBotoesIPLayout.setVerticalGroup(
            painelBotoesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIP1)
                    .addComponent(botaoIP2)
                    .addComponent(botaoIP4)
                    .addComponent(botaoIP3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNIP.setText("N de elementos distintos:");

        rotuloModaIP.setText("Moda:");

        javax.swing.GroupLayout painelDadosIPLayout = new javax.swing.GroupLayout(painelDadosIP);
        painelDadosIP.setLayout(painelDadosIPLayout);
        painelDadosIPLayout.setHorizontalGroup(
            painelDadosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaIP, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDadosIPLayout.setVerticalGroup(
            painelDadosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNIP)
                    .addComponent(campoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaIP)
                    .addComponent(campoModaIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaIP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaIP.setViewportView(tabelaIP);

        javax.swing.GroupLayout abaIPLayout = new javax.swing.GroupLayout(abaIP);
        abaIP.setLayout(abaIPLayout);
        abaIPLayout.setHorizontalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(abaIPLayout.createSequentialGroup()
                        .addGroup(abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollTabelaIP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(painelDadosIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollTabelaIP2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        abaIPLayout.setVerticalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaIPLayout.createSequentialGroup()
                        .addComponent(scrollTabelaIP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(painelDadosIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTabelaIP2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelComAbas.addTab("IP", abaIP);

        tabelaData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaData.setViewportView(tabelaData);

        painelBotoesData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoData1.setText("Carregar dados de Data");
        botaoData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoData1ActionPerformed(evt);
            }
        });

        botaoData2.setText("Estatisticas sobre dados de Data");

        javax.swing.GroupLayout painelBotoesDataLayout = new javax.swing.GroupLayout(painelBotoesData);
        painelBotoesData.setLayout(painelBotoesDataLayout);
        painelBotoesDataLayout.setHorizontalGroup(
            painelBotoesDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoData2)
                .addContainerGap())
        );
        painelBotoesDataLayout.setVerticalGroup(
            painelBotoesDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoData1)
                    .addComponent(botaoData2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNData.setText("N de elementos distintos:");

        rotuloModaData.setText("Moda:");

        javax.swing.GroupLayout painelDadosDataLayout = new javax.swing.GroupLayout(painelDadosData);
        painelDadosData.setLayout(painelDadosDataLayout);
        painelDadosDataLayout.setHorizontalGroup(
            painelDadosDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNData, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaData)
                .addContainerGap())
        );
        painelDadosDataLayout.setVerticalGroup(
            painelDadosDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNData)
                    .addComponent(campoNData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaData)
                    .addComponent(campoModaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaDataLayout = new javax.swing.GroupLayout(abaData);
        abaData.setLayout(abaDataLayout);
        abaDataLayout.setHorizontalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaData, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaDataLayout.setVerticalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaData, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Data", abaData);

        tabelaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaHorario.setViewportView(tabelaHorario);

        painelBotoesHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoHorario1.setText("Carregar dados de Horario");
        botaoHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHorario1ActionPerformed(evt);
            }
        });

        botaoHorario2.setText("Quantitade de acessos por hora");
        botaoHorario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHorario2ActionPerformed(evt);
            }
        });

        botaoHorario3.setText("Estatisticas sobre dados de Horario");

        javax.swing.GroupLayout painelBotoesHorarioLayout = new javax.swing.GroupLayout(painelBotoesHorario);
        painelBotoesHorario.setLayout(painelBotoesHorarioLayout);
        painelBotoesHorarioLayout.setHorizontalGroup(
            painelBotoesHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoHorario1)
                .addGap(18, 18, 18)
                .addComponent(botaoHorario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoHorario3)
                .addContainerGap())
        );
        painelBotoesHorarioLayout.setVerticalGroup(
            painelBotoesHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoHorario1)
                    .addComponent(botaoHorario2)
                    .addComponent(botaoHorario3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNHorario.setText("N de elementos distintos:");

        rotuloModaHorario.setText("Moda:");

        javax.swing.GroupLayout painelDadosHorarioLayout = new javax.swing.GroupLayout(painelDadosHorario);
        painelDadosHorario.setLayout(painelDadosHorarioLayout);
        painelDadosHorarioLayout.setHorizontalGroup(
            painelDadosHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaHorario)
                .addContainerGap())
        );
        painelDadosHorarioLayout.setVerticalGroup(
            painelDadosHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosHorarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNHorario)
                    .addComponent(campoNHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaHorario)
                    .addComponent(campoModaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaHorarioLayout = new javax.swing.GroupLayout(abaHorario);
        abaHorario.setLayout(abaHorarioLayout);
        abaHorarioLayout.setHorizontalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelBotoesHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaHorarioLayout.setVerticalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Horario", abaHorario);

        tabelaLocalizacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaLocalizacao.setViewportView(tabelaLocalizacao);

        painelBotoesLocalizacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoLocalizacao.setText("Carregar dados de localizacao");
        botaoLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLocalizacaoActionPerformed(evt);
            }
        });

        botaoLocalizacao2.setText("Estatistica sobre dados de localizacao");

        javax.swing.GroupLayout painelBotoesLocalizacaoLayout = new javax.swing.GroupLayout(painelBotoesLocalizacao);
        painelBotoesLocalizacao.setLayout(painelBotoesLocalizacaoLayout);
        painelBotoesLocalizacaoLayout.setHorizontalGroup(
            painelBotoesLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoLocalizacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLocalizacao2)
                .addContainerGap())
        );
        painelBotoesLocalizacaoLayout.setVerticalGroup(
            painelBotoesLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLocalizacao)
                    .addComponent(botaoLocalizacao2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosLocalizacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNLocalizacao.setText("N de elementos distintos:");

        rotuloModaLocalizacao.setText("Moda:");

        javax.swing.GroupLayout painelDadosLocalizacaoLayout = new javax.swing.GroupLayout(painelDadosLocalizacao);
        painelDadosLocalizacao.setLayout(painelDadosLocalizacaoLayout);
        painelDadosLocalizacaoLayout.setHorizontalGroup(
            painelDadosLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNLocalizacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaLocalizacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaLocalizacao)
                .addContainerGap())
        );
        painelDadosLocalizacaoLayout.setVerticalGroup(
            painelDadosLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosLocalizacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNLocalizacao)
                    .addComponent(campoNLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaLocalizacao)
                    .addComponent(campoModaLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaLocalizacaoLayout = new javax.swing.GroupLayout(abaLocalizacao);
        abaLocalizacao.setLayout(abaLocalizacaoLayout);
        abaLocalizacaoLayout.setHorizontalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaLocalizacaoLayout.setVerticalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Localização", abaLocalizacao);

        tabelaCabecalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaCabecalho.setViewportView(tabelaCabecalho);

        painelBotoesCabecalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoCabecalho1.setText("Carregar dados de cabeçalhos de requisições");
        botaoCabecalho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCabecalho1ActionPerformed(evt);
            }
        });

        botaoCabecalho2.setText("Estatisticas sobre dados de Cabeçalho de requisições");

        javax.swing.GroupLayout painelBotoesCabecalhoLayout = new javax.swing.GroupLayout(painelBotoesCabecalho);
        painelBotoesCabecalho.setLayout(painelBotoesCabecalhoLayout);
        painelBotoesCabecalhoLayout.setHorizontalGroup(
            painelBotoesCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCabecalho1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCabecalho2)
                .addContainerGap())
        );
        painelBotoesCabecalhoLayout.setVerticalGroup(
            painelBotoesCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCabecalho1)
                    .addComponent(botaoCabecalho2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosCabecalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNCabecalho.setText("N de elementos distintos:");

        rotuloModaCabecalho.setText("Moda:");

        javax.swing.GroupLayout painelDadosCabecalhoLayout = new javax.swing.GroupLayout(painelDadosCabecalho);
        painelDadosCabecalho.setLayout(painelDadosCabecalhoLayout);
        painelDadosCabecalhoLayout.setHorizontalGroup(
            painelDadosCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaCabecalho)
                .addContainerGap())
        );
        painelDadosCabecalhoLayout.setVerticalGroup(
            painelDadosCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNCabecalho)
                    .addComponent(campoNCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaCabecalho)
                    .addComponent(campoModaCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaCabecalhoLayout = new javax.swing.GroupLayout(abaCabecalho);
        abaCabecalho.setLayout(abaCabecalhoLayout);
        abaCabecalhoLayout.setHorizontalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaCabecalhoLayout.setVerticalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Cabeçalho da requisição", abaCabecalho);

        tabelaRequisicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Xi", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaRequisicao.setViewportView(tabelaRequisicao);

        painelBotoesRequisicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoRequisicao1.setText("Carregar dados de requisicoes");
        botaoRequisicao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRequisicao1ActionPerformed(evt);
            }
        });

        botaoRequisicao2.setText("Estatisticas sobre dados de Requisições");

        javax.swing.GroupLayout painelBotoesRequisicaoLayout = new javax.swing.GroupLayout(painelBotoesRequisicao);
        painelBotoesRequisicao.setLayout(painelBotoesRequisicaoLayout);
        painelBotoesRequisicaoLayout.setHorizontalGroup(
            painelBotoesRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoRequisicao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRequisicao2)
                .addContainerGap())
        );
        painelBotoesRequisicaoLayout.setVerticalGroup(
            painelBotoesRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRequisicao1)
                    .addComponent(botaoRequisicao2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosRequisicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNRequisicao.setText("N de elementos distintos:");

        rotuloModaRequisicao.setText("Moda:");

        javax.swing.GroupLayout painelDadosRequisicaoLayout = new javax.swing.GroupLayout(painelDadosRequisicao);
        painelDadosRequisicao.setLayout(painelDadosRequisicaoLayout);
        painelDadosRequisicaoLayout.setHorizontalGroup(
            painelDadosRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNRequisicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaRequisicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaRequisicao)
                .addContainerGap())
        );
        painelDadosRequisicaoLayout.setVerticalGroup(
            painelDadosRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosRequisicaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNRequisicao)
                    .addComponent(campoNRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaRequisicao)
                    .addComponent(campoModaRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaRequisicaoLayout = new javax.swing.GroupLayout(abaRequisicao);
        abaRequisicao.setLayout(abaRequisicaoLayout);
        abaRequisicaoLayout.setHorizontalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaRequisicaoLayout.setVerticalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Requisição", abaRequisicao);

        tabelaHTTP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaHTTP.setViewportView(tabelaHTTP);

        painelBotoesHTTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoHTTP1.setText("Carregar dados de HTTP");
        botaoHTTP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHTTP1ActionPerformed(evt);
            }
        });

        botaoHTTP2.setText("Estatistica sobre dados de HTTP");

        javax.swing.GroupLayout painelBotoesHTTPLayout = new javax.swing.GroupLayout(painelBotoesHTTP);
        painelBotoesHTTP.setLayout(painelBotoesHTTPLayout);
        painelBotoesHTTPLayout.setHorizontalGroup(
            painelBotoesHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoHTTP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoHTTP2)
                .addContainerGap())
        );
        painelBotoesHTTPLayout.setVerticalGroup(
            painelBotoesHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoHTTP1)
                    .addComponent(botaoHTTP2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosHTTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNHTTP.setText("N de elementos distintos:");

        rotunoModaHTTP.setText("Moda:");

        javax.swing.GroupLayout painelDadosHTTPLayout = new javax.swing.GroupLayout(painelDadosHTTP);
        painelDadosHTTP.setLayout(painelDadosHTTPLayout);
        painelDadosHTTPLayout.setHorizontalGroup(
            painelDadosHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNHTTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotunoModaHTTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaHTTP)
                .addContainerGap())
        );
        painelDadosHTTPLayout.setVerticalGroup(
            painelDadosHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosHTTPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNHTTP)
                    .addComponent(campoNHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotunoModaHTTP)
                    .addComponent(campoModaHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaHTTPLayout = new javax.swing.GroupLayout(abaHTTP);
        abaHTTP.setLayout(abaHTTPLayout);
        abaHTTPLayout.setHorizontalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesHTTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaHTTP, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosHTTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaHTTPLayout.setVerticalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaHTTP, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Verção do HTTP", abaHTTP);

        tabelaCodigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaCodigo.setViewportView(tabelaCodigo);

        painelBotoesCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoCodigo1.setText("Carregar dados de codigo de resposta");
        botaoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCodigo1ActionPerformed(evt);
            }
        });

        botaoCodigo2.setText("Estatistica sobre dados de código de resposta");

        javax.swing.GroupLayout painelBotoesCodigoLayout = new javax.swing.GroupLayout(painelBotoesCodigo);
        painelBotoesCodigo.setLayout(painelBotoesCodigoLayout);
        painelBotoesCodigoLayout.setHorizontalGroup(
            painelBotoesCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCodigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCodigo2)
                .addContainerGap())
        );
        painelBotoesCodigoLayout.setVerticalGroup(
            painelBotoesCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCodigo1)
                    .addComponent(botaoCodigo2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNCodigo.setText("N de elementos distintos:");

        rotuloModaCodigo.setText("Moda:");

        javax.swing.GroupLayout painelDadosCodigoLayout = new javax.swing.GroupLayout(painelDadosCodigo);
        painelDadosCodigo.setLayout(painelDadosCodigoLayout);
        painelDadosCodigoLayout.setHorizontalGroup(
            painelDadosCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNCodigo)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelDadosCodigoLayout.setVerticalGroup(
            painelDadosCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosCodigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNCodigo)
                    .addComponent(campoNCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaCodigo)
                    .addComponent(campoModaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaCodigoLayout = new javax.swing.GroupLayout(abaCodigo);
        abaCodigo.setLayout(abaCodigoLayout);
        abaCodigoLayout.setHorizontalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaCodigoLayout.setVerticalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Código", abaCodigo);

        tabelaTamanho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaTamanho.setViewportView(tabelaTamanho);

        painelBotoesTamanho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoTamano1.setText("Carregar dados de tamanho de requisições");
        botaoTamano1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTamano1ActionPerformed(evt);
            }
        });

        botaoTamanho2.setText("Estatistica sobre dados de tamanho de requisições");

        javax.swing.GroupLayout painelBotoesTamanhoLayout = new javax.swing.GroupLayout(painelBotoesTamanho);
        painelBotoesTamanho.setLayout(painelBotoesTamanhoLayout);
        painelBotoesTamanhoLayout.setHorizontalGroup(
            painelBotoesTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoTamano1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoTamanho2)
                .addContainerGap())
        );
        painelBotoesTamanhoLayout.setVerticalGroup(
            painelBotoesTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoTamano1)
                    .addComponent(botaoTamanho2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosTamanho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNTamanho.setText("N de elementos distintos:");

        rotuloModaTamanho.setText("Moda:");

        javax.swing.GroupLayout painelDadosTamanhoLayout = new javax.swing.GroupLayout(painelDadosTamanho);
        painelDadosTamanho.setLayout(painelDadosTamanhoLayout);
        painelDadosTamanhoLayout.setHorizontalGroup(
            painelDadosTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNTamanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNTamanho)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaTamanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelDadosTamanhoLayout.setVerticalGroup(
            painelDadosTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosTamanhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNTamanho)
                    .addComponent(campoNTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaTamanho)
                    .addComponent(campoModaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaTamanhoLayout = new javax.swing.GroupLayout(abaTamanho);
        abaTamanho.setLayout(abaTamanhoLayout);
        abaTamanhoLayout.setHorizontalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaTamanhoLayout.setVerticalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Tamanho", abaTamanho);

        tabelaCaminho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaCaminho.setViewportView(tabelaCaminho);

        painelBotoesCaminho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoCaminho1.setText("Carregar dados do caminho");
        botaoCaminho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCaminho1ActionPerformed(evt);
            }
        });

        botaoCaminho2.setText("Estatisticas sobre dados de Caminho");

        javax.swing.GroupLayout painelBotoesCaminhoLayout = new javax.swing.GroupLayout(painelBotoesCaminho);
        painelBotoesCaminho.setLayout(painelBotoesCaminhoLayout);
        painelBotoesCaminhoLayout.setHorizontalGroup(
            painelBotoesCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCaminho1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCaminho2)
                .addContainerGap())
        );
        painelBotoesCaminhoLayout.setVerticalGroup(
            painelBotoesCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCaminho1)
                    .addComponent(botaoCaminho2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosCaminho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNCaminho.setText("N de elementos distintos:");

        rotuloModaCaminho.setText("Moda:");

        javax.swing.GroupLayout painelDadosCaminhoLayout = new javax.swing.GroupLayout(painelDadosCaminho);
        painelDadosCaminho.setLayout(painelDadosCaminhoLayout);
        painelDadosCaminhoLayout.setHorizontalGroup(
            painelDadosCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNCaminho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNCaminho)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaCaminho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelDadosCaminhoLayout.setVerticalGroup(
            painelDadosCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosCaminhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNCaminho)
                    .addComponent(campoNCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaCaminho)
                    .addComponent(campoModaCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaCaminhoLayout = new javax.swing.GroupLayout(abaCaminho);
        abaCaminho.setLayout(abaCaminhoLayout);
        abaCaminhoLayout.setHorizontalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaCaminhoLayout.setVerticalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Caminho", abaCaminho);

        tabelaSO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaSO.setViewportView(tabelaSO);

        painelBotoesSO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoSO1.setText("Carregar dados de Sistemas Operacionais");
        botaoSO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSO1ActionPerformed(evt);
            }
        });

        botaoSO2.setText("Estatisticas sobre dados de Sistemas Operacionais");

        javax.swing.GroupLayout painelBotoesSOLayout = new javax.swing.GroupLayout(painelBotoesSO);
        painelBotoesSO.setLayout(painelBotoesSOLayout);
        painelBotoesSOLayout.setHorizontalGroup(
            painelBotoesSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesSOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoSO1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSO2)
                .addContainerGap())
        );
        painelBotoesSOLayout.setVerticalGroup(
            painelBotoesSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesSOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSO1)
                    .addComponent(botaoSO2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosSO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNSO.setText("N de elementos distintos:");

        rotuloModaSO.setText("Moda:");

        javax.swing.GroupLayout painelDadosSOLayout = new javax.swing.GroupLayout(painelDadosSO);
        painelDadosSO.setLayout(painelDadosSOLayout);
        painelDadosSOLayout.setHorizontalGroup(
            painelDadosSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNSO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNSO)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaSO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaSO, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelDadosSOLayout.setVerticalGroup(
            painelDadosSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosSOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNSO)
                    .addComponent(campoNSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaSO)
                    .addComponent(campoModaSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaSoLayout = new javax.swing.GroupLayout(abaSo);
        abaSo.setLayout(abaSoLayout);
        abaSoLayout.setHorizontalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaSO, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaSoLayout.setVerticalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaSO, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Sistema Operacional", abaSo);

        tabelaBrowser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaBrowser.setViewportView(tabelaBrowser);

        painelBotoesBrowser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoBrowser1.setText("Carregar dados de Browsers");
        botaoBrowser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBrowser1ActionPerformed(evt);
            }
        });

        botaoBrowser2.setText("Estatisticas sobre dados de Browsers");

        javax.swing.GroupLayout painelBotoesBrowserLayout = new javax.swing.GroupLayout(painelBotoesBrowser);
        painelBotoesBrowser.setLayout(painelBotoesBrowserLayout);
        painelBotoesBrowserLayout.setHorizontalGroup(
            painelBotoesBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoBrowser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoBrowser2)
                .addContainerGap())
        );
        painelBotoesBrowserLayout.setVerticalGroup(
            painelBotoesBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoBrowser1)
                    .addComponent(botaoBrowser2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosBrowser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloNBrowser.setText("N de elementos distintos:");

        rotuloModaBrowser.setText("Moda:");

        javax.swing.GroupLayout painelDadosBrowserLayout = new javax.swing.GroupLayout(painelDadosBrowser);
        painelDadosBrowser.setLayout(painelDadosBrowserLayout);
        painelDadosBrowserLayout.setHorizontalGroup(
            painelDadosBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloNBrowser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNBrowser)
                .addGap(18, 18, 18)
                .addComponent(rotuloModaBrowser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModaBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelDadosBrowserLayout.setVerticalGroup(
            painelDadosBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosBrowserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNBrowser)
                    .addComponent(campoNBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloModaBrowser)
                    .addComponent(campoModaBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaBrowserLayout = new javax.swing.GroupLayout(abaBrowser);
        abaBrowser.setLayout(abaBrowserLayout);
        abaBrowserLayout.setHorizontalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(painelDadosBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaBrowserLayout.setVerticalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelDadosBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelComAbas.addTab("Browser", abaBrowser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelComAbas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelComAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lerLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerLogActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File arquivo = jFileChooser1.getSelectedFile();
            campoTextoCaminhoLog.setText(arquivo.getAbsolutePath());
            try {
                Scanner leia = new Scanner(arquivo);
                Dados dado;
                while (leia.hasNext()) {
                    dado = new Dados(leia.nextLine());
                    lista.add(dado);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Acesso ao arquivo cancelado pelo usuário");
        }
        
        
        
        campoNLog.setText(lista.size()+"");
        
        listarLog();
    }//GEN-LAST:event_lerLogActionPerformed

    private void painelComAbasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_painelComAbasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_painelComAbasFocusGained

    private void abaIPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaIPFocusGained
        
    }//GEN-LAST:event_abaIPFocusGained

    private void botaoIP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIP1ActionPerformed
        //Percorrer a lista e pegar cada IP
        List ips = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            ips.add(lista.get(i).getIp());
        }
        qualitativaIP = new Qualitativa(ips);
//        Collections.sort(qualitativaIP, XI[i]);
        
        listarQualitativaIP(qualitativaIP);
        campoModaIP.setText(qualitativaIP.getModa());
        campoNIP.setText(qualitativaIP.getXI().length+"");
        
        botaoIP2.setVisible(true);
//        botaoIP3.setVisible(true);
    }//GEN-LAST:event_botaoIP1ActionPerformed

    private void botaoIP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIP2ActionPerformed
        List ipsFis = new ArrayList<>();
        for (int i = 0; i < qualitativaIP.getFI().length; i++) {
            ipsFis.add(""+qualitativaIP.getFI()[i]);
        }
        discretaIP = new Discreta(ipsFis);
        
        listarDiscretaIP(discretaIP);
        botaoIP4.setVisible(true);
    }//GEN-LAST:event_botaoIP2ActionPerformed

    private void botaoData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoData1ActionPerformed
        qualitativaData = listarData();
        
        
        campoModaData.setText(qualitativaData.getModa());
        campoNData.setText(qualitativaData.getXI().length+"");
        
//        botaoData2.setVisible(true);
    }//GEN-LAST:event_botaoData1ActionPerformed

    private void botaoHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHorario1ActionPerformed
        continuaHorario = listarHorario();
//        botaoHorario2.setVisible(true);
    }//GEN-LAST:event_botaoHorario1ActionPerformed

    private void botaoHorario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHorario2ActionPerformed
        
    }//GEN-LAST:event_botaoHorario2ActionPerformed

    private void botaoLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLocalizacaoActionPerformed
        qualitativaLocalizacao = listarLocalizacao();
        
        campoModaLocalizacao.setText(qualitativaLocalizacao.getModa());
        campoNLocalizacao.setText(qualitativaLocalizacao.getXI().length+"");
        
//        botaoLocalizacao2.setVisible(true);
    }//GEN-LAST:event_botaoLocalizacaoActionPerformed

    private void botaoCabecalho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCabecalho1ActionPerformed
        qualitativaCabecalho = listarCabecalho();
        
        campoModaCabecalho.setText(qualitativaCabecalho.getModa());
        campoNCabecalho.setText(qualitativaCabecalho.getXI().length+"");
        
//        botaoCabecalho2.setVisible(true);
    }//GEN-LAST:event_botaoCabecalho1ActionPerformed

    private void botaoRequisicao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRequisicao1ActionPerformed
        qualitativaRequisicao = listarRequisicao();
        
        campoModaRequisicao.setText(qualitativaRequisicao.getModa());
        campoNRequisicao.setText(qualitativaRequisicao.getXI().length+"");
        
//        botaoRequisicao2.setVisible(true);
    }//GEN-LAST:event_botaoRequisicao1ActionPerformed

    private void botaoHTTP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHTTP1ActionPerformed
        qualitativaHTTP = listarHTTP();
        
        campoModaHTTP.setText(qualitativaHTTP.getModa());
        campoNHTTP.setText(qualitativaHTTP.getXI().length+"");
        
//        botaoHTTP2.setVisible(true);
    }//GEN-LAST:event_botaoHTTP1ActionPerformed

    private void botaoCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCodigo1ActionPerformed
        qualitativaCodigo = listarCodigo();
        
        campoModaCodigo.setText(qualitativaCodigo.getModa());
        campoNCodigo.setText(qualitativaCodigo.getXI().length+"");
        
//        botaoCodigo2.setVisible(true);
    }//GEN-LAST:event_botaoCodigo1ActionPerformed

    private void botaoTamano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTamano1ActionPerformed
        qualitativaTamanho = listarTamanho();
        
        campoModaTamanho.setText(qualitativaTamanho.getModa());
        campoNTamanho.setText(qualitativaTamanho.getXI().length+"");
        
//        botaoTamanho2.setVisible(true);
    }//GEN-LAST:event_botaoTamano1ActionPerformed

    private void botaoCaminho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCaminho1ActionPerformed
        qualitativaCaminho = listarCaminho();
        
        campoModaCaminho.setText(qualitativaCaminho.getModa());
        campoNCaminho.setText(qualitativaCaminho.getXI().length+"");
        
//        botaoCaminho2.setVisible(true);
    }//GEN-LAST:event_botaoCaminho1ActionPerformed

    private void botaoSO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSO1ActionPerformed
        qualitativaSO = listarSO();
        
        campoModaSO.setText(qualitativaSO.getModa());
        campoNSO.setText(qualitativaSO.getXI().length+"");
        
//        botaoSO2.setVisible(true);
    }//GEN-LAST:event_botaoSO1ActionPerformed

    private void botaoBrowser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBrowser1ActionPerformed
        qualitativaBrowser = listarBrowser();
        
        campoModaBrowser.setText(qualitativaBrowser.getModa());
        campoNBrowser.setText(qualitativaBrowser.getXI().length+"");
        
//        botaoBrowser2.setVisible(true);
    }//GEN-LAST:event_botaoBrowser1ActionPerformed

    private void botaoIP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIP4ActionPerformed
        janelaEstatisticaDiscreta(discretaIP);
    }//GEN-LAST:event_botaoIP4ActionPerformed

    private void botaoIP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIP3ActionPerformed
        janelaEstatisticaQualitativa(qualitativaIP);
    }//GEN-LAST:event_botaoIP3ActionPerformed

   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
   
    public void listarLog(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaLog.getModel();
        
//      Aqui verifico se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Aqui eu adiciono cada linha da lista na jTable
        for (Dados item : lista) {
            modeloTable.addRow(new Object[]{item.getIp(), item.getData(),
                item.getHorario(), item.getLocalizacao(), item.getCabecalho(),
                item.getRequisicao(), item.getHttpVersao(), item.getCodigoStatus(),
                item.getTamanhoBytes(), item.getCaminhoURL(), item.getSo(),
                item.getBrowser()});
        }
    }
    public void listarQualitativaIP(Qualitativa ip){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaIP.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < ip.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ ip.getXI()[i], ip.getFI()[i], ip.getFZI()[i], 
                quatro.format(ip.getFR()[i])+" %", quatro.format(ip.getFZR()[i])+" %"
            });
        }
    }
    public void listarDiscretaIP(Discreta ip){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaIP2.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < discretaIP.getXI().length; i++) {modeloTable.addRow(new Object[]{
            discretaIP.getXI()[i], discretaIP.getFI()[i],discretaIP.getFZI()[i], 
            quatro.format(discretaIP.getFR()[i])+" %", quatro.format(discretaIP.getFZR()[i])+" %", 
            quatro.format(discretaIP.getXIFI()[i]), quatro.format(discretaIP.getXIXFI()[i])
            });
        } 
    }
    public Qualitativa listarData(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaData.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] datas = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            datas[i] = lista.get(i).getData();
        }
        Qualitativa data = new Qualitativa(Roll.lerVetor(datas));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < data.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ data.getXI()[i], data.getFI()[i],
                data.getFZI()[i], quatro.format(data.getFR()[i])+" %", 
                quatro.format(data.getFZR()[i])+" %"
            });
        }  
        return data;
    }
    public Continua listarHorario(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaHorario.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] horarios = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            horarios[i] = lista.get(i).getHorario();
        }
        Continua horario = new Continua(Roll.lerVetor(horarios));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < horario.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ horario.getXI()[i], horario.getFI()[i],
                horario.getFZI()[i], quatro.format(horario.getFR()[i])+" %", 
                quatro.format(horario.getFZR()[i])+" %"
            });
        }  
        return horario;
    }
    public Qualitativa listarLocalizacao(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaLocalizacao.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] localizacoes = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            localizacoes[i] = lista.get(i).getLocalizacao();
        }
        
        Qualitativa localizacao = new Qualitativa(Roll.lerVetor(localizacoes));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < localizacao.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ localizacao.getXI()[i],
                localizacao.getFI()[i], localizacao.getFZI()[i], 
                quatro.format(localizacao.getFR()[i])+" %", 
                quatro.format(localizacao.getFZR()[i])+" %"
            });
        }  
        return localizacao;
    }
    public Qualitativa listarCabecalho(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaCabecalho.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] Cabecalhos = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            Cabecalhos[i] = lista.get(i).getCabecalho();
        }
        Qualitativa cabecalho = new Qualitativa(Roll.lerVetor(Cabecalhos));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < cabecalho.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ cabecalho.getXI()[i], cabecalho.getFI()[i], 
                cabecalho.getFZI()[i], quatro.format(cabecalho.getFR()[i])+" %",
                quatro.format(cabecalho.getFZR()[i])+" %"
            });
        }  
        return cabecalho;
    }
    public Qualitativa listarRequisicao(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaRequisicao.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] requisicoes = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            requisicoes[i] = lista.get(i).getRequisicao();
        }
        Qualitativa requisicao = new Qualitativa(Roll.lerVetor(requisicoes));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < requisicao.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ requisicao.getXI()[i], requisicao.getFI()[i],
                requisicao.getFZI()[i], quatro.format(requisicao.getFR()[i])+" %", 
                quatro.format(requisicao.getFZR()[i])+" %"
            });
        }  
        return requisicao;
    }
    public Qualitativa listarHTTP(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaHTTP.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] https = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            https[i] = lista.get(i).getHttpVersao();
        }
        Qualitativa http = new Qualitativa(Roll.lerVetor(https));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < http.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ http.getXI()[i], http.getFI()[i],
                http.getFZI()[i], quatro.format(http.getFR()[i])+" %", 
                quatro.format(http.getFZR()[i])+" %"
            });
        }  
        return http;
    }
    public Qualitativa listarCodigo(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaCodigo.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] Codigos = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            Codigos[i] = lista.get(i).getCodigoStatus();
        }
        Qualitativa codigo = new Qualitativa(Roll.lerVetor(Codigos));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < codigo.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ codigo.getXI()[i], codigo.getFI()[i],
                codigo.getFZI()[i], quatro.format(codigo.getFR()[i])+" %", 
                quatro.format(codigo.getFZR()[i])+" %"
            });
        }  
        return codigo;
    }
    public Qualitativa listarTamanho(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaTamanho.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] tamanhos = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            tamanhos[i] = lista.get(i).getTamanhoBytes();
        }
        Qualitativa tamanho = new Qualitativa(Roll.lerVetor(tamanhos));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < tamanho.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ tamanho.getXI()[i], tamanho.getFI()[i],
                tamanho.getFZI()[i], quatro.format(tamanho.getFR()[i])+" %", 
                quatro.format(tamanho.getFZR()[i])+" %"
            });
        }  
        return tamanho;
    }
    public Qualitativa listarCaminho(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaCaminho.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] caminhos = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            caminhos[i] = lista.get(i).getCaminhoURL();
        }
        Qualitativa caminho = new Qualitativa(Roll.lerVetor(caminhos));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < caminho.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ caminho.getXI()[i], caminho.getFI()[i],
                caminho.getFZI()[i], quatro.format(caminho.getFR()[i])+" %", 
                quatro.format(caminho.getFZR()[i])+" %"
            });
        }  
        return caminho;
    }
    public Qualitativa listarSO(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaSO.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] sos = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            sos[i] = lista.get(i).getSo();
        }
        Qualitativa so = new Qualitativa(Roll.lerVetor(sos));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < so.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ so.getXI()[i], so.getFI()[i],
                so.getFZI()[i], quatro.format(so.getFR()[i])+" %", 
                quatro.format(so.getFZR()[i])+" %"
            });
        }  
        return so;
    }
    public Qualitativa listarBrowser(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaBrowser.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] browsers = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            browsers[i] = lista.get(i).getBrowser();
        }
        Qualitativa browser = new Qualitativa(Roll.lerVetor(browsers));

//      Adicionar os atributos que eu escolher na jTable
        for (int i = 0; i < browser.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ browser.getXI()[i], browser.getFI()[i],
                browser.getFZI()[i], quatro.format(browser.getFR()[i])+" %", 
                quatro.format(browser.getFZR()[i])+" %"
            });
        } 
        return browser; 
    }
    
    public void janelaEstatisticaQualitativa(Qualitativa objeto){
        JFrameEstatisticas janelaQualitativa;
        janelaQualitativa = new JFrameEstatisticas(this, true);
        
        //alterar cada item que for necessario no frame
        janelaQualitativa.getCampoN().setText(objeto.getN()+"");
        janelaQualitativa.getCampoM().setVisible(false);
        janelaQualitativa.getCampoMZ().setVisible(false);
        janelaQualitativa.getCampoMedia().setVisible(false);
        janelaQualitativa.getCampoMediana().setVisible(false);
        janelaQualitativa.getCampoModa().setText(objeto.getModa()+"");
        janelaQualitativa.getCampoH().setVisible(false);
        janelaQualitativa.getCampoHZ().setVisible(false);
        janelaQualitativa.getRotuloH().setVisible(false);
        janelaQualitativa.getRotuloHZ().setVisible(false);
        
        //criar grafico
        DefaultPieDataset dadosPizza = new DefaultPieDataset();
        for (int i = 0; i < objeto.getXI().length; i++) {
            dadosPizza.setValue(objeto.getXI()[i]+"", objeto.getFR()[i]);   
        }
        JFreeChart graficoPizza = ChartFactory.createPieChart(
                "Titulo do grafico", dadosPizza, 
                true, true, false);
        
        ChartPanel painel = new ChartPanel(graficoPizza);
        
        janelaQualitativa.getPainelGrafico().removeAll();
        janelaQualitativa.getPainelGrafico().add(painel);
        janelaQualitativa.getPainelGrafico().validate();
        
        janelaQualitativa.setVisible(true);
    }
    public void janelaEstatisticaDiscreta(Discreta objeto){
        JFrameEstatisticas janelaQualitativa;
        janelaQualitativa = new JFrameEstatisticas(this, true);
        
        //alterar cada item que for necessario no frame
        janelaQualitativa.getCampoN().setText(objeto.getN()+"");
        janelaQualitativa.getCampoM().setText(objeto.getM()+"");
        janelaQualitativa.getCampoMZ().setText(objeto.getMZ()+"");
        janelaQualitativa.getCampoMedia().setText(objeto.getMedia()+"");
        janelaQualitativa.getCampoMediana().setText(objeto.getMediana()+"");
        janelaQualitativa.getCampoModa().setText(objeto.getModa()+"");
        janelaQualitativa.getCampoH().setVisible(false);
        janelaQualitativa.getCampoHZ().setVisible(false);
        janelaQualitativa.getRotuloH().setVisible(false);
        janelaQualitativa.getRotuloHZ().setVisible(false);
        
        //criar grafico
        DefaultPieDataset dadosPizza = new DefaultPieDataset();
        for (int i = 0; i < objeto.getXI().length; i++) {
            dadosPizza.setValue(objeto.getXI()[i]+"", objeto.getFR()[i]);   
        }
        JFreeChart graficoPizza = ChartFactory.createPieChart(
                "Titulo do grafico", dadosPizza, 
                true, true, false);
        
        ChartPanel painel = new ChartPanel(graficoPizza);
        
        janelaQualitativa.getPainelGrafico().removeAll();
        janelaQualitativa.getPainelGrafico().add(painel);
        janelaQualitativa.getPainelGrafico().validate();
        
        janelaQualitativa.setVisible(true);
    }
    public void janelaEstatisticaContinua(Continua objeto){
        JFrameEstatisticas janelaQualitativa;
        janelaQualitativa = new JFrameEstatisticas(this, true);
        
        //alterar cada item que for necessario no frame
        janelaQualitativa.getCampoN().setText(objeto.getN()+"");
        janelaQualitativa.getCampoM().setText(objeto.getM()+"");
        janelaQualitativa.getCampoMZ().setText(objeto.getMZ()+"");
        janelaQualitativa.getCampoMedia().setText(objeto.getMedia()+"");
        janelaQualitativa.getCampoMediana().setText(objeto.getMediana()+"");
        janelaQualitativa.getCampoModa().setText(objeto.getModa()+"");
        janelaQualitativa.getCampoH().setVisible(false);
        janelaQualitativa.getCampoHZ().setVisible(false);
        janelaQualitativa.getRotuloH().setVisible(false);
        janelaQualitativa.getRotuloHZ().setVisible(false);
        
        //criar grafico
        DefaultPieDataset dadosPizza = new DefaultPieDataset();
        for (int i = 0; i < objeto.getXI().length; i++) {
            dadosPizza.setValue(objeto.getXI()[i]+"", objeto.getFR()[i]);   
        }
        JFreeChart graficoPizza = ChartFactory.createPieChart(
                "Titulo do grafico", dadosPizza, 
                true, true, false);
        
        ChartPanel painel = new ChartPanel(graficoPizza);
        
        janelaQualitativa.getPainelGrafico().removeAll();
        janelaQualitativa.getPainelGrafico().add(painel);
        janelaQualitativa.getPainelGrafico().validate();
        
        janelaQualitativa.setVisible(true);
        
    }
    
    public void esconderAbas(){
        abaArquivo.setVisible(false);
        abaBrowser.setVisible(false);
        abaCabecalho.setVisible(false);
        abaCaminho.setVisible(false);
        abaCodigo.setVisible(false);
        abaData.setVisible(false);
        abaHTTP.setVisible(false);
        abaHorario.setVisible(false);
        abaIP.setVisible(false);
        abaLocalizacao.setVisible(false);
        abaRequisicao.setVisible(false);
        abaSo.setVisible(false);
        abaTamanho.setVisible(false);
    }
    public void mostrarAbas(){
        abaArquivo.setVisible(true);
        abaBrowser.setVisible(true);
        abaCabecalho.setVisible(true);
        abaCaminho.setVisible(true);
        abaCodigo.setVisible(true);
        abaData.setVisible(true);
        abaHTTP.setVisible(true);
        abaHorario.setVisible(true);
        abaIP.setVisible(true);
        abaLocalizacao.setVisible(true);
        abaRequisicao.setVisible(true);
        abaSo.setVisible(true);
        abaTamanho.setVisible(true);
    }
    
    public void esconderComponentes(){
        botaoIP2.setVisible(false);
        botaoIP3.setVisible(false);
        botaoIP4.setVisible(false);
        botaoBrowser2.setVisible(false);
        botaoCabecalho2.setVisible(false);
        botaoCaminho2.setVisible(false);
        botaoCodigo2.setVisible(false);
        botaoData2.setVisible(false);
        botaoHTTP2.setVisible(false);
        botaoHorario2.setVisible(false);
        botaoHorario3.setVisible(false);
        botaoLocalizacao2.setVisible(false);
        botaoRequisicao2.setVisible(false);
        botaoSO2.setVisible(false);
        botaoTamanho2.setVisible(false);
    }
    public void mostrarComponentes(){
        botaoIP2.setVisible(true);
        botaoIP3.setVisible(true);
        botaoIP4.setVisible(true);
        botaoBrowser2.setVisible(true);
        botaoCabecalho2.setVisible(true);
        botaoCaminho2.setVisible(true);
        botaoCodigo2.setVisible(true);
        botaoData2.setVisible(true);
        botaoHTTP2.setVisible(true);
        botaoHorario2.setVisible(true);
        botaoHorario3.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaArquivo;
    private javax.swing.JPanel abaBrowser;
    private javax.swing.JPanel abaCabecalho;
    private javax.swing.JPanel abaCaminho;
    private javax.swing.JPanel abaCodigo;
    private javax.swing.JPanel abaData;
    private javax.swing.JPanel abaHTTP;
    private javax.swing.JPanel abaHorario;
    private javax.swing.JPanel abaIP;
    private javax.swing.JPanel abaLocalizacao;
    private javax.swing.JPanel abaRequisicao;
    private javax.swing.JPanel abaSo;
    private javax.swing.JPanel abaTamanho;
    private javax.swing.JButton botaoBrowser1;
    private javax.swing.JButton botaoBrowser2;
    private javax.swing.JButton botaoCabecalho1;
    private javax.swing.JButton botaoCabecalho2;
    private javax.swing.JButton botaoCaminho1;
    private javax.swing.JButton botaoCaminho2;
    private javax.swing.JButton botaoCodigo1;
    private javax.swing.JButton botaoCodigo2;
    private javax.swing.JButton botaoData1;
    private javax.swing.JButton botaoData2;
    private javax.swing.JButton botaoHTTP1;
    private javax.swing.JButton botaoHTTP2;
    private javax.swing.JButton botaoHorario1;
    private javax.swing.JButton botaoHorario2;
    private javax.swing.JButton botaoHorario3;
    private javax.swing.JButton botaoIP1;
    private javax.swing.JButton botaoIP2;
    private javax.swing.JButton botaoIP3;
    private javax.swing.JButton botaoIP4;
    private javax.swing.JButton botaoLocalizacao;
    private javax.swing.JButton botaoLocalizacao2;
    private javax.swing.JButton botaoRequisicao1;
    private javax.swing.JButton botaoRequisicao2;
    private javax.swing.JButton botaoSO1;
    private javax.swing.JButton botaoSO2;
    private javax.swing.JButton botaoTamanho2;
    private javax.swing.JButton botaoTamano1;
    private javax.swing.JTextField campoModaBrowser;
    private javax.swing.JTextField campoModaCabecalho;
    private javax.swing.JTextField campoModaCaminho;
    private javax.swing.JTextField campoModaCodigo;
    private javax.swing.JTextField campoModaData;
    private javax.swing.JTextField campoModaHTTP;
    private javax.swing.JTextField campoModaHorario;
    private javax.swing.JTextField campoModaIP;
    private javax.swing.JTextField campoModaLocalizacao;
    private javax.swing.JTextField campoModaRequisicao;
    private javax.swing.JTextField campoModaSO;
    private javax.swing.JTextField campoModaTamanho;
    private javax.swing.JTextField campoNBrowser;
    private javax.swing.JTextField campoNCabecalho;
    private javax.swing.JTextField campoNCaminho;
    private javax.swing.JTextField campoNCodigo;
    private javax.swing.JTextField campoNData;
    private javax.swing.JTextField campoNHTTP;
    private javax.swing.JTextField campoNHorario;
    private javax.swing.JTextField campoNIP;
    private javax.swing.JTextField campoNLocalizacao;
    private javax.swing.JTextField campoNLog;
    private javax.swing.JTextField campoNRequisicao;
    private javax.swing.JTextField campoNSO;
    private javax.swing.JTextField campoNTamanho;
    private javax.swing.JTextField campoTextoCaminhoLog;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lerLog;
    private javax.swing.JPanel painelBotoesArquivo;
    private javax.swing.JPanel painelBotoesBrowser;
    private javax.swing.JPanel painelBotoesCabecalho;
    private javax.swing.JPanel painelBotoesCaminho;
    private javax.swing.JPanel painelBotoesCodigo;
    private javax.swing.JPanel painelBotoesData;
    private javax.swing.JPanel painelBotoesHTTP;
    private javax.swing.JPanel painelBotoesHorario;
    private javax.swing.JPanel painelBotoesIP;
    private javax.swing.JPanel painelBotoesLocalizacao;
    private javax.swing.JPanel painelBotoesRequisicao;
    private javax.swing.JPanel painelBotoesSO;
    private javax.swing.JPanel painelBotoesTamanho;
    private javax.swing.JTabbedPane painelComAbas;
    private javax.swing.JPanel painelDadosBrowser;
    private javax.swing.JPanel painelDadosCabecalho;
    private javax.swing.JPanel painelDadosCaminho;
    private javax.swing.JPanel painelDadosCodigo;
    private javax.swing.JPanel painelDadosData;
    private javax.swing.JPanel painelDadosHTTP;
    private javax.swing.JPanel painelDadosHorario;
    private javax.swing.JPanel painelDadosIP;
    private javax.swing.JPanel painelDadosLocalizacao;
    private javax.swing.JPanel painelDadosRequisicao;
    private javax.swing.JPanel painelDadosSO;
    private javax.swing.JPanel painelDadosTamanho;
    private javax.swing.JLabel rotuloModaBrowser;
    private javax.swing.JLabel rotuloModaCabecalho;
    private javax.swing.JLabel rotuloModaCaminho;
    private javax.swing.JLabel rotuloModaCodigo;
    private javax.swing.JLabel rotuloModaData;
    private javax.swing.JLabel rotuloModaHorario;
    private javax.swing.JLabel rotuloModaIP;
    private javax.swing.JLabel rotuloModaLocalizacao;
    private javax.swing.JLabel rotuloModaRequisicao;
    private javax.swing.JLabel rotuloModaSO;
    private javax.swing.JLabel rotuloModaTamanho;
    private javax.swing.JLabel rotuloNBrowser;
    private javax.swing.JLabel rotuloNCabecalho;
    private javax.swing.JLabel rotuloNCaminho;
    private javax.swing.JLabel rotuloNCodigo;
    private javax.swing.JLabel rotuloNData;
    private javax.swing.JLabel rotuloNHTTP;
    private javax.swing.JLabel rotuloNHorario;
    private javax.swing.JLabel rotuloNIP;
    private javax.swing.JLabel rotuloNLocalizacao;
    private javax.swing.JLabel rotuloNLog;
    private javax.swing.JLabel rotuloNRequisicao;
    private javax.swing.JLabel rotuloNSO;
    private javax.swing.JLabel rotuloNTamanho;
    private javax.swing.JLabel rotunoModaHTTP;
    private javax.swing.JScrollPane scrollTabelaBrowser;
    private javax.swing.JScrollPane scrollTabelaCabecalho;
    private javax.swing.JScrollPane scrollTabelaCaminho;
    private javax.swing.JScrollPane scrollTabelaCodigo;
    private javax.swing.JScrollPane scrollTabelaData;
    private javax.swing.JScrollPane scrollTabelaHTTP;
    private javax.swing.JScrollPane scrollTabelaHorario;
    private javax.swing.JScrollPane scrollTabelaIP;
    private javax.swing.JScrollPane scrollTabelaIP2;
    private javax.swing.JScrollPane scrollTabelaLocalizacao;
    private javax.swing.JScrollPane scrollTabelaLog;
    private javax.swing.JScrollPane scrollTabelaRequisicao;
    private javax.swing.JScrollPane scrollTabelaSO;
    private javax.swing.JScrollPane scrollTabelaTamanho;
    private javax.swing.JTable tabelaBrowser;
    private javax.swing.JTable tabelaCabecalho;
    private javax.swing.JTable tabelaCaminho;
    private javax.swing.JTable tabelaCodigo;
    private javax.swing.JTable tabelaData;
    private javax.swing.JTable tabelaHTTP;
    private javax.swing.JTable tabelaHorario;
    private javax.swing.JTable tabelaIP;
    private javax.swing.JTable tabelaIP2;
    private javax.swing.JTable tabelaLocalizacao;
    private javax.swing.JTable tabelaLog;
    private javax.swing.JTable tabelaRequisicao;
    private javax.swing.JTable tabelaSO;
    private javax.swing.JTable tabelaTamanho;
    // End of variables declaration//GEN-END:variables
}
