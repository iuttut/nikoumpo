package Tama;


import Tama.gestionPerso.Heros;
import Tama.gestionObjets.Nourriture;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author p1204031
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    Date dateDebut, dateFin;

    Heros heros = new Heros("Nikoumpo", 400, 300, 400, 1, 0, 100, 100, 40, 100, 20, 40, 40, 1, 100, 0, 0, 0);
    Nourriture bonbon = new Nourriture("Bonbon", 0.01F, 10);

    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelHome = new javax.swing.JPanel();
        PanelQuete = new javax.swing.JPanel();
        LabelQuete = new javax.swing.JLabel();
        ButtonGO = new javax.swing.JButton();
        LabelLVL = new javax.swing.JLabel();
        LabelOr = new javax.swing.JLabel();
        Or = new javax.swing.JLabel();
        LabelPepite = new javax.swing.JLabel();
        Pepite = new javax.swing.JLabel();
        LVL = new javax.swing.JLabel();
        PanelEtat = new javax.swing.JPanel();
        BarMP = new javax.swing.JProgressBar();
        BarPV = new javax.swing.JProgressBar();
        BarDéfense = new javax.swing.JProgressBar();
        LabelMP = new javax.swing.JLabel();
        LabelPV = new javax.swing.JLabel();
        BarForce = new javax.swing.JProgressBar();
        BarEXP = new javax.swing.JProgressBar();
        LabelForce = new javax.swing.JLabel();
        LabelEXP = new javax.swing.JLabel();
        LabelDefense = new javax.swing.JLabel();
        LabelEtat = new javax.swing.JLabel();
        PanelStats = new javax.swing.JPanel();
        LabelStats = new javax.swing.JLabel();
        BarHumeur = new javax.swing.JProgressBar();
        LabelHumeur = new javax.swing.JLabel();
        LabelFaim = new javax.swing.JLabel();
        LabelSommeil = new javax.swing.JLabel();
        BarFaim = new javax.swing.JProgressBar();
        BarSommeil = new javax.swing.JProgressBar();
        ButtonNourrir = new javax.swing.JButton();
        ButtonDormir = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PanelPerso = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ninkoumpo");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelQuete.setBackground(new java.awt.Color(220, 86, 86));
        PanelQuete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelQuete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelQuete.setText("QUETE");

        ButtonGO.setText("GO");
        ButtonGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGOActionPerformed(evt);
            }
        });

        LabelLVL.setText("LVL :");

        LabelOr.setText("Or :");

        LabelPepite.setText("Pepite:");

        LVL.setText("jLabel6");

        javax.swing.GroupLayout PanelQueteLayout = new javax.swing.GroupLayout(PanelQuete);
        PanelQuete.setLayout(PanelQueteLayout);
        PanelQueteLayout.setHorizontalGroup(
            PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelQueteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelQueteLayout.createSequentialGroup()
                        .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelOr)
                            .addComponent(LabelPepite))
                        .addGap(14, 14, 14)
                        .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelQueteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Pepite))
                            .addComponent(Or))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelQuete)
                        .addGap(94, 94, 94))
                    .addGroup(PanelQueteLayout.createSequentialGroup()
                        .addComponent(LabelLVL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LVL)
                        .addGap(108, 108, 108)
                        .addComponent(ButtonGO, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelQueteLayout.setVerticalGroup(
            PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelQueteLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelQuete)
                    .addGroup(PanelQueteLayout.createSequentialGroup()
                        .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelOr)
                            .addComponent(Or))
                        .addGap(5, 5, 5)
                        .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPepite)
                            .addComponent(Pepite))))
                .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelQueteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelQueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelLVL)
                            .addComponent(LVL))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQueteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonGO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        PanelEtat.setBackground(new java.awt.Color(153, 180, 209));
        PanelEtat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BarPV.setToolTipText("");
        BarPV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BarPV.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BarPV.setStringPainted(true);
        BarPV.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BarPVPropertyChange(evt);
            }
        });

        LabelMP.setText("MP :");

        LabelPV.setText("PV :");

        LabelForce.setText("Force :");

        LabelEXP.setText("EXP :");

        LabelDefense.setText("Défense :");

        LabelEtat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelEtat.setText("ETAT");

        javax.swing.GroupLayout PanelEtatLayout = new javax.swing.GroupLayout(PanelEtat);
        PanelEtat.setLayout(PanelEtatLayout);
        PanelEtatLayout.setHorizontalGroup(
            PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEtatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEtatLayout.createSequentialGroup()
                        .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelEXP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPV, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelMP, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEtatLayout.createSequentialGroup()
                        .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelForce, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDefense))
                        .addGap(25, 25, 25)
                        .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BarDéfense, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarForce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarEXP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarMP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarPV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEtatLayout.createSequentialGroup()
                                .addComponent(LabelEtat)
                                .addGap(71, 71, 71)))
                        .addGap(19, 19, 19))))
        );
        PanelEtatLayout.setVerticalGroup(
            PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEtatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelEtat)
                .addGap(12, 12, 12)
                .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPV)
                    .addComponent(BarPV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BarMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BarEXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEXP))
                .addGap(18, 18, 18)
                .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BarForce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelForce))
                .addGap(18, 18, 18)
                .addGroup(PanelEtatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDefense)
                    .addComponent(BarDéfense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        PanelStats.setBackground(new java.awt.Color(109, 109, 109));
        PanelStats.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelStats.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelStats.setText("STATS");

        BarHumeur.setStringPainted(true);
        BarHumeur.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BarHumeurPropertyChange(evt);
            }
        });

        LabelHumeur.setText("Humeur :");

        LabelFaim.setText("Faim :");

        LabelSommeil.setText("Sommeil :");

        BarFaim.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BarFaimPropertyChange(evt);
            }
        });

        BarSommeil.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BarSommeilPropertyChange(evt);
            }
        });

        ButtonNourrir.setText("Nourrir");
        ButtonNourrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ButtonDormir.setText("Dormir");
        ButtonDormir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDormirMouseClicked(evt);
            }
        });
        ButtonDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDormirActionPerformed(evt);
            }
        });
        ButtonDormir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ButtonDormirPropertyChange(evt);
            }
        });

        jButton1.setText("Miner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelStatsLayout = new javax.swing.GroupLayout(PanelStats);
        PanelStats.setLayout(PanelStatsLayout);
        PanelStatsLayout.setHorizontalGroup(
            PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStatsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelStatsLayout.createSequentialGroup()
                        .addComponent(LabelSommeil)
                        .addGap(10, 10, 10)
                        .addGroup(PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelStatsLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(LabelStats))
                            .addComponent(BarFaim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarSommeil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarHumeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelStatsLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDormir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(ButtonNourrir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelFaim)
                    .addComponent(LabelHumeur))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStatsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        PanelStatsLayout.setVerticalGroup(
            PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStatsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelStats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHumeur)
                    .addComponent(BarHumeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFaim)
                    .addComponent(BarFaim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarSommeil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSommeil))
                .addGap(16, 16, 16)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNourrir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDormir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );

        PanelPerso.setBackground(new java.awt.Color(255, 153, 153));
        PanelPerso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelPerso.setForeground(new java.awt.Color(255, 102, 102));

        jLabel13.setForeground(new java.awt.Color(255, 153, 153));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/23063-bubka-smileyhaha.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jLabel13.setToolTipText("");

        javax.swing.GroupLayout PanelPersoLayout = new javax.swing.GroupLayout(PanelPerso);
        PanelPerso.setLayout(PanelPersoLayout);
        PanelPersoLayout.setHorizontalGroup(
            PanelPersoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPersoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        PanelPersoLayout.setVerticalGroup(
            PanelPersoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
        );

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelEtat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPerso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelQuete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelStats, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelEtat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelStats, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelPerso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelQuete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOME", PanelHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ButtonDormir.isSelected() == false) {
            heros.nourrir(bonbon);
            BarFaim.setString(heros.getFaimActuel() + "/" + heros.getFaim());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void BarPVPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BarPVPropertyChange
        BarPV.setValue(heros.getPvActuel() * 100 / heros.getPv());

    }//GEN-LAST:event_BarPVPropertyChange

    private void BarFaimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BarFaimPropertyChange
        BarFaim.setValue(heros.getFaimActuel() * 100 / heros.getFaim());
        BarFaim.setString(heros.getFaimActuel() + "/" + heros.getFaim());
        BarHumeur.setString("");
    }//GEN-LAST:event_BarFaimPropertyChange

    private void ButtonDormirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ButtonDormirPropertyChange

    }//GEN-LAST:event_ButtonDormirPropertyChange

    private void BarSommeilPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BarSommeilPropertyChange
        BarSommeil.setValue(heros.getSommeilActuel() * 100 / heros.getSommeil());
        BarSommeil.setString(heros.getSommeilActuel() + "/" + heros.getSommeil());
        BarHumeur.setString("");
    }//GEN-LAST:event_BarSommeilPropertyChange

    private void ButtonDormirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDormirMouseClicked

    }//GEN-LAST:event_ButtonDormirMouseClicked

    private void BarHumeurPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BarHumeurPropertyChange
        BarHumeur.setValue(heros.getHumeurActuel() * 100 / heros.getHumeur());
        BarHumeur.setString(heros.getHumeurActuel() + "/" + heros.getHumeur());
        jLabel13.setText("ahahaha");
    }//GEN-LAST:event_BarHumeurPropertyChange

    private void ButtonDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDormirActionPerformed
        if (ButtonDormir.isSelected() == true) {
            dateDebut = new Date();
            jLabel8.setText(dateDebut.toString());

        }
        if (ButtonDormir.isSelected() == false) {
            dateFin = new Date();
            jLabel8.setText(dateFin.toString());
            heros.dormir(dateFin.getTime() - dateDebut.getTime());
            BarSommeil.setString(heros.getSommeilActuel() + "/" + heros.getSommeil());
        }
    }//GEN-LAST:event_ButtonDormirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ButtonDormir.isSelected() == false) {
            heros.miner();
            Or.setText(Integer.toString(heros.getGold()));
            Pepite.setText(Integer.toString(heros.getPepite()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGOActionPerformed
     new Thread() {
        @Override
        public void run() {
            String [] arg={"Jeu","Virtuel"};
             Jeu.main(arg);
        }
   }.start();
    }//GEN-LAST:event_ButtonGOActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    
                    new menu().setVisible(true);
                }
            });
        } catch (InvocationTargetException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarDéfense;
    private javax.swing.JProgressBar BarEXP;
    private javax.swing.JProgressBar BarFaim;
    private javax.swing.JProgressBar BarForce;
    private javax.swing.JProgressBar BarHumeur;
    private javax.swing.JProgressBar BarMP;
    private javax.swing.JProgressBar BarPV;
    private javax.swing.JProgressBar BarSommeil;
    private javax.swing.JToggleButton ButtonDormir;
    private javax.swing.JButton ButtonGO;
    private javax.swing.JButton ButtonNourrir;
    private javax.swing.JLabel LVL;
    private javax.swing.JLabel LabelDefense;
    private javax.swing.JLabel LabelEXP;
    private javax.swing.JLabel LabelEtat;
    private javax.swing.JLabel LabelFaim;
    private javax.swing.JLabel LabelForce;
    private javax.swing.JLabel LabelHumeur;
    private javax.swing.JLabel LabelLVL;
    private javax.swing.JLabel LabelMP;
    private javax.swing.JLabel LabelOr;
    private javax.swing.JLabel LabelPV;
    private javax.swing.JLabel LabelPepite;
    private javax.swing.JLabel LabelQuete;
    private javax.swing.JLabel LabelSommeil;
    private javax.swing.JLabel LabelStats;
    private javax.swing.JLabel Or;
    private javax.swing.JPanel PanelEtat;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelPerso;
    private javax.swing.JPanel PanelQuete;
    private javax.swing.JPanel PanelStats;
    private javax.swing.JLabel Pepite;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
