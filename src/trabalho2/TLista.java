package trabalho2;

import Classes.Playlist;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TLista extends javax.swing.JFrame {

    public TLista() {
        initComponents();
    }

    Icon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("iconSlasher.png")));
    ArrayList<Object> listaPLaylist = new ArrayList<>();

    Playlist pl = new Playlist();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        bCadastrar = new javax.swing.JButton();
        bEnviar = new javax.swing.JButton();
        StrGenero = new javax.swing.JTextField();
        StrMusica = new javax.swing.JTextField();
        StrArtista = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Slasher - Criação da PlayList");
        setResizable(false);
        getContentPane().setLayout(null);

        tableList.setBackground(new java.awt.Color(255, 255, 255));
        tableList.setForeground(new java.awt.Color(0, 0, 0));
        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Música", "Artista", "Gênero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableList.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tableList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableList);
        if (tableList.getColumnModel().getColumnCount() > 0) {
            tableList.getColumnModel().getColumn(0).setResizable(false);
            tableList.getColumnModel().getColumn(1).setResizable(false);
            tableList.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 580, 140);

        bCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        bCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        bCadastrar.setText("Cadastrar Playlist");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bCadastrar);
        bCadastrar.setBounds(210, 30, 160, 24);

        bEnviar.setBackground(new java.awt.Color(255, 255, 255));
        bEnviar.setForeground(new java.awt.Color(0, 0, 0));
        bEnviar.setText("Enviar  para Análise");
        bEnviar.setEnabled(false);
        bEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(bEnviar);
        bEnviar.setBounds(210, 60, 160, 24);
        getContentPane().add(StrGenero);
        StrGenero.setBounds(420, 90, 140, 20);
        getContentPane().add(StrMusica);
        StrMusica.setBounds(20, 90, 150, 20);
        getContentPane().add(StrArtista);
        StrArtista.setBounds(210, 90, 160, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallpaperLista.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 260);

        setSize(new java.awt.Dimension(590, 297));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        DefaultTableModel table = (DefaultTableModel) tableList.getModel();
        Object[] dados = {StrMusica.getText(), StrArtista.getText(), StrGenero.getText()};
        if ("".equals(StrArtista.getText()) || "".equals(StrMusica.getText()) || "".equals(StrGenero.getText())) {
            JOptionPane.showMessageDialog(null, "É Necessário informar dados para adicionar na table", "Slasher - [ERROR]", JOptionPane.ERROR_MESSAGE);
        } else {
            table.addRow(dados);
            bEnviar.setEnabled(true);
        }

        StrMusica.setText("");
        StrArtista.setText("");
        StrGenero.setText("");

    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        pl.setNome(StrMusica.getText());
        pl.setArtista(StrArtista.getText());
        pl.setGenero(StrGenero.getText());
        listaPLaylist.add(pl);

        JOptionPane.showMessageDialog(null, "Playlist Enviada para Análise, logo estará em sua Conta", "Slasher - Montagem de Playlist", 2, icon);

        StrMusica.setText("");
        StrArtista.setText("");
        StrGenero.setText("");
        


    }//GEN-LAST:event_bEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrArtista;
    private javax.swing.JTextField StrGenero;
    private javax.swing.JTextField StrMusica;
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bEnviar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableList;
    // End of variables declaration//GEN-END:variables

}
