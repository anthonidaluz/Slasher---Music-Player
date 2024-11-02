package trabalho2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TSuporte extends javax.swing.JFrame {
    
    Icon icon = new ImageIcon (getToolkit().createImage(getClass().getResource("iconSlasher.png")));

    public TSuporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        StrNomeS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        StrDuvidaS = new javax.swing.JTextArea();
        StrEmailS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Slasher - Suporte");
        setResizable(false);
        getContentPane().setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 100, 400, 10);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informar Dúvida:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 210, 140, 14);
        getContentPane().add(StrNomeS);
        StrNomeS.setBounds(70, 130, 240, 20);

        StrDuvidaS.setColumns(20);
        StrDuvidaS.setForeground(new java.awt.Color(0, 0, 0));
        StrDuvidaS.setRows(5);
        StrDuvidaS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(StrDuvidaS);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 230, 300, 70);
        getContentPane().add(StrEmailS);
        StrEmailS.setBounds(70, 180, 240, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Enviar Dúvida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 310, 120, 24);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 160, 50, 14);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 110, 50, 14);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUPORTE PARA USUÁRIO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 40, 290, 26);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/iconSuporte.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallPaperSobre.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 350);

        setSize(new java.awt.Dimension(414, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equals(StrNomeS.getText()) || "".equals(StrEmailS.getText()) || "".equals(StrDuvidaS.getText())){
            JOptionPane.showMessageDialog(null, "É necessário informar todos o dados ", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE);
        }else if(!"".equals(StrNomeS.getText()) || !"".equals(StrEmailS.getText()) || !"".equals(StrDuvidaS.getText())){
            JOptionPane.showMessageDialog(null, "Mensagem Enviada com Sucesso, em Até 24 horas entraremos em contato!",
                    "Slasher - Suporte mensagem", 2, icon);
            StrNomeS.setText("");
            StrEmailS.setText("");
            StrDuvidaS.setText("");
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea StrDuvidaS;
    private javax.swing.JTextField StrEmailS;
    private javax.swing.JTextField StrNomeS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
