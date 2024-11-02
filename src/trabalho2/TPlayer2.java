package trabalho2;

import Classes.Contas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.ImageIcon;

public class TPlayer2 extends javax.swing.JFrame {

    ImageIcon imgPause = new ImageIcon(getClass().getResource("IconPlay2.png"));
    ImageIcon imgPause2 = new ImageIcon(getClass().getResource("IconPause.png"));
    ImageIcon imgLike = new ImageIcon(getClass().getResource("IconLike2.png"));
    ImageIcon imgLike2 = new ImageIcon(getClass().getResource("IconLike.png"));
    ImageIcon Album2_1 = new ImageIcon(getClass().getResource("Album2.1.png"));
    ImageIcon Album2 = new ImageIcon(getClass().getResource("Album2.png"));
    ImageIcon Album1_2 = new ImageIcon(getClass().getResource("Album1.2.png"));
    ImageIcon Album1 = new ImageIcon(getClass().getResource("Album1.png"));
    ImageIcon Album3_1 = new ImageIcon(getClass().getResource("Album3.1.png"));
    ImageIcon Album3 = new ImageIcon(getClass().getResource("Album3.png"));

    private boolean click = false;
    private boolean play = false;
    private String ms;
    private Contas contaNova;

    public TPlayer2(Contas conta) {
        initComponents();
        this.contaNova = conta;
        NomeP.setText(contaNova.getNome());

    }

    public TPlayer2() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlaylist = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelMusicas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelPlanos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NomeP = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tFinal = new javax.swing.JLabel();
        labelBack = new javax.swing.JLabel();
        musicBar = new javax.swing.JProgressBar();
        labelNext = new javax.swing.JLabel();
        play3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        labelLike3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        play1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelLike = new javax.swing.JLabel();
        play2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        labelLike2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        LabelPlay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelAlbum2 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelArtista = new javax.swing.JLabel();
        labelAlbum1 = new javax.swing.JLabel();
        labelSuba = new javax.swing.JLabel();
        labelSubt = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home - Slasher Music Player");
        setResizable(false);
        getContentPane().setLayout(null);

