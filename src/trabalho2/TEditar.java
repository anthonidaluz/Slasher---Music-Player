
package trabalho2;

import Classes.Contas;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TEditar extends javax.swing.JFrame {
    
    private Contas dados;
    
    Icon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("iconSlasher.png")));
    
    public TEditar(Contas conta) {
        initComponents();
        
        this.dados = conta;
        
        Nome2.setText(dados.getNome());
        Telefone2.setText(dados.getNumero());
        Senha2.setText(dados.getSenha());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        StrEditTelefone = new javax.swing.JTextField();
        StrEditNome = new javax.swing.JTextField();
        StrEditSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Senha2 = new javax.swing.JLabel();
        Telefone2 = new javax.swing.JLabel();
        Nome2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Slasher - Edição");
        setResizable(false);
        getContentPane().setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 410, 2);
        getContentPane().add(StrEditTelefone);
        StrEditTelefone.setBounds(60, 170, 200, 20);
        getContentPane().add(StrEditNome);
        StrEditNome.setBounds(60, 120, 200, 20);
        getContentPane().add(StrEditSenha);
        StrEditSenha.setBounds(60, 220, 200, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Atualizar Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 250, 200, 25);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" (Certifique-se que os dados foram inseridos corretamente) ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 320, 360, 30);

        Senha2.setBackground(new java.awt.Color(0, 0, 0));
        Senha2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Senha2.setForeground(new java.awt.Color(255, 255, 255));
        Senha2.setText("< Senha >");
        getContentPane().add(Senha2);
        Senha2.setBounds(70, 200, 190, 17);

        Telefone2.setBackground(new java.awt.Color(0, 0, 0));
        Telefone2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Telefone2.setForeground(new java.awt.Color(255, 255, 255));
        Telefone2.setText("< Telefone >");
        getContentPane().add(Telefone2);
        Telefone2.setBounds(70, 150, 190, 17);

        Nome2.setBackground(new java.awt.Color(0, 0, 0));
        Nome2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Nome2.setForeground(new java.awt.Color(255, 255, 255));
        Nome2.setText("< Nome >");
        getContentPane().add(Nome2);
        Nome2.setBounds(70, 100, 190, 17);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconEditar.png"))); // NOI18N
        jLabel1.setText("Editar Dados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 240, 60);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallPaperSobre.png"))); // NOI18N
        getContentPane().add(WallPaper);
        WallPaper.setBounds(0, 0, 400, 350);

        setSize(new java.awt.Dimension(414, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equals(StrEditNome.getText()) || "".equals(StrEditSenha.getText()) || "".equals(StrEditTelefone.getText())){
            JOptionPane.showMessageDialog(null, "É Necessário informar todos os dados para Edição", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE );
        }else{
            
            dados.setNome(StrEditNome.getText());
            dados.setNumero(StrEditSenha.getText());
            dados.setSenha(StrEditTelefone.getText());
            
            Nome2.setText(StrEditNome.getText());
            Telefone2.setText(StrEditSenha.getText());
            Senha2.setText(StrEditTelefone.getText());
            
            JOptionPane.showMessageDialog(null, "Os dados foram Atualizados com Sucesso!", "Slasher - Edição de Dados", 2, icon);
            
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome2;
    private javax.swing.JLabel Senha2;
    private javax.swing.JTextField StrEditNome;
    private javax.swing.JPasswordField StrEditSenha;
    private javax.swing.JTextField StrEditTelefone;
    private javax.swing.JLabel Telefone2;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
