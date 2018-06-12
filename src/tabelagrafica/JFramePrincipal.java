package tabelagrafica;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFramePrincipal extends javax.swing.JFrame {
    
    ArrayList<Dados> lista = new ArrayList<>();

    public JFramePrincipal() {
        initComponents();
        
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        painelComAbas = new javax.swing.JTabbedPane();
        abaArquivo = new javax.swing.JPanel();
        painelBotoes1 = new javax.swing.JPanel();
        lerLog = new javax.swing.JButton();
        painelTabelaLog = new javax.swing.JPanel();
        scrollTabelaLog = new javax.swing.JScrollPane();
        tabelaLog = new javax.swing.JTable();
        abaIP = new javax.swing.JPanel();
        painelTabelaIP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaIP = new javax.swing.JTable();
        abaData = new javax.swing.JPanel();
        painelTabelaData = new javax.swing.JPanel();
        scrollTabelaData = new javax.swing.JScrollPane();
        tabelaData = new javax.swing.JTable();
        abaHorario = new javax.swing.JPanel();
        painelTabelaHorario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaHorario = new javax.swing.JTable();
        abaLocalizacao = new javax.swing.JPanel();
        painelTabelaLocalizacao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaLocalizacao = new javax.swing.JTable();
        abaCabecalho = new javax.swing.JPanel();
        painelCabecalho = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaCabecalho = new javax.swing.JTable();
        abaRequisicao = new javax.swing.JPanel();
        painelTabelaRequisicao = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaRequisicao = new javax.swing.JTable();
        abaHTTP = new javax.swing.JPanel();
        painelTabelaHTTP = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaHTTP = new javax.swing.JTable();
        abaCodigo = new javax.swing.JPanel();
        painelTabelaCodigo = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaCodigo = new javax.swing.JTable();
        abaTamanho = new javax.swing.JPanel();
        painelTabelaTamanho = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaTamanho = new javax.swing.JTable();
        abaCaminho = new javax.swing.JPanel();
        painelTabelaCaminho = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelaCaminho = new javax.swing.JTable();
        abaSo = new javax.swing.JPanel();
        painelTabelaSo = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabelaSo = new javax.swing.JTable();
        abaBrowser = new javax.swing.JPanel();
        painelTabelaBrowser = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabelaBrowser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelComAbas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                painelComAbasFocusGained(evt);
            }
        });

        painelBotoes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lerLog.setText("Ler Log");
        lerLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoes1Layout = new javax.swing.GroupLayout(painelBotoes1);
        painelBotoes1.setLayout(painelBotoes1Layout);
        painelBotoes1Layout.setHorizontalGroup(
            painelBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lerLog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoes1Layout.setVerticalGroup(
            painelBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lerLog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTabelaLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout painelTabelaLogLayout = new javax.swing.GroupLayout(painelTabelaLog);
        painelTabelaLog.setLayout(painelTabelaLogLayout);
        painelTabelaLogLayout.setHorizontalGroup(
            painelTabelaLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabelaLog, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTabelaLogLayout.setVerticalGroup(
            painelTabelaLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabelaLog, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout abaArquivoLayout = new javax.swing.GroupLayout(abaArquivo);
        abaArquivo.setLayout(abaArquivoLayout);
        abaArquivoLayout.setHorizontalGroup(
            abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelTabelaLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBotoes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaArquivoLayout.setVerticalGroup(
            abaArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelTabelaLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelComAbas.addTab("Arquivo", abaArquivo);

        abaIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaIPFocusGained(evt);
            }
        });

        painelTabelaIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaIP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "XI", "fi", "Fi", "fr", "Fr"
            }
        ));
        jScrollPane1.setViewportView(tabelaIP);

        javax.swing.GroupLayout painelTabelaIPLayout = new javax.swing.GroupLayout(painelTabelaIP);
        painelTabelaIP.setLayout(painelTabelaIPLayout);
        painelTabelaIPLayout.setHorizontalGroup(
            painelTabelaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTabelaIPLayout.setVerticalGroup(
            painelTabelaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout abaIPLayout = new javax.swing.GroupLayout(abaIP);
        abaIP.setLayout(abaIPLayout);
        abaIPLayout.setHorizontalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        abaIPLayout.setVerticalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        painelComAbas.addTab("IP", abaIP);

        painelTabelaData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTabelaData.setViewportView(tabelaData);

        javax.swing.GroupLayout painelTabelaDataLayout = new javax.swing.GroupLayout(painelTabelaData);
        painelTabelaData.setLayout(painelTabelaDataLayout);
        painelTabelaDataLayout.setHorizontalGroup(
            painelTabelaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabelaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        painelTabelaDataLayout.setVerticalGroup(
            painelTabelaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabelaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaDataLayout = new javax.swing.GroupLayout(abaData);
        abaData.setLayout(abaDataLayout);
        abaDataLayout.setHorizontalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        abaDataLayout.setVerticalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Data", abaData);

        painelTabelaHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaHorario);

        javax.swing.GroupLayout painelTabelaHorarioLayout = new javax.swing.GroupLayout(painelTabelaHorario);
        painelTabelaHorario.setLayout(painelTabelaHorarioLayout);
        painelTabelaHorarioLayout.setHorizontalGroup(
            painelTabelaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        painelTabelaHorarioLayout.setVerticalGroup(
            painelTabelaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaHorarioLayout = new javax.swing.GroupLayout(abaHorario);
        abaHorario.setLayout(abaHorarioLayout);
        abaHorarioLayout.setHorizontalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        abaHorarioLayout.setVerticalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Horario", abaHorario);

        painelTabelaLocalizacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaLocalizacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabelaLocalizacao);

        javax.swing.GroupLayout painelTabelaLocalizacaoLayout = new javax.swing.GroupLayout(painelTabelaLocalizacao);
        painelTabelaLocalizacao.setLayout(painelTabelaLocalizacaoLayout);
        painelTabelaLocalizacaoLayout.setHorizontalGroup(
            painelTabelaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        painelTabelaLocalizacaoLayout.setVerticalGroup(
            painelTabelaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaLocalizacaoLayout = new javax.swing.GroupLayout(abaLocalizacao);
        abaLocalizacao.setLayout(abaLocalizacaoLayout);
        abaLocalizacaoLayout.setHorizontalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        abaLocalizacaoLayout.setVerticalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Localização", abaLocalizacao);

        painelCabecalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaCabecalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabelaCabecalho);

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCabecalhoLayout = new javax.swing.GroupLayout(abaCabecalho);
        abaCabecalho.setLayout(abaCabecalhoLayout);
        abaCabecalhoLayout.setHorizontalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        abaCabecalhoLayout.setVerticalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Cabeçalho da requisição", abaCabecalho);

        painelTabelaRequisicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaRequisicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tabelaRequisicao);

        javax.swing.GroupLayout painelTabelaRequisicaoLayout = new javax.swing.GroupLayout(painelTabelaRequisicao);
        painelTabelaRequisicao.setLayout(painelTabelaRequisicaoLayout);
        painelTabelaRequisicaoLayout.setHorizontalGroup(
            painelTabelaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        painelTabelaRequisicaoLayout.setVerticalGroup(
            painelTabelaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaRequisicaoLayout = new javax.swing.GroupLayout(abaRequisicao);
        abaRequisicao.setLayout(abaRequisicaoLayout);
        abaRequisicaoLayout.setHorizontalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        abaRequisicaoLayout.setVerticalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Requisição", abaRequisicao);

        painelTabelaHTTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaHTTP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tabelaHTTP);

        javax.swing.GroupLayout painelTabelaHTTPLayout = new javax.swing.GroupLayout(painelTabelaHTTP);
        painelTabelaHTTP.setLayout(painelTabelaHTTPLayout);
        painelTabelaHTTPLayout.setHorizontalGroup(
            painelTabelaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );
        painelTabelaHTTPLayout.setVerticalGroup(
            painelTabelaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaHTTPLayout = new javax.swing.GroupLayout(abaHTTP);
        abaHTTP.setLayout(abaHTTPLayout);
        abaHTTPLayout.setHorizontalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        abaHTTPLayout.setVerticalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Verção do HTTP", abaHTTP);

        painelTabelaCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaCodigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tabelaCodigo);

        javax.swing.GroupLayout painelTabelaCodigoLayout = new javax.swing.GroupLayout(painelTabelaCodigo);
        painelTabelaCodigo.setLayout(painelTabelaCodigoLayout);
        painelTabelaCodigoLayout.setHorizontalGroup(
            painelTabelaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
        );
        painelTabelaCodigoLayout.setVerticalGroup(
            painelTabelaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCodigoLayout = new javax.swing.GroupLayout(abaCodigo);
        abaCodigo.setLayout(abaCodigoLayout);
        abaCodigoLayout.setHorizontalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        abaCodigoLayout.setVerticalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Código", abaCodigo);

        painelTabelaTamanho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaTamanho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tabelaTamanho);

        javax.swing.GroupLayout painelTabelaTamanhoLayout = new javax.swing.GroupLayout(painelTabelaTamanho);
        painelTabelaTamanho.setLayout(painelTabelaTamanhoLayout);
        painelTabelaTamanhoLayout.setHorizontalGroup(
            painelTabelaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        painelTabelaTamanhoLayout.setVerticalGroup(
            painelTabelaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaTamanhoLayout = new javax.swing.GroupLayout(abaTamanho);
        abaTamanho.setLayout(abaTamanhoLayout);
        abaTamanhoLayout.setHorizontalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        abaTamanhoLayout.setVerticalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Tamanho", abaTamanho);

        painelTabelaCaminho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaCaminho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(tabelaCaminho);

        javax.swing.GroupLayout painelTabelaCaminhoLayout = new javax.swing.GroupLayout(painelTabelaCaminho);
        painelTabelaCaminho.setLayout(painelTabelaCaminhoLayout);
        painelTabelaCaminhoLayout.setHorizontalGroup(
            painelTabelaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        painelTabelaCaminhoLayout.setVerticalGroup(
            painelTabelaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCaminhoLayout = new javax.swing.GroupLayout(abaCaminho);
        abaCaminho.setLayout(abaCaminhoLayout);
        abaCaminhoLayout.setHorizontalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        abaCaminhoLayout.setVerticalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Caminho", abaCaminho);

        painelTabelaSo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaSo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tabelaSo);

        javax.swing.GroupLayout painelTabelaSoLayout = new javax.swing.GroupLayout(painelTabelaSo);
        painelTabelaSo.setLayout(painelTabelaSoLayout);
        painelTabelaSoLayout.setHorizontalGroup(
            painelTabelaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        painelTabelaSoLayout.setVerticalGroup(
            painelTabelaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaSoLayout = new javax.swing.GroupLayout(abaSo);
        abaSo.setLayout(abaSoLayout);
        abaSoLayout.setHorizontalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        abaSoLayout.setVerticalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Sistema Operacional", abaSo);

        painelTabelaBrowser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaBrowser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(tabelaBrowser);

        javax.swing.GroupLayout painelTabelaBrowserLayout = new javax.swing.GroupLayout(painelTabelaBrowser);
        painelTabelaBrowser.setLayout(painelTabelaBrowserLayout);
        painelTabelaBrowserLayout.setHorizontalGroup(
            painelTabelaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        painelTabelaBrowserLayout.setVerticalGroup(
            painelTabelaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaBrowserLayout = new javax.swing.GroupLayout(abaBrowser);
        abaBrowser.setLayout(abaBrowserLayout);
        abaBrowserLayout.setHorizontalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        abaBrowserLayout.setVerticalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Browser", abaBrowser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelComAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelComAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lerLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerLogActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File arquivo = jFileChooser1.getSelectedFile();
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
        listarIP();
    }//GEN-LAST:event_lerLogActionPerformed

    private void painelComAbasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_painelComAbasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_painelComAbasFocusGained

    private void abaIPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaIPFocusGained
        listarIP();
    }//GEN-LAST:event_abaIPFocusGained

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
    public void listarIP(){
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
        DecimalFormat fr = new DecimalFormat("0.0000 %");

        for (int i = 0; i < ip.getXI().length; i++) {
            modeloTable.addRow(new Object[]{ ip.getXI()[i], ip.getFI()[i],
                ip.getFZI()[i], ip.getFR()[i], ip.getFZR()[i]
            });
        }

        
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
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton lerLog;
    private javax.swing.JPanel painelBotoes1;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JTabbedPane painelComAbas;
    private javax.swing.JPanel painelTabelaBrowser;
    private javax.swing.JPanel painelTabelaCaminho;
    private javax.swing.JPanel painelTabelaCodigo;
    private javax.swing.JPanel painelTabelaData;
    private javax.swing.JPanel painelTabelaHTTP;
    private javax.swing.JPanel painelTabelaHorario;
    private javax.swing.JPanel painelTabelaIP;
    private javax.swing.JPanel painelTabelaLocalizacao;
    private javax.swing.JPanel painelTabelaLog;
    private javax.swing.JPanel painelTabelaRequisicao;
    private javax.swing.JPanel painelTabelaSo;
    private javax.swing.JPanel painelTabelaTamanho;
    private javax.swing.JScrollPane scrollTabelaData;
    private javax.swing.JScrollPane scrollTabelaLog;
    private javax.swing.JTable tabelaBrowser;
    private javax.swing.JTable tabelaCabecalho;
    private javax.swing.JTable tabelaCaminho;
    private javax.swing.JTable tabelaCodigo;
    private javax.swing.JTable tabelaData;
    private javax.swing.JTable tabelaHTTP;
    private javax.swing.JTable tabelaHorario;
    private javax.swing.JTable tabelaIP;
    private javax.swing.JTable tabelaLocalizacao;
    private javax.swing.JTable tabelaLog;
    private javax.swing.JTable tabelaRequisicao;
    private javax.swing.JTable tabelaSo;
    private javax.swing.JTable tabelaTamanho;
    // End of variables declaration//GEN-END:variables
}
