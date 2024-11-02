package trabalho2;

public class TPlaylist extends javax.swing.JFrame {

    public TPlaylist() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCriar = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Slasher - PlayList");
        setResizable(false);
        getContentPane().setLayout(null);

        bCriar.setBackground(new java.awt.Color(157, 23, 23));
        bCriar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bCriar.setForeground(new java.awt.Color(255, 255, 255));
        bCriar.setText("Criar PlayList");
        bCriar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarActionPerformed(evt);
            }
        });
        getContentPane().add(bCriar);
        bCriar.setBounds(920, 440, 170, 30);

        back.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("<<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 10, 50, 30);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallPaperPlayList.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 1160, 520);

        setSize(new java.awt.Dimension(1166, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
       
    }//GEN-LAST:event_backMouseClicked

    private void bCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarActionPerformed
        new TLista().setVisible(true);
        bCriar.setEnabled(false);
        
    }//GEN-LAST:event_bCriarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WallPaper;
    private javax.swing.JButton bCriar;
    private javax.swing.JLabel back;
    // End of variables declaration//GEN-END:variables
}
