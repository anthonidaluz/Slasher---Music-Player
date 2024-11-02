package trabalho2;

import Classes.Contas;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TCadastro extends javax.swing.JFrame {

    Icon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("iconSlasher.png")));

    Contas conta = new Contas();

    public TCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        StrSenhaC = new javax.swing.JPasswordField();
        bSalvarDados = new javax.swing.JButton();
        StrNomeC = new javax.swing.JTextField();
        StrNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        WallPaper2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Slasher - Cadastramento de Conta");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Número de Telefone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(850, 200, 150, 17);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(850, 250, 50, 17);

        jButton1.setBackground(new java.awt.Color(157, 23, 23));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar Conta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(850, 300, 210, 24);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome Completo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(850, 150, 120, 17);
        getContentPane().add(StrSenhaC);
        StrSenhaC.setBounds(850, 270, 210, 22);

        bSalvarDados.setBackground(new java.awt.Color(157, 23, 23));
        bSalvarDados.setForeground(new java.awt.Color(255, 255, 255));
        bSalvarDados.setText("(Salvar Dados)");
        bSalvarDados.setEnabled(false);
        bSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(bSalvarDados);
        bSalvarDados.setBounds(850, 330, 210, 24);
        getContentPane().add(StrNomeC);
        StrNomeC.setBounds(850, 170, 210, 24);
        getContentPane().add(StrNum);
        StrNum.setBounds(850, 220, 210, 24);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Criar Conta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(860, 90, 170, 30);

        jLabel7.setBackground(new java.awt.Color(157, 23, 23));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(157, 23, 23));
        jLabel7.setText("<<");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(760, 380, 40, 40);

        WallPaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallPaper2.png"))); // NOI18N
        getContentPane().add(WallPaper2);
        WallPaper2.setBounds(0, 0, 1152, 520);

        setSize(new java.awt.Dimension(1166, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dispose();
        conta.setNome(StrNomeC.getText());
        conta.setNumero(StrNum.getText());
        conta.setSenha(StrSenhaC.getText());
        new TLogin(conta).setVisible(true);


    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if ("".equals(StrNomeC.getText()) || "".equals(StrNum.getText()) || "".equals(StrSenhaC.getText())) {
            JOptionPane.showMessageDialog(null, "É Necessário Informar Todos os Campos para Cadastrar", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE);
        } else if (!"".equals(StrNomeC.getText()) || !"".equals(StrNum.getText()) || !"".equals(StrSenhaC.getText())) {

            conta.setNome(StrNomeC.getText());
            conta.setNumero(StrNum.getText());
            conta.setSenha(StrSenhaC.getText());
            JOptionPane.showMessageDialog(null, "Conta Slasher Criada com Sucesso!", "Slasher - Cadastramento de Conta", 2, icon1);
            bSalvarDados.setEnabled(true);
            // dispose();
            //new TLogin(conta).setVisible(true);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void bSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarDadosActionPerformed
        serializarConta();



    }//GEN-LAST:event_bSalvarDadosActionPerformed

    //Serrialização
    public void serializarConta() {
        
        try {
            FileOutputStream fileOut = new FileOutputStream("dadosConta.ser"); 
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(conta); // Serializa o objeto conta

            objectOut.close();
            fileOut.close();

            JOptionPane.showMessageDialog(null, "Dados da conta foram salvos com sucesso!", "Slasher - Salvar Dados", JOptionPane.INFORMATION_MESSAGE, icon1);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados da conta: " + ex.getMessage(), "Slasher - Salvar Dados", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrNomeC;
    private javax.swing.JTextField StrNum;
    private javax.swing.JPasswordField StrSenhaC;
    private javax.swing.JLabel WallPaper2;
    private javax.swing.JButton bSalvarDados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
