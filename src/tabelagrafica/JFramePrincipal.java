package tabelagrafica;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;

public class JFramePrincipal extends javax.swing.JFrame {
    
    ArrayList<Dados> lista = new ArrayList<>();
    Qualitativa ip;

    public JFramePrincipal() {
        initComponents();
        
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
        abaIP = new javax.swing.JPanel();
        scrollTabelaIP = new javax.swing.JScrollPane();
        tabelaIP = new javax.swing.JTable();
        scrollTabelaIP2 = new javax.swing.JScrollPane();
        tabelaIP2 = new javax.swing.JTable();
        painelBotoesIP = new javax.swing.JPanel();
        botaoIP1 = new javax.swing.JButton();
        botaoIP2 = new javax.swing.JButton();
        abaData = new javax.swing.JPanel();
        scrollTabelaData = new javax.swing.JScrollPane();
        tabelaData = new javax.swing.JTable();
        painelBotoesData = new javax.swing.JPanel();
        botaoData1 = new javax.swing.JButton();
        abaHorario = new javax.swing.JPanel();
        scrollTabelaHorario = new javax.swing.JScrollPane();
        tabelaHorario = new javax.swing.JTable();
        painelBotoesHorario = new javax.swing.JPanel();
        botaoHorario1 = new javax.swing.JButton();
        abaLocalizacao = new javax.swing.JPanel();
        scrollTabelaLocalizacao = new javax.swing.JScrollPane();
        tabelaLocalizacao = new javax.swing.JTable();
        painelBotoesLocalizacao = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        abaCabecalho = new javax.swing.JPanel();
        scrollTabelaCabecalho = new javax.swing.JScrollPane();
        tabelaCabecalho = new javax.swing.JTable();
        painelBotoesCabecalho = new javax.swing.JPanel();
        botaoCabecalho1 = new javax.swing.JButton();
        abaRequisicao = new javax.swing.JPanel();
        scrollTabelaRequisicao = new javax.swing.JScrollPane();
        tabelaRequisicao = new javax.swing.JTable();
        painelBotoesRequisicao = new javax.swing.JPanel();
        botaoRequisicao1 = new javax.swing.JButton();
        abaHTTP = new javax.swing.JPanel();
        scrollTabelaHTTP = new javax.swing.JScrollPane();
        tabelaHTTP = new javax.swing.JTable();
        painelBotoesHTTP = new javax.swing.JPanel();
        botaoHTTP1 = new javax.swing.JButton();
        abaCodigo = new javax.swing.JPanel();
        scrollTabelaCodigo = new javax.swing.JScrollPane();
        tabelaCodigo = new javax.swing.JTable();
        painelBotoesCodigo = new javax.swing.JPanel();
        botaoCodigo1 = new javax.swing.JButton();
        abaTamanho = new javax.swing.JPanel();
        scrollTabelaTamanho = new javax.swing.JScrollPane();
        tabelaTamanho = new javax.swing.JTable();
        painelBotoesTamanho = new javax.swing.JPanel();
        botaoTamano1 = new javax.swing.JButton();
        abaCaminho = new javax.swing.JPanel();
        scrollTabelaCaminho = new javax.swing.JScrollPane();
        tabelaCaminho = new javax.swing.JTable();
        painelBotoesCaminho = new javax.swing.JPanel();
        botaoCaminho1 = new javax.swing.JButton();
        abaSo = new javax.swing.JPanel();
        scrollTabelaSO = new javax.swing.JScrollPane();
        tabelaSO = new javax.swing.JTable();
        painelBotoesSO = new javax.swing.JPanel();
        botaoSO1 = new javax.swing.JButton();
        abaBrowser = new javax.swing.JPanel();
        scrollTabelaBrowser = new javax.swing.JScrollPane();
        tabelaBrowser = new javax.swing.JTable();
        painelBotoesBrowser = new javax.swing.JPanel();
        botaoBrowser1 = new javax.swing.JButton();

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

        javax.swing.GroupLayout abaArquivoLayout = new javax.swing.GroupLayout(abaArquivo);
        abaArquivo.setLayout(abaArquivoLayout);
        abaArquivoLayout.setHorizontalGroup(
            abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaArquivoLayout.setVerticalGroup(
            abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaLog, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelComAbas.addTab("Arquivo", abaArquivo);

        abaIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaIPFocusGained(evt);
            }
        });

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

        tabelaIP2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr", "Xi * fi", "(media * fi)"
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

