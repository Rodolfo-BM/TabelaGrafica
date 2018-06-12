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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        painelTabelaIP2 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabelaIP2 = new javax.swing.JTable();
        abaData = new javax.swing.JPanel();
        painelTabelaData = new javax.swing.JPanel();
        scrollTabelaData = new javax.swing.JScrollPane();
        tabelaData = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        abaHorario = new javax.swing.JPanel();
        painelTabelaHorario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaHorario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        abaLocalizacao = new javax.swing.JPanel();
        painelTabelaLocalizacao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaLocalizacao = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        abaCabecalho = new javax.swing.JPanel();
        painelCabecalho = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaCabecalho = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        abaRequisicao = new javax.swing.JPanel();
        painelTabelaRequisicao = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaRequisicao = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        abaHTTP = new javax.swing.JPanel();
        painelTabelaHTTP = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaHTTP = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        abaCodigo = new javax.swing.JPanel();
        painelTabelaCodigo = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaCodigo = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        abaTamanho = new javax.swing.JPanel();
        painelTabelaTamanho = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaTamanho = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        abaCaminho = new javax.swing.JPanel();
        painelTabelaCaminho = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelaCaminho = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        abaSo = new javax.swing.JPanel();
        painelTabelaSo = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabelaSo = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        abaBrowser = new javax.swing.JPanel();
        painelTabelaBrowser = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabelaBrowser = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaIP);

        javax.swing.GroupLayout painelTabelaIPLayout = new javax.swing.GroupLayout(painelTabelaIP);
        painelTabelaIP.setLayout(painelTabelaIPLayout);
        painelTabelaIPLayout.setHorizontalGroup(
            painelTabelaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        painelTabelaIPLayout.setVerticalGroup(
            painelTabelaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTabelaIP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane12.setViewportView(tabelaIP2);

        javax.swing.GroupLayout painelTabelaIP2Layout = new javax.swing.GroupLayout(painelTabelaIP2);
        painelTabelaIP2.setLayout(painelTabelaIP2Layout);
        painelTabelaIP2Layout.setHorizontalGroup(
            painelTabelaIP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaIP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTabelaIP2Layout.setVerticalGroup(
            painelTabelaIP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaIP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaIPLayout = new javax.swing.GroupLayout(abaIP);
        abaIP.setLayout(abaIPLayout);
        abaIPLayout.setHorizontalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaIPLayout.createSequentialGroup()
                        .addComponent(painelTabelaIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelTabelaIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        abaIPLayout.setVerticalGroup(
            abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelTabelaIP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTabelaIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        painelComAbas.addTab("IP", abaIP);

        painelTabelaData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout painelTabelaDataLayout = new javax.swing.GroupLayout(painelTabelaData);
        painelTabelaData.setLayout(painelTabelaDataLayout);
        painelTabelaDataLayout.setHorizontalGroup(
            painelTabelaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabelaData)
                .addContainerGap())
        );
        painelTabelaDataLayout.setVerticalGroup(
            painelTabelaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabelaData)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaDataLayout = new javax.swing.GroupLayout(abaData);
        abaData.setLayout(abaDataLayout);
        abaDataLayout.setHorizontalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );
        abaDataLayout.setVerticalGroup(
            abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Data", abaData);

        painelTabelaHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaHorario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaHorario);

        javax.swing.GroupLayout painelTabelaHorarioLayout = new javax.swing.GroupLayout(painelTabelaHorario);
        painelTabelaHorario.setLayout(painelTabelaHorarioLayout);
        painelTabelaHorarioLayout.setHorizontalGroup(
            painelTabelaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        painelTabelaHorarioLayout.setVerticalGroup(
            painelTabelaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaHorarioLayout = new javax.swing.GroupLayout(abaHorario);
        abaHorario.setLayout(abaHorarioLayout);
        abaHorarioLayout.setHorizontalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaHorarioLayout.setVerticalGroup(
            abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Horario", abaHorario);

        painelTabelaLocalizacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaLocalizacao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabelaLocalizacao);

        javax.swing.GroupLayout painelTabelaLocalizacaoLayout = new javax.swing.GroupLayout(painelTabelaLocalizacao);
        painelTabelaLocalizacao.setLayout(painelTabelaLocalizacaoLayout);
        painelTabelaLocalizacaoLayout.setHorizontalGroup(
            painelTabelaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        painelTabelaLocalizacaoLayout.setVerticalGroup(
            painelTabelaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setText("jButton1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaLocalizacaoLayout = new javax.swing.GroupLayout(abaLocalizacao);
        abaLocalizacao.setLayout(abaLocalizacaoLayout);
        abaLocalizacaoLayout.setHorizontalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaLocalizacaoLayout.setVerticalGroup(
            abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Localização", abaLocalizacao);

        painelCabecalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaCabecalho.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tabelaCabecalho);

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("jButton2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCabecalhoLayout = new javax.swing.GroupLayout(abaCabecalho);
        abaCabecalho.setLayout(abaCabecalhoLayout);
        abaCabecalhoLayout.setHorizontalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaCabecalhoLayout.setVerticalGroup(
            abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Cabeçalho da requisição", abaCabecalho);

        painelTabelaRequisicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane5.setViewportView(tabelaRequisicao);

        javax.swing.GroupLayout painelTabelaRequisicaoLayout = new javax.swing.GroupLayout(painelTabelaRequisicao);
        painelTabelaRequisicao.setLayout(painelTabelaRequisicaoLayout);
        painelTabelaRequisicaoLayout.setHorizontalGroup(
            painelTabelaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        painelTabelaRequisicaoLayout.setVerticalGroup(
            painelTabelaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton11.setText("jButton1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("jButton2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaRequisicaoLayout = new javax.swing.GroupLayout(abaRequisicao);
        abaRequisicao.setLayout(abaRequisicaoLayout);
        abaRequisicaoLayout.setHorizontalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaRequisicaoLayout.setVerticalGroup(
            abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Requisição", abaRequisicao);

        painelTabelaHTTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane6.setViewportView(tabelaHTTP);

        javax.swing.GroupLayout painelTabelaHTTPLayout = new javax.swing.GroupLayout(painelTabelaHTTP);
        painelTabelaHTTP.setLayout(painelTabelaHTTPLayout);
        painelTabelaHTTPLayout.setHorizontalGroup(
            painelTabelaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        painelTabelaHTTPLayout.setVerticalGroup(
            painelTabelaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton13.setText("jButton1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("jButton2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaHTTPLayout = new javax.swing.GroupLayout(abaHTTP);
        abaHTTP.setLayout(abaHTTPLayout);
        abaHTTPLayout.setHorizontalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaHTTPLayout.setVerticalGroup(
            abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaHTTPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaHTTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaHTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Verção do HTTP", abaHTTP);

        painelTabelaCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane7.setViewportView(tabelaCodigo);

        javax.swing.GroupLayout painelTabelaCodigoLayout = new javax.swing.GroupLayout(painelTabelaCodigo);
        painelTabelaCodigo.setLayout(painelTabelaCodigoLayout);
        painelTabelaCodigoLayout.setHorizontalGroup(
            painelTabelaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        painelTabelaCodigoLayout.setVerticalGroup(
            painelTabelaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton15.setText("jButton1");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("jButton2");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15)
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCodigoLayout = new javax.swing.GroupLayout(abaCodigo);
        abaCodigo.setLayout(abaCodigoLayout);
        abaCodigoLayout.setHorizontalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaCodigoLayout.setVerticalGroup(
            abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Código", abaCodigo);

        painelTabelaTamanho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane8.setViewportView(tabelaTamanho);

        javax.swing.GroupLayout painelTabelaTamanhoLayout = new javax.swing.GroupLayout(painelTabelaTamanho);
        painelTabelaTamanho.setLayout(painelTabelaTamanhoLayout);
        painelTabelaTamanhoLayout.setHorizontalGroup(
            painelTabelaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );
        painelTabelaTamanhoLayout.setVerticalGroup(
            painelTabelaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton17.setText("jButton1");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("jButton2");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17)
                .addGap(18, 18, 18)
                .addComponent(jButton18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaTamanhoLayout = new javax.swing.GroupLayout(abaTamanho);
        abaTamanho.setLayout(abaTamanhoLayout);
        abaTamanhoLayout.setHorizontalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaTamanhoLayout.setVerticalGroup(
            abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Tamanho", abaTamanho);

        painelTabelaCaminho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane9.setViewportView(tabelaCaminho);

        javax.swing.GroupLayout painelTabelaCaminhoLayout = new javax.swing.GroupLayout(painelTabelaCaminho);
        painelTabelaCaminho.setLayout(painelTabelaCaminhoLayout);
        painelTabelaCaminhoLayout.setHorizontalGroup(
            painelTabelaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );
        painelTabelaCaminhoLayout.setVerticalGroup(
            painelTabelaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton19.setText("jButton1");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("jButton2");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton19)
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCaminhoLayout = new javax.swing.GroupLayout(abaCaminho);
        abaCaminho.setLayout(abaCaminhoLayout);
        abaCaminhoLayout.setHorizontalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaCaminhoLayout.setVerticalGroup(
            abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCaminhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCaminhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Caminho", abaCaminho);

        painelTabelaSo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaSo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(tabelaSo);

        javax.swing.GroupLayout painelTabelaSoLayout = new javax.swing.GroupLayout(painelTabelaSo);
        painelTabelaSo.setLayout(painelTabelaSoLayout);
        painelTabelaSoLayout.setHorizontalGroup(
            painelTabelaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        painelTabelaSoLayout.setVerticalGroup(
            painelTabelaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton21.setText("jButton1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("jButton2");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton21)
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaSoLayout = new javax.swing.GroupLayout(abaSo);
        abaSo.setLayout(abaSoLayout);
        abaSoLayout.setHorizontalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaSoLayout.setVerticalGroup(
            abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaSoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Sistema Operacional", abaSo);

        painelTabelaBrowser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane11.setViewportView(tabelaBrowser);

        javax.swing.GroupLayout painelTabelaBrowserLayout = new javax.swing.GroupLayout(painelTabelaBrowser);
        painelTabelaBrowser.setLayout(painelTabelaBrowserLayout);
        painelTabelaBrowserLayout.setHorizontalGroup(
            painelTabelaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11)
                .addContainerGap())
        );
        painelTabelaBrowserLayout.setVerticalGroup(
            painelTabelaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton23.setText("jButton1");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("jButton2");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton23)
                .addGap(18, 18, 18)
                .addComponent(jButton24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaBrowserLayout = new javax.swing.GroupLayout(abaBrowser);
        abaBrowser.setLayout(abaBrowserLayout);
        abaBrowserLayout.setHorizontalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelaBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaBrowserLayout.setVerticalGroup(
            abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabelaBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Qualitativa ip;
        ip = listarIP();
        quantitativaIP(ip);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        listarData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        listarHorario();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        listarLocalizacao();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        listarCabecalho();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        listarRequisicao();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        listarHTTP();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        listarCodigo();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        listarTamanho();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        listarCaminho();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        listarSO();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        listarBrowser();
    }//GEN-LAST:event_jButton23ActionPerformed

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
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaSo.getModel();
        
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
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
    private javax.swing.JPanel painelTabelaIP2;
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
    private javax.swing.JTable tabelaIP2;
    private javax.swing.JTable tabelaLocalizacao;
    private javax.swing.JTable tabelaLog;
    private javax.swing.JTable tabelaRequisicao;
    private javax.swing.JTable tabelaSo;
    private javax.swing.JTable tabelaTamanho;
    // End of variables declaration//GEN-END:variables
}
