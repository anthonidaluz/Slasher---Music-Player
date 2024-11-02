package trabalho2;

import Classes.Contas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class loading extends javax.swing.JFrame {

  private Contas contaNova;

    public loading(Contas conta){
        initComponents();
        this.contaNova = conta;
   
    }
        

    public loading() {
        initComponents();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingBar = new javax.swing.JProgressBar();
        labelCarregando = new javax.swing.JLabel();
        loadingValor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        loadingBar.setBackground(new java.awt.Color(157, 23, 23));
        loadingBar.setForeground(new java.awt.Color(255, 255, 255));
        loadingBar.setBorder(null);
        loadingBar.setBorderPainted(false);
        jPanel1.add(loadingBar);
        loadingBar.setBounds(-20, 338, 680, 12);

        labelCarregando.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelCarregando.setForeground(new java.awt.Color(255, 255, 255));
        labelCarregando.setText("Carregando...");
        jPanel1.add(labelCarregando);
        labelCarregando.setBounds(0, 320, 230, 17);

        loadingValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loadingValor.setForeground(new java.awt.Color(255, 255, 255));
        loadingValor.setText("0 %");
        jPanel1.add(loadingValor);
        loadingValor.setBounds(610, 320, 40, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/loading.gif"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 350);

        setSize(new java.awt.Dimension(650, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        new Thread() {
            int i = 0;

            public void run() {
                while (i < 100) {
                    i++;
                    loadingValor.setText(String.valueOf(i) + "%");
                    loadingBar.setValue(i);
                    
                    if(i==10){
                        labelCarregando.setText("Validando dados...");
                    }
                    if(i==30){
                        labelCarregando.setText("Carregando Interface...");
                    }
                    if(i==60){
                        labelCarregando.setText("Conectado com Sucesso!");
                    }
                    if(i==90){
                        labelCarregando.setText("Seja Bem-Vindo ao Slasher");
                    }

                    try {
                        sleep(20);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex, "erro" ,JOptionPane.ERROR_MESSAGE);
                    }

                }
                loading.this.dispose();
                new TPlayer2(contaNova).setVisible(true);
            }
        }.start();
    }//GEN-LAST:event_formWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCarregando;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingValor;
    // End of variables declaration//GEN-END:variables
}
