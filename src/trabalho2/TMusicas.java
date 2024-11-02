package trabalho2;

import Classes.Contas;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.ImageIcon;

public class TMusicas extends javax.swing.JFrame {

    ImageIcon imgPause = new ImageIcon(getClass().getResource("IconPlay2.png"));
    ImageIcon imgPause2 = new ImageIcon(getClass().getResource("IconPause2.png"));

    public TMusicas(Contas conta) {
        initComponents();
        this.contaNova = conta;
    }

    private Contas contaNova;
    private boolean play = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        labelPlay2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labelPlay = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        labelPlay3 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slasher - Músicas Disponíveis");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("(Em Breve)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(730, 260, 100, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("(Em Breve)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(730, 340, 100, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("(Em Breve)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(730, 420, 100, 17);

        panel2.setBackground(new java.awt.Color(0, 0, 0));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });
        panel2.setLayout(null);

        labelPlay2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlay2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        panel2.add(labelPlay2);
        labelPlay2.setBounds(30, 10, 30, 30);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Sunflower");
        panel2.add(jLabel24);
        jLabel24.setBounds(100, 10, 90, 30);

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("3:30");
        panel2.add(jLabel26);
        jLabel26.setBounds(510, 0, 30, 50);

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Post Malone");
        panel2.add(jLabel25);
        jLabel25.setBounds(300, 10, 90, 30);

        getContentPane().add(panel2);
        panel2.setBounds(430, 120, 700, 50);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
            }
        });
        panel1.setLayout(null);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("God's Plan");
        panel1.add(jLabel21);
        jLabel21.setBounds(100, 10, 90, 30);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Drake");
        panel1.add(jLabel22);
        jLabel22.setBounds(300, 10, 90, 30);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("3:18");
        panel1.add(jLabel23);
        jLabel23.setBounds(510, 0, 30, 50);

        labelPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        panel1.add(labelPlay);
        labelPlay.setBounds(30, 10, 30, 30);

        getContentPane().add(panel1);
        panel1.setBounds(430, 40, 700, 50);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        jPanel4.setEnabled(false);
        jPanel4.setLayout(null);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        jPanel4.add(jLabel19);
        jLabel19.setBounds(30, 10, 30, 30);

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("3:20");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(510, 0, 30, 50);

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Charlie Brown Jr");
        jPanel4.add(jLabel31);
        jLabel31.setBounds(300, 10, 120, 30);

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Céu Azul");
        jPanel4.add(jLabel30);
        jLabel30.setBounds(100, 10, 90, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(430, 280, 700, 50);

        panel3.setBackground(new java.awt.Color(0, 0, 0));
        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });
        panel3.setLayout(null);

        labelPlay3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlay3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        panel3.add(labelPlay3);
        labelPlay3.setBounds(30, 10, 30, 30);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Red Hot Chili Peppers");
        panel3.add(jLabel29);
        jLabel29.setBounds(300, 10, 170, 30);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("3:40");
        panel3.add(jLabel28);
        jLabel28.setBounds(510, 0, 30, 50);

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Scar Tissue");
        panel3.add(jLabel27);
        jLabel27.setBounds(100, 10, 110, 30);

        getContentPane().add(panel3);
        panel3.setBounds(430, 200, 700, 50);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        jPanel6.setEnabled(false);
        jPanel6.setLayout(null);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        jPanel6.add(jLabel20);
        jLabel20.setBounds(30, 10, 30, 30);

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Desabafo");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(100, 10, 90, 30);

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("2:19");
        jPanel6.add(jLabel35);
        jLabel35.setBounds(510, 0, 30, 50);

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Marcelo D2");
        jPanel6.add(jLabel34);
        jLabel34.setBounds(300, 10, 170, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(430, 360, 700, 50);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        jPanel5.setEnabled(false);
        jPanel5.setLayout(null);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        jPanel5.add(jLabel15);
        jLabel15.setBounds(30, 10, 30, 30);

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("4:40");
        jPanel5.add(jLabel38);
        jLabel38.setBounds(510, 0, 30, 50);

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Welcome To The Jungle");
        jPanel5.add(jLabel36);
        jLabel36.setBounds(100, 10, 180, 30);

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Guns N' Roses");
        jPanel5.add(jLabel37);
        jLabel37.setBounds(300, 10, 110, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(430, 440, 700, 50);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<<");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 10, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallPaperMusicas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 520);

        setSize(new java.awt.Dimension(1168, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dispose();
        new TPlayer2(contaNova).setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        if (play) {
            labelPlay.setIcon(imgPause);
            silenciarMusica();
        } else {
            labelPlay.setIcon(imgPause2);
            try {
                String musica = "God's Plan.wav";

                InputStream inputStream = getClass().getClassLoader().getResourceAsStream(musica);

                if (inputStream != null) {
                    try ( AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream)) {
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    }
                } else {
                    System.out.println("Arquivo de música não encontrado.");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        play = !play;

    }//GEN-LAST:event_panel1MouseClicked

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        if (play) {
            labelPlay2.setIcon(imgPause);
            silenciarMusica();
        } else {
            labelPlay2.setIcon(imgPause2);

            try {
                String musica = "Sunflower.wav";

                InputStream inputStream = getClass().getClassLoader().getResourceAsStream(musica);

                if (inputStream != null) {
                    try ( AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream)) {
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    }
                } else {
                    System.out.println("Arquivo de música não encontrado.");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        play = !play;

    }//GEN-LAST:event_panel2MouseClicked

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        if (play) {
            labelPlay3.setIcon(imgPause);
            silenciarMusica();
        } else {
            labelPlay3.setIcon(imgPause2);
            try {
                String musica = "Red Hot Chili Peppers - Scar.wav";

                InputStream inputStream = getClass().getClassLoader().getResourceAsStream(musica);

                if (inputStream != null) {
                    try ( AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream)) {
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    }
                } else {
                    System.out.println("Arquivo de música não encontrado.");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        play = !play;

    }//GEN-LAST:event_panel3MouseClicked

    // Método para silenciar a música
    public void silenciarMusica() {
        try {
            Mixer.Info[] mixers = AudioSystem.getMixerInfo();
            for (Mixer.Info mixerInfo : mixers) {
                Mixer mixer = AudioSystem.getMixer(mixerInfo);
                Line[] lines = mixer.getSourceLines();
                for (Line line : lines) {
                    line.open();
                    if (line instanceof Clip) {
                        Clip clip = (Clip) line;
                        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                        gainControl.setValue(gainControl.getMinimum());
                        line.close();
                    }
                }
            }
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelPlay;
    private javax.swing.JLabel labelPlay2;
    private javax.swing.JLabel labelPlay3;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    // End of variables declaration//GEN-END:variables
}