        panelPlaylist.setBackground(new java.awt.Color(0, 0, 0));
        panelPlaylist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        panelPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPlaylistMouseClicked(evt);
            }
        });
        panelPlaylist.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlaylist.png"))); // NOI18N
        panelPlaylist.add(jLabel7);
        jLabel7.setBounds(10, 10, 60, 40);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PlayLists");
        panelPlaylist.add(jLabel8);
        jLabel8.setBounds(80, 10, 90, 40);

        getContentPane().add(panelPlaylist);
        panelPlaylist.setBounds(20, 280, 190, 60);

        panelMusicas.setBackground(new java.awt.Color(0, 0, 0));
        panelMusicas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        panelMusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMusicasMouseClicked(evt);
            }
        });
        panelMusicas.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconMusic.png"))); // NOI18N
        panelMusicas.add(jLabel4);
        jLabel4.setBounds(10, 10, 60, 40);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Músicas");
        panelMusicas.add(jLabel5);
        jLabel5.setBounds(80, 20, 90, 25);

        getContentPane().add(panelMusicas);
        panelMusicas.setBounds(20, 210, 190, 60);

        panelPlanos.setBackground(new java.awt.Color(0, 0, 0));
        panelPlanos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        panelPlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPlanosMouseClicked(evt);
            }
        });
        panelPlanos.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlano.png"))); // NOI18N
        panelPlanos.add(jLabel9);
        jLabel9.setBounds(20, 10, 50, 45);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Planos");
        panelPlanos.add(jLabel10);
        jLabel10.setBounds(80, 10, 80, 40);

        getContentPane().add(panelPlanos);
        panelPlanos.setBounds(20, 350, 190, 60);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        jPanel2.setLayout(null);

        NomeP.setBackground(new java.awt.Color(0, 0, 0));
        NomeP.setForeground(new java.awt.Color(255, 255, 255));
        NomeP.setText("< Nome >");
        jPanel2.add(NomeP);
        NomeP.setBounds(59, 6, 130, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 160, 190, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconProfile.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(15, 6, 100, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 40, 130, 110);

        tFinal.setBackground(new java.awt.Color(0, 0, 0));
        tFinal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tFinal.setForeground(new java.awt.Color(255, 255, 255));
        tFinal.setText("3:19");
        getContentPane().add(tFinal);
        tFinal.setBounds(780, 480, 30, 16);

        labelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconBack.png"))); // NOI18N
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });
        getContentPane().add(labelBack);
        labelBack.setBounds(440, 480, 30, 30);

        musicBar.setBackground(new java.awt.Color(255, 255, 255));
        musicBar.setForeground(new java.awt.Color(157, 23, 23));
        musicBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(musicBar);
        musicBar.setBounds(380, 460, 430, 10);

        labelNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconNext.png"))); // NOI18N
        labelNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNextMouseClicked(evt);
            }
        });
        getContentPane().add(labelNext);
        labelNext.setBounds(720, 480, 30, 30);

        play3.setBackground(new java.awt.Color(0, 0, 0));
        play3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        play3.setForeground(new java.awt.Color(0, 0, 0));
        play3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play3MouseClicked(evt);
            }
        });
        play3.setLayout(null);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        play3.add(jLabel17);
        jLabel17.setBounds(40, 20, 30, 30);

        labelLike3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconLike.png"))); // NOI18N
        labelLike3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLike3MouseClicked(evt);
            }
        });
        play3.add(labelLike3);
        labelLike3.setBounds(730, 10, 50, 50);

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("3:40");
        play3.add(jLabel25);
        jLabel25.setBounds(590, 30, 30, 17);

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Vintage Culture");
        play3.add(jLabel27);
        jLabel27.setBounds(330, 30, 100, 17);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Pour Over");
        play3.add(jLabel29);
        jLabel29.setBounds(100, 30, 80, 17);

        getContentPane().add(play3);
        play3.setBounds(300, 330, 810, 70);

        play1.setBackground(new java.awt.Color(0, 0, 0));
        play1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        play1.setForeground(new java.awt.Color(0, 0, 0));
        play1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play1MouseClicked(evt);
            }
        });
        play1.setLayout(null);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        play1.add(jLabel15);
        jLabel15.setBounds(40, 20, 30, 30);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Starboy");
        play1.add(jLabel18);
        jLabel18.setBounds(100, 30, 60, 17);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("The Weeknd");
        play1.add(jLabel19);
        jLabel19.setBounds(330, 30, 90, 17);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("3:30");
        play1.add(jLabel20);
        jLabel20.setBounds(590, 30, 30, 17);

        labelLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconLike.png"))); // NOI18N
        labelLike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLikeMouseClicked(evt);
            }
        });
        play1.add(labelLike);
        labelLike.setBounds(730, 10, 50, 40);

        getContentPane().add(play1);
        play1.setBounds(300, 150, 810, 70);

        play2.setBackground(new java.awt.Color(0, 0, 0));
        play2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 23, 23), 2));
        play2.setForeground(new java.awt.Color(0, 0, 0));
        play2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play2MouseClicked(evt);
            }
        });
        play2.setLayout(null);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        play2.add(jLabel11);
        jLabel11.setBounds(40, 20, 30, 30);

        labelLike2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconLike.png"))); // NOI18N
        labelLike2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLike2MouseClicked(evt);
            }
        });
        play2.add(labelLike2);
        labelLike2.setBounds(730, 20, 50, 30);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("3:19");
        play2.add(jLabel24);
        jLabel24.setBounds(590, 30, 30, 17);

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Mike Posner");
        play2.add(jLabel26);
        jLabel26.setBounds(330, 30, 90, 17);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("I Took a Pill in Ibiza");
        play2.add(jLabel28);
        jLabel28.setBounds(100, 30, 150, 17);

        getContentPane().add(play2);
        play2.setBounds(300, 240, 810, 70);

        LabelPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/IconPlay.png"))); // NOI18N
        LabelPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelPlayMouseClicked(evt);
            }
        });
        getContentPane().add(LabelPlay);
        LabelPlay.setBounds(580, 480, 40, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TOP 3 Músicas mais ouvidas do momento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(770, 120, 300, 17);

        labelAlbum2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/Album2.png"))); // NOI18N
        labelAlbum2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelAlbum2);
        labelAlbum2.setBounds(10, 460, 50, 50);

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setText("Starboy");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(390, 60, 140, 16);

        labelArtista.setBackground(new java.awt.Color(255, 255, 255));
        labelArtista.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelArtista.setForeground(new java.awt.Color(0, 0, 0));
        labelArtista.setText("The Weeknd");
        getContentPane().add(labelArtista);
        labelArtista.setBounds(390, 90, 90, 16);

        labelAlbum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/Album2.1.png"))); // NOI18N
        labelAlbum1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelAlbum1);
        labelAlbum1.setBounds(300, 50, 77, 77);

        labelSuba.setBackground(new java.awt.Color(0, 0, 0));
        labelSuba.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelSuba.setForeground(new java.awt.Color(255, 255, 255));
        labelSuba.setText("The Weeknd");
        getContentPane().add(labelSuba);
        labelSuba.setBounds(70, 490, 130, 16);

        labelSubt.setBackground(new java.awt.Color(0, 0, 0));
        labelSubt.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelSubt.setForeground(new java.awt.Color(255, 255, 255));
        labelSubt.setText("Starboy");
        getContentPane().add(labelSubt);
        labelSubt.setBounds(70, 470, 150, 16);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<<");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 0, 40, 30);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("0:00");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(380, 480, 30, 19);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho2/img/WallPaper3.png"))); // NOI18N
        jLabel36.setText("jLabel36");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(0, 0, 1199, 520);

        setSize(new java.awt.Dimension(1166, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Ao Clikar no Play
    private void LabelPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelPlayMouseClicked
        if (play) {
            LabelPlay.setIcon(imgPause);
            silenciarMusica();
        } else {
            LabelPlay.setIcon(imgPause2);
            reproduzirMusica();
        }

        play = !play;
    }

    public void reproduzirMusica() {
        try {
            String musica = ms;

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(musica);

            if (inputStream != null) {
                try ( AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream)) {
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);

                    int duration = (int) (clip.getMicrosecondLength() / 1_000_000);

                    musicBar.setMaximum(duration);

                    javax.swing.Timer timer = new javax.swing.Timer(1, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            int position = (int) (clip.getMicrosecondPosition() / 1_000_000);
                            musicBar.setValue(position);
                        }
                    });

                    timer.start();
                    clip.start();
                }
            } else {
                System.out.println("Arquivo de música não encontrado.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_LabelPlayMouseClicked

    // Método para silenciar a música
    private void silenciarMusica() {
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
    

    public void musicaSelecionada(String Music) {
        ms = Music;
    }

    public void alterarIcone1() {
        if (click) {
            labelLike.setIcon(imgLike2);

        } else {
            labelLike.setIcon(imgLike);
        }
        click = !click;
    }

    public void alterarIcone2() {
        if (click) {
            labelLike2.setIcon(imgLike);
        } else {
            labelLike2.setIcon(imgLike2);
        }
        click = !click;
    }

    public void alterarIcone3() {
        if (click) {
            labelLike3.setIcon(imgLike2);
        } else {
            labelLike3.setIcon(imgLike);
        }
        click = !click;
    }

    public void alteraAlbum() {
        if (click) {
            labelAlbum1.setIcon(Album2_1);
            labelAlbum2.setIcon(Album2);
            labelTitulo.setText("Starboy");
            labelArtista.setText("The Weeknd");
            labelSubt.setText("Starboy");
            labelSuba.setText("The Weeknd");
            tFinal.setText("3:30");
        } else {
            labelAlbum1.setIcon(Album2_1);
            labelAlbum2.setIcon(Album2);
            labelTitulo.setText("Starboy");
            labelArtista.setText("The Weeknd");
            labelSubt.setText("Starboy");
            labelSuba.setText("The Weeknd");
            tFinal.setText("3:30");
        }
        click = !click;
    }

    public void alteraAlbum2() {
        if (click) {
            labelAlbum1.setIcon(Album1_2);
            labelAlbum2.setIcon(Album1);
            labelTitulo.setText("I Took a Pill in Ibiza");
            labelArtista.setText("Mike Posner");
            labelSubt.setText("I Took a Pill in Ibiza");
            labelSuba.setText("Mike Posner");
            tFinal.setText("3:19");
        } else {
            labelAlbum1.setIcon(Album1_2);
            labelAlbum2.setIcon(Album1);
            labelTitulo.setText("I Took a Pill in Ibiza");
            labelArtista.setText("Mike Posner");
            labelSubt.setText("I Took a Pill in Ibiza");
            labelSuba.setText("Mike Posner");
            tFinal.setText("3:19");
        }
        click = !click;
    }

    public void alteraAlbum3() {
        if (click) {
            labelAlbum1.setIcon(Album3_1);
            labelAlbum2.setIcon(Album3);
            labelTitulo.setText("Pour Over");
            labelArtista.setText("Vintage Culture");
            labelSubt.setText("Pour Over");
            labelSuba.setText("Vintage Culture");
            tFinal.setText("3:40");
        } else {
            labelAlbum1.setIcon(Album3_1);
            labelAlbum2.setIcon(Album3);
            labelTitulo.setText("Pour Over");
            labelArtista.setText("Vintage Culture");
            labelSubt.setText("Pour Over");
            labelSuba.setText("Vintage Culture");
            tFinal.setText("3:40");
        }
        click = !click;
    }


    private void labelLikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLikeMouseClicked
        alterarIcone1();


    }//GEN-LAST:event_labelLikeMouseClicked

    private void labelLike2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLike2MouseClicked
        alterarIcone2();

    }//GEN-LAST:event_labelLike2MouseClicked

    private void labelLike3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLike3MouseClicked
        alterarIcone3();

    }//GEN-LAST:event_labelLike3MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dispose();
        new TLogin().setVisible(true);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void panelPlanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPlanosMouseClicked
        new TPlanos().setVisible(true);

    }//GEN-LAST:event_panelPlanosMouseClicked

    private void play1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play1MouseClicked
        alteraAlbum();
        musicaSelecionada("Starboy.wav");

    }//GEN-LAST:event_play1MouseClicked

    private void play2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play2MouseClicked
        alteraAlbum2();
        musicaSelecionada("I Took a Pill in Ibiza.wav");


    }//GEN-LAST:event_play2MouseClicked

    private void play3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play3MouseClicked
        alteraAlbum3();
        musicaSelecionada("Pour Over.wav");

    }//GEN-LAST:event_play3MouseClicked

    private void labelNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNextMouseClicked
        alteraAlbum2();

    }//GEN-LAST:event_labelNextMouseClicked

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        alteraAlbum3();

    }//GEN-LAST:event_labelBackMouseClicked

    private void panelPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPlaylistMouseClicked
        new TPlaylist().setVisible(true);
    }//GEN-LAST:event_panelPlaylistMouseClicked

    private void panelMusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMusicasMouseClicked
        dispose();
        new TMusicas(contaNova).setVisible(true);


    }//GEN-LAST:event_panelMusicasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPlay;
    private javax.swing.JLabel NomeP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAlbum1;
    private javax.swing.JLabel labelAlbum2;
    private javax.swing.JLabel labelArtista;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelLike;
    private javax.swing.JLabel labelLike2;
    private javax.swing.JLabel labelLike3;
    private javax.swing.JLabel labelNext;
    private javax.swing.JLabel labelSuba;
    private javax.swing.JLabel labelSubt;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JProgressBar musicBar;
    private javax.swing.JPanel panelMusicas;
    private javax.swing.JPanel panelPlanos;
    private javax.swing.JPanel panelPlaylist;
    private javax.swing.JPanel play1;
    private javax.swing.JPanel play2;
    private javax.swing.JPanel play3;
    private javax.swing.JLabel tFinal;
    // End of variables declaration//GEN-END:variables
}
