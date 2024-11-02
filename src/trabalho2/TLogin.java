package trabalho2;

import Classes.Contas;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TLogin extends javax.swing.JFrame {

    private Contas contaNova;
    Icon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("iconSlasher.png")));

    public TLogin(Contas conta) {
        initComponents();
        this.contaNova = conta;

        StrNome.setText(contaNova.getNome());
        StrSenha.setText(contaNova.getSenha());

    }

    public TLogin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        StrSenha = new javax.swing.JPasswordField();
        bCarregarDados = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        StrNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slasher - Music Player");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(157, 23, 23));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 250, 220, 24);
        getContentPane().add(StrSenha);
        StrSenha.setBounds(100, 220, 220, 22);

        bCarregarDados.setBackground(new java.awt.Color(157, 23, 23));
        bCarregarDados.setForeground(new java.awt.Color(255, 255, 255));
        bCarregarDados.setText("(Carregar Dados)");
        bCarregarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCarregarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(bCarregarDados);
        bCarregarDados.setBounds(100, 280, 220, 24);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 200, 50, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 150, 50, 17);
        getContentPane().add(StrNome);
        StrNome.setBounds(100, 170, 220, 24);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 33)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 70, 90, 39);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Criar Conta Slasher");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 310, 120, 14);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallPaper1.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 1160, 500);

        jMenu1.setText("Editar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Suporte");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1166, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        new TCadastro().setVisible(true);

    }//GEN-LAST:event_jLabel1MouseClicked


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ("".equals(StrNome.getText()) || "".equals(StrSenha.getText())) {
            JOptionPane.showMessageDialog(null, "É Necessário Informar Todos os Campos para Entrar", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE);

        } else if (this.contaNova == null) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados no banco, por favor verifique sua conta!", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE);
            StrNome.setText("");
            StrSenha.setText("");
            
        }else if (!contaNova.getNome().equals(StrNome.getText()) && !contaNova.getSenha().equals(StrSenha.getText())){
            JOptionPane.showMessageDialog(null, "Conta não confere com registo no Banco", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE);
            
        }else if (contaNova.getNome().equals(StrNome.getText()) && contaNova.getSenha().equals(StrSenha.getText())) {
            dispose();
            loading loading = new loading(contaNova);
            loading.setVisible(true);
        

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        TSobre ts = new TSobre();
        ts.setVisible(true);

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        TSuporte tsuporte = new TSuporte();
        tsuporte.setVisible(true);

    }//GEN-LAST:event_jMenu3MouseClicked

    private void bCarregarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCarregarDadosActionPerformed
        desserializarConta();

    }//GEN-LAST:event_bCarregarDadosActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        if ("".equals(StrNome.getText()) || "".equals(StrSenha.getText())) {
            JOptionPane.showMessageDialog(null, "É Necessário Informar os Dados no Campo login para Editar", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE);
        } else {
            new TEditar(contaNova).setVisible(true);
        }


    }//GEN-LAST:event_jMenu1MouseClicked

    // Desserialização
    public void desserializarConta() {
        try {
            FileInputStream fileIn = new FileInputStream("dadosConta.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            contaNova = (Contas) objectIn.readObject(); // Desserializa o objeto conta

            objectIn.close();
            fileIn.close();

            JOptionPane.showMessageDialog(null, "Dados da conta foram carregados com sucesso!", "Slasher - Carregar Dados", JOptionPane.INFORMATION_MESSAGE, icon);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados da conta: " + ex.getMessage(), "Slasher - Carregar Dados", JOptionPane.ERROR_MESSAGE);
        }
        StrNome.setText(contaNova.getNome());
        StrSenha.setText(contaNova.getSenha());

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrNome;
    private javax.swing.JPasswordField StrSenha;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JButton bCarregarDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