        javax.swing.GroupLayout painelBotoesIPLayout = new javax.swing.GroupLayout(painelBotoesIP);
        painelBotoesIP.setLayout(painelBotoesIPLayout);
        painelBotoesIPLayout.setHorizontalGroup(
            painelBotoesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoIP1)
                .addGap(18, 18, 18)
                .addComponent(botaoIP2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesIPLayout.setVerticalGroup(
            painelBotoesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIP1)
                    .addComponent(botaoIP2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaIPLayout = new javax.swing.GroupLayout(abaIP);
        abaIP.setLayout(abaIPLayout);
        abaIPLayout.setHorizontalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(abaIPLayout.createSequentialGroup()
                        .addComponent(scrollTabelaIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollTabelaIP2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)))
                .addContainerGap())
        );
        abaIPLayout.setVerticalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaIP, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addComponent(scrollTabelaIP2))
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

        javax.swing.GroupLayout painelBotoesDataLayout = new javax.swing.GroupLayout(painelBotoesData);
        painelBotoesData.setLayout(painelBotoesDataLayout);
        painelBotoesDataLayout.setHorizontalGroup(
            painelBotoesDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoData1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesDataLayout.setVerticalGroup(
            painelBotoesDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoData1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaDataLayout = new javax.swing.GroupLayout(abaData);
        abaData.setLayout(abaDataLayout);
        abaDataLayout.setHorizontalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaData, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                    .addComponent(painelBotoesData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaDataLayout.setVerticalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaData, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        javax.swing.GroupLayout painelBotoesHorarioLayout = new javax.swing.GroupLayout(painelBotoesHorario);
        painelBotoesHorario.setLayout(painelBotoesHorarioLayout);
        painelBotoesHorarioLayout.setHorizontalGroup(
            painelBotoesHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoHorario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesHorarioLayout.setVerticalGroup(
            painelBotoesHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoHorario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaHorarioLayout = new javax.swing.GroupLayout(abaHorario);
        abaHorario.setLayout(abaHorarioLayout);
        abaHorarioLayout.setHorizontalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                    .addComponent(painelBotoesHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaHorarioLayout.setVerticalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        jButton1.setText("Carregar dados de localizacao");

        javax.swing.GroupLayout painelBotoesLocalizacaoLayout = new javax.swing.GroupLayout(painelBotoesLocalizacao);
        painelBotoesLocalizacao.setLayout(painelBotoesLocalizacaoLayout);
        painelBotoesLocalizacaoLayout.setHorizontalGroup(
            painelBotoesLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLocalizacaoLayout.setVerticalGroup(
            painelBotoesLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaLocalizacaoLayout = new javax.swing.GroupLayout(abaLocalizacao);
        abaLocalizacao.setLayout(abaLocalizacaoLayout);
        abaLocalizacaoLayout.setHorizontalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaLocalizacaoLayout.setVerticalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        botaoCabecalho1.setText("Carregar dados de requisicoes");

        javax.swing.GroupLayout painelBotoesCabecalhoLayout = new javax.swing.GroupLayout(painelBotoesCabecalho);
        painelBotoesCabecalho.setLayout(painelBotoesCabecalhoLayout);
        painelBotoesCabecalhoLayout.setHorizontalGroup(
            painelBotoesCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCabecalho1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesCabecalhoLayout.setVerticalGroup(
            painelBotoesCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCabecalho1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCabecalhoLayout = new javax.swing.GroupLayout(abaCabecalho);
        abaCabecalho.setLayout(abaCabecalhoLayout);
        abaCabecalhoLayout.setHorizontalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaCabecalhoLayout.setVerticalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        javax.swing.GroupLayout painelBotoesRequisicaoLayout = new javax.swing.GroupLayout(painelBotoesRequisicao);
        painelBotoesRequisicao.setLayout(painelBotoesRequisicaoLayout);
        painelBotoesRequisicaoLayout.setHorizontalGroup(
            painelBotoesRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoRequisicao1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesRequisicaoLayout.setVerticalGroup(
            painelBotoesRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoRequisicao1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaRequisicaoLayout = new javax.swing.GroupLayout(abaRequisicao);
        abaRequisicao.setLayout(abaRequisicaoLayout);
        abaRequisicaoLayout.setHorizontalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaRequisicaoLayout.setVerticalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        javax.swing.GroupLayout painelBotoesHTTPLayout = new javax.swing.GroupLayout(painelBotoesHTTP);
        painelBotoesHTTP.setLayout(painelBotoesHTTPLayout);
        painelBotoesHTTPLayout.setHorizontalGroup(
            painelBotoesHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoHTTP1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesHTTPLayout.setVerticalGroup(
            painelBotoesHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoHTTP1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaHTTPLayout = new javax.swing.GroupLayout(abaHTTP);
        abaHTTP.setLayout(abaHTTPLayout);
        abaHTTPLayout.setHorizontalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesHTTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaHTTP, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaHTTPLayout.setVerticalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaHTTP, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        javax.swing.GroupLayout painelBotoesCodigoLayout = new javax.swing.GroupLayout(painelBotoesCodigo);
        painelBotoesCodigo.setLayout(painelBotoesCodigoLayout);
        painelBotoesCodigoLayout.setHorizontalGroup(
            painelBotoesCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCodigo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesCodigoLayout.setVerticalGroup(
            painelBotoesCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCodigo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCodigoLayout = new javax.swing.GroupLayout(abaCodigo);
        abaCodigo.setLayout(abaCodigoLayout);
        abaCodigoLayout.setHorizontalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaCodigoLayout.setVerticalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        botaoTamano1.setText("Carregar dados de tamanho de requisicoes");

        javax.swing.GroupLayout painelBotoesTamanhoLayout = new javax.swing.GroupLayout(painelBotoesTamanho);
        painelBotoesTamanho.setLayout(painelBotoesTamanhoLayout);
        painelBotoesTamanhoLayout.setHorizontalGroup(
            painelBotoesTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoTamano1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesTamanhoLayout.setVerticalGroup(
            painelBotoesTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoTamano1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaTamanhoLayout = new javax.swing.GroupLayout(abaTamanho);
        abaTamanho.setLayout(abaTamanhoLayout);
        abaTamanhoLayout.setHorizontalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaTamanhoLayout.setVerticalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        javax.swing.GroupLayout painelBotoesCaminhoLayout = new javax.swing.GroupLayout(painelBotoesCaminho);
        painelBotoesCaminho.setLayout(painelBotoesCaminhoLayout);
        painelBotoesCaminhoLayout.setHorizontalGroup(
            painelBotoesCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCaminho1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesCaminhoLayout.setVerticalGroup(
            painelBotoesCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCaminho1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCaminhoLayout = new javax.swing.GroupLayout(abaCaminho);
        abaCaminho.setLayout(abaCaminhoLayout);
        abaCaminhoLayout.setHorizontalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaCaminhoLayout.setVerticalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        javax.swing.GroupLayout painelBotoesSOLayout = new javax.swing.GroupLayout(painelBotoesSO);
        painelBotoesSO.setLayout(painelBotoesSOLayout);
        painelBotoesSOLayout.setHorizontalGroup(
            painelBotoesSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesSOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoSO1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesSOLayout.setVerticalGroup(
            painelBotoesSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesSOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoSO1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaSoLayout = new javax.swing.GroupLayout(abaSo);
        abaSo.setLayout(abaSoLayout);
        abaSoLayout.setHorizontalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaSO, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaSoLayout.setVerticalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaSO, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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

        botaoBrowser1.setText("Carregar dados de browswers");

        javax.swing.GroupLayout painelBotoesBrowserLayout = new javax.swing.GroupLayout(painelBotoesBrowser);
        painelBotoesBrowser.setLayout(painelBotoesBrowserLayout);
        painelBotoesBrowserLayout.setHorizontalGroup(
            painelBotoesBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoBrowser1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesBrowserLayout.setVerticalGroup(
            painelBotoesBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoBrowser1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaBrowserLayout = new javax.swing.GroupLayout(abaBrowser);
        abaBrowser.setLayout(abaBrowserLayout);
        abaBrowserLayout.setHorizontalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoesBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabelaBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaBrowserLayout.setVerticalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoesBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabelaBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
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
            .addComponent(painelComAbas)
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
        
        listarLog();
    }//GEN-LAST:event_lerLogActionPerformed

    private void painelComAbasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_painelComAbasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_painelComAbasFocusGained

    private void abaIPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaIPFocusGained
        
    }//GEN-LAST:event_abaIPFocusGained

    private void botaoIP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIP1ActionPerformed
        ip = listarIP();
        quantitativaIP(ip);
        Plot plot = new PiePlot();
        JFreeChart grafico = new JFreeChart(plot);
    }//GEN-LAST:event_botaoIP1ActionPerformed

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
    public Qualitativa listarIP(){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaIP.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
//      Percorrer a lista e pegar cada IP
        String[] ips = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            ips[i] = lista.get(i).getIp();
        }
        Qualitativa ip = new Qualitativa(Roll.lerVetor(ips));

//      Adicionar os atributos que eu escolher na jTable
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < ip.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ ip.getXI()[i], ip.getFI()[i],
                ip.getFZI()[i], ip.getFR()[i], ip.getFZR()[i]
            });
        }  
        return ip;
    }
    public void quantitativaIP(Qualitativa ip){
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaIP2.getModel();
        
//      Verificar se a jTable tem algum registro, se tiver eu deleto
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
        List<String> qualquercoisa = new ArrayList<>();
        for (int i = 0; i < ip.getFI().length; i++) {
            qualquercoisa.add(""+ip.getFI()[i]);
        }
        Discreta ipDiscreto = new Discreta(qualquercoisa);

//      Adicionar os atributos que eu escolher na jTable
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < ipDiscreto.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ ipDiscreto.getXI()[i], ipDiscreto.getFI()[i],
                ipDiscreto.getFZI()[i], ipDiscreto.getFR()[i], ipDiscreto.getFZR()[i],
                ipDiscreto.getXIFI(), ipDiscreto.getXIXFI()
            });
        } 
    }
    public void listarData(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < data.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ data.getXI()[i], data.getFI()[i],
                data.getFZI()[i], data.getFR()[i], data.getFZR()[i]
            });
        }  
    }
    public void listarHorario(){
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
        Qualitativa horario = new Qualitativa(Roll.lerVetor(horarios));

//      Adicionar os atributos que eu escolher na jTable
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < horario.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ horario.getXI()[i], horario.getFI()[i],
                horario.getFZI()[i], horario.getFR()[i], horario.getFZR()[i]
            });
        }  
    }
    public void listarLocalizacao(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < localizacao.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ localizacao.getXI()[i],
                localizacao.getFI()[i], localizacao.getFZI()[i], 
                localizacao.getFR()[i], localizacao.getFZR()[i]
            });
        }  
    }
    public void listarCabecalho(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < cabecalho.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ cabecalho.getXI()[i],
                cabecalho.getFI()[i], cabecalho.getFZI()[i],
                cabecalho.getFR()[i], cabecalho.getFZR()[i]
            });
        }  
    }
    public void listarRequisicao(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < requisicao.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ requisicao.getXI()[i],
                requisicao.getFI()[i], requisicao.getFZI()[i],
                requisicao.getFR()[i], requisicao.getFZR()[i]
            });
        }  
    }
    public void listarHTTP(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < http.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ http.getXI()[i], http.getFI()[i],
                http.getFZI()[i], http.getFR()[i], http.getFZR()[i]
            });
        }  
    }
    public void listarCodigo(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < codigo.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ codigo.getXI()[i], codigo.getFI()[i],
                codigo.getFZI()[i], codigo.getFR()[i], codigo.getFZR()[i]
            });
        }  
    }
    public void listarTamanho(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < tamanho.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ tamanho.getXI()[i], tamanho.getFI()[i],
                tamanho.getFZI()[i], tamanho.getFR()[i], tamanho.getFZR()[i]
            });
        }  
    }
    public void listarCaminho(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < caminho.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ caminho.getXI()[i], caminho.getFI()[i],
                caminho.getFZI()[i], caminho.getFR()[i], caminho.getFZR()[i]
            });
        }  
    }
    public void listarSO(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < so.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ so.getXI()[i], so.getFI()[i],
                so.getFZI()[i], so.getFR()[i], so.getFZR()[i]
            });
        }  
    }
    public void listarBrowser(){
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
        DecimalFormat fr = new DecimalFormat ("#,##0.0000",
                            new DecimalFormatSymbols (new Locale ("pt", "BR")));

        for (int i = 0; i < browser.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ browser.getXI()[i], browser.getFI()[i],
                browser.getFZI()[i], browser.getFR()[i], browser.getFZR()[i]
            });
        }  
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
    private javax.swing.JButton botaoCabecalho1;
    private javax.swing.JButton botaoCaminho1;
    private javax.swing.JButton botaoCodigo1;
    private javax.swing.JButton botaoData1;
    private javax.swing.JButton botaoHTTP1;
    private javax.swing.JButton botaoHorario1;
    private javax.swing.JButton botaoIP1;
    private javax.swing.JButton botaoIP2;
    private javax.swing.JButton botaoRequisicao1;
    private javax.swing.JButton botaoSO1;
    private javax.swing.JButton botaoTamano1;
    private javax.swing.JTextField campoTextoCaminhoLog;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
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
