package tabelagrafica;

import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class JFrameEstatisticas extends javax.swing.JDialog {
    public JFrameEstatisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rotuloN = new javax.swing.JLabel();
        campoN = new javax.swing.JTextField();
        rotuloM = new javax.swing.JLabel();
        rotuloMZ = new javax.swing.JLabel();
        rotuloMedia = new javax.swing.JLabel();
        rotuloModa = new javax.swing.JLabel();
        rotuloMediana = new javax.swing.JLabel();
        rotuloH = new javax.swing.JLabel();
        rotuloHZ = new javax.swing.JLabel();
        campoM = new javax.swing.JTextField();
        campoMZ = new javax.swing.JTextField();
        campoMedia = new javax.swing.JTextField();
        campoModa = new javax.swing.JTextField();
        campoMediana = new javax.swing.JTextField();
        campoH = new javax.swing.JTextField();
        campoHZ = new javax.swing.JTextField();
        painelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloN.setText("Numero de elementos:");

        rotuloM.setText("Menor elemento:");

        rotuloMZ.setText("Maior elemento:");

        rotuloMedia.setText("Media:");

        rotuloModa.setText("Moda:");

        rotuloMediana.setText("Mediana:");

        rotuloH.setText("H:");

        rotuloHZ.setText("HZ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloN)
                    .addComponent(rotuloM)
                    .addComponent(rotuloMZ)
                    .addComponent(rotuloMedia)
                    .addComponent(rotuloModa)
                    .addComponent(rotuloMediana)
                    .addComponent(rotuloH)
                    .addComponent(rotuloHZ))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoN)
                    .addComponent(campoM)
                    .addComponent(campoMZ)
                    .addComponent(campoMedia)
                    .addComponent(campoModa)
                    .addComponent(campoMediana)
                    .addComponent(campoH)
                    .addComponent(campoHZ, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloN)
                    .addComponent(campoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloM)
                    .addComponent(campoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloMZ)
                    .addComponent(campoMZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloMedia)
                    .addComponent(campoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloModa)
                    .addComponent(campoModa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloMediana)
                    .addComponent(campoMediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloH)
                    .addComponent(campoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloHZ)
                    .addComponent(campoHZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFrameEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrameEstatisticas dialog = new JFrameEstatisticas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JTextField getjTextField1() {
        return campoN;
    }
    public void setjTextField1(JTextField jTextField1) {
        this.campoN = jTextField1;
    }
    public JTextField getCampoH() {
        return campoH;
    }
    public void setCampoH(JTextField campoH) {
        this.campoH = campoH;
    }
    public JTextField getCampoHZ() {
        return campoHZ;
    }
    public void setCampoHZ(JTextField campoHZ) {
        this.campoHZ = campoHZ;
    }
    public JTextField getCampoM() {
        return campoM;
    }
    public void setCampoM(JTextField campoM) {
        this.campoM = campoM;
    }
    public JTextField getCampoMZ() {
        return campoMZ;
    }
    public void setCampoMZ(JTextField campoMZ) {
        this.campoMZ = campoMZ;
    }
    public JTextField getCampoMedia() {
        return campoMedia;
    }
    public void setCampoMedia(JTextField campoMedia) {
        this.campoMedia = campoMedia;
    }
    public JTextField getCampoMediana() {
        return campoMediana;
    }
    public void setCampoMediana(JTextField campoMediana) {
        this.campoMediana = campoMediana;
    }
    public JTextField getCampoModa() {
        return campoModa;
    }
    public void setCampoModa(JTextField campoModa) {
        this.campoModa = campoModa;
    }
    public JTextField getCampoN() {
        return campoN;
    }
    public void setCampoN(JTextField campoN) {
        this.campoN = campoN;
    }
    public JPanel getjPanel1() {
        return jPanel1;
    }
    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
    public JLabel getRotuloH() {
        return rotuloH;
    }
    public void setRotuloH(JLabel rotuloH) {
        this.rotuloH = rotuloH;
    }
    public JLabel getRotuloHZ() {
        return rotuloHZ;
    }
    public void setRotuloHZ(JLabel rotuloHZ) {
        this.rotuloHZ = rotuloHZ;
    }
    public JLabel getRotuloM() {
        return rotuloM;
    }
    public void setRotuloM(JLabel rotuloM) {
        this.rotuloM = rotuloM;
    }
    public JLabel getRotuloMZ() {
        return rotuloMZ;
    }
    public void setRotuloMZ(JLabel rotuloMZ) {
        this.rotuloMZ = rotuloMZ;
    }
    public JLabel getRotuloMedia() {
        return rotuloMedia;
    }
    public void setRotuloMedia(JLabel rotuloMedia) {
        this.rotuloMedia = rotuloMedia;
    }
    public JLabel getRotuloMediana() {
        return rotuloMediana;
    }
    public void setRotuloMediana(JLabel rotuloMediana) {
        this.rotuloMediana = rotuloMediana;
    }
    public JLabel getRotuloModa() {
        return rotuloModa;
    }
    public void setRotuloModa(JLabel rotuloModa) {
        this.rotuloModa = rotuloModa;
    }
    public JLabel getRotuloN() {
        return rotuloN;
    }
    public void setRotuloN(JLabel rotuloN) {
        this.rotuloN = rotuloN;
    }
    public JPanel getPainelGrafico() {
        return painelGrafico;
    }
    public void setPainelGrafico(JPanel painelGrafico) {
        this.painelGrafico = painelGrafico;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoH;
    private javax.swing.JTextField campoHZ;
    private javax.swing.JTextField campoM;
    private javax.swing.JTextField campoMZ;
    private javax.swing.JTextField campoMedia;
    private javax.swing.JTextField campoMediana;
    private javax.swing.JTextField campoModa;
    private javax.swing.JTextField campoN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JLabel rotuloH;
    private javax.swing.JLabel rotuloHZ;
    private javax.swing.JLabel rotuloM;
    private javax.swing.JLabel rotuloMZ;
    private javax.swing.JLabel rotuloMedia;
    private javax.swing.JLabel rotuloMediana;
    private javax.swing.JLabel rotuloModa;
    private javax.swing.JLabel rotuloN;
    // End of variables declaration//GEN-END:variables
}
