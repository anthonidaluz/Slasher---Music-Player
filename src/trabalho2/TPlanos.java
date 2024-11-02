
package trabalho2;

import Classes.ContratoPlano;


public class TPlanos extends javax.swing.JFrame {
    
    TPlayer2 teste = new TPlayer2();

    public TPlanos(){

        initComponents();
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bBasic = new javax.swing.JButton();
        bPremium = new javax.swing.JButton();
        bGold = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Slasher - Planos de Assinatura");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        bBasic.setBackground(new java.awt.Color(0, 191, 99));
        bBasic.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        bBasic.setForeground(new java.awt.Color(255, 255, 255));
        bBasic.setText("Ativo");
        bBasic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bBasic.setEnabled(false);
        bBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBasicActionPerformed(evt);
            }
        });
        getContentPane().add(bBasic);
        bBasic.setBounds(140, 350, 110, 30);

        bPremium.setBackground(new java.awt.Color(12, 192, 223));
        bPremium.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        bPremium.setForeground(new java.awt.Color(255, 255, 255));
        bPremium.setText("Contratar");
        bPremium.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPremiumActionPerformed(evt);
            }
        });
        getContentPane().add(bPremium);
        bPremium.setBounds(500, 350, 110, 30);

        bGold.setBackground(new java.awt.Color(235, 188, 0));
        bGold.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        bGold.setForeground(new java.awt.Color(255, 255, 255));
        bGold.setText("Contratar");
        bGold.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bGold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGoldActionPerformed(evt);
            }
        });
        getContentPane().add(bGold);
        bGold.setBounds(860, 350, 110, 30);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(100, 160, 200, 10);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(820, 160, 200, 10);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setAlignmentX(1.0F);
        jSeparator3.setAlignmentY(1.0F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(460, 160, 200, 10);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("<html> - Desconto especial para Estudantes Universitários </html>");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 250, 160, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("- Ouça sem Anúncios");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 230, 120, 14);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("- 2 Contas PREMIUM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 210, 120, 14);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("<html> - Ouça sem Anúncios em qualquer lugar OFFILINE </html>");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(830, 240, 190, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("- Ouça sem Anúncios");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 220, 120, 14);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("- 1 Conta BASIC");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 200, 120, 14);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("- Disponível para Desktop");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(110, 180, 180, 14);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("- Disponível para Desktop e App");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(830, 180, 180, 14);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("<html> - Family MIX: Slasher para toda Família (5 integrantes) </html>");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(830, 200, 180, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("<html> - Desconto especial para Estudantes Universitários </html>");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 280, 160, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("- Disponível para Desktop e App");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 180, 180, 14);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallpaperPlano.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1152, 530);

        setSize(new java.awt.Dimension(1166, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    //Plano Premium
    private void bPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPremiumActionPerformed
        ContratoPlano.contratarPlanoPremium();
        bBasic.setEnabled(true);
        bPremium.setEnabled(false);
        bPremium.setText("Ativo");
        bBasic.setText("Contratar");
        bPremium.setEnabled(false);
        bGold.setEnabled(true);
        bGold.setText("Contratar");
        
        
    }//GEN-LAST:event_bPremiumActionPerformed

    //Plano Gold
    private void bGoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGoldActionPerformed
        ContratoPlano.contratarPlanoGold();
        bBasic.setEnabled(true);
        bGold.setEnabled(true);
        bGold.setText("Ativo");
        bPremium.setEnabled(true);
        bPremium.setText("Contratar");
        bBasic.setText("Contratar");
        bGold.setEnabled(false);
        
        teste.setTitle("Slasher - Plano Slasher Basic");
    }//GEN-LAST:event_bGoldActionPerformed

    //Plano Basic
    private void bBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBasicActionPerformed
        ContratoPlano.contratarPlanoBasic();
        bGold.setEnabled(true);
        bPremium.setEnabled(true);
        bPremium.setText("Contratar");
        bGold.setText("Contratar");
        bBasic.setText("Ativo");
        bBasic.setEnabled(false);
        
        
        
    }//GEN-LAST:event_bBasicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBasic;
    private javax.swing.JButton bGold;
    private javax.swing.JButton bPremium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
