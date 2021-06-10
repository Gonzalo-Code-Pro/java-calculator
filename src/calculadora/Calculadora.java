package calculadora;

import java.awt.Color;
import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora() {
         setLocationRelativeTo(null);
        initComponents();
        transparentBtn();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        batery_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Montserrat Alternates Light", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, -1));

        txtResultado.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 50));

        batery_btn.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        batery_btn.setForeground(new java.awt.Color(55, 62, 71));
        batery_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/batery.png"))); // NOI18N
        batery_btn.setFocusPainted(false);
        batery_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        batery_btn.setPreferredSize(new java.awt.Dimension(50, 50));
        batery_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batery_btnActionPerformed(evt);
            }
        });
        jPanel1.add(batery_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/igual.png"))); // NOI18N
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/igualhover.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 80, 80));

        btn_exp.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 20)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(55, 62, 71));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechahover.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 80));

        btn_porcentaje.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 21)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(55, 62, 71));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porcentaje.png"))); // NOI18N
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porcentajehover.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 80, 80));

        btn_division.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_division.setForeground(new java.awt.Color(55, 62, 71));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/div.png"))); // NOI18N
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/divhover.png"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 80, 80));

        btn_multi.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_multi.setForeground(new java.awt.Color(55, 62, 71));
        btn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multi.png"))); // NOI18N
        btn_multi.setFocusPainted(false);
        btn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multi.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multihover.png"))); // NOI18N
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 80, 80));

        btn_resta.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 32)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(55, 62, 71));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resta.png"))); // NOI18N
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resta-2.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 80, 80));

        btn_suma.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(55, 62, 71));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suma.png"))); // NOI18N
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sumahover.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 80, 80));

        btn_c.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(55, 62, 71));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c.png"))); // NOI18N
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chover.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 80));

        btn_7.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-7-key-100.png"))); // NOI18N
        btn_7.setBorderPainted(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setOpaque(false);
        btn_7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-7-key-100-2.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 80));

        btn_8.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-8-key-100.png"))); // NOI18N
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-8-key-100-2.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 80, 80));

        btn_6.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seissinhover.png"))); // NOI18N
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-6-key-100.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 80, 80));

        btn_5.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-5-key-100.png"))); // NOI18N
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-5-key-100-2.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 80, 80));

        btn_4.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-4-key-100.png"))); // NOI18N
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-4-key-100-2.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 80));

        btn_3.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-3-key-100-2.png"))); // NOI18N
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-3-key-100.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 80, 80));

        btn_2.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dos_sinhover.png"))); // NOI18N
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-2-key-100.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 80, 80));

        btn_1.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-1-llave-100-2.png"))); // NOI18N
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-1-llave-100.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 80));

        btn_dot.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(55, 62, 71));
        btn_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punto2.png"))); // NOI18N
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 160, 80));

        btn_0.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-0-key-100.png"))); // NOI18N
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-0-key-100-2.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 80));

        btn_9.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-9-key-100.png"))); // NOI18N
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-9-key-100-2.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumber("%");

    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
        txtOperacion.setText(texto);
        btn_igual.doClick();
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        addNumber("/");

    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        addNumber("*");

    }//GEN-LAST:event_btn_multiActionPerformed

    private void batery_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batery_btnActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_batery_btnActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        addNumber(".");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {
            //btn_c.doClick();
        }


    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_restaActionPerformed

    

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void cambiarColorBtn1(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#0db387"));
    }

    public void cambiarColorBtn2(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }

    public void addNumber(String digito) {
        txtOperacion.setText(txtOperacion.getText() + digito);
    }
    public void transparentBtn(){
        btn_0.setOpaque(false);
        btn_0.setContentAreaFilled(false);
        btn_0.setBorderPainted(false);
        
        btn_1.setOpaque(false);
        btn_1.setContentAreaFilled(false);
        btn_1.setBorderPainted(false);
        
        btn_2.setOpaque(false);
        btn_2.setContentAreaFilled(false);
        btn_2.setBorderPainted(false);
        
        btn_3.setOpaque(false);
        btn_3.setContentAreaFilled(false);
        btn_3.setBorderPainted(false);
        
        btn_4.setOpaque(false);
        btn_4.setContentAreaFilled(false);
        btn_4.setBorderPainted(false);
        
        
        btn_5.setOpaque(false);
        btn_5.setContentAreaFilled(false);
        btn_5.setBorderPainted(false);
       
        btn_6.setOpaque(false);
        btn_6.setContentAreaFilled(false);
        btn_6.setBorderPainted(false);
        
        btn_7.setOpaque(false);
        btn_7.setContentAreaFilled(false);
        btn_7.setBorderPainted(false);
        
        btn_8.setOpaque(false);
        btn_8.setContentAreaFilled(false);
        btn_8.setBorderPainted(false);
        
        
        btn_9.setOpaque(false);
        btn_9.setContentAreaFilled(false);
        btn_9.setBorderPainted(false);
        
        
        batery_btn.setOpaque(false);
        batery_btn.setContentAreaFilled(false);
        batery_btn.setBorderPainted(false);
        
        btn_division.setOpaque(false);
        btn_division.setContentAreaFilled(false);
        btn_division.setBorderPainted(false);
        
        btn_dot.setOpaque(false);
        btn_dot.setContentAreaFilled(false);
        btn_dot.setBorderPainted(false);
        
        btn_exp.setOpaque(false);
        btn_exp.setContentAreaFilled(false);
        btn_exp.setBorderPainted(false);
        
         btn_igual.setOpaque(false);
        btn_igual.setContentAreaFilled(false);
        btn_igual.setBorderPainted(false);
        
         btn_multi.setOpaque(false);
        btn_multi.setContentAreaFilled(false);
        btn_multi.setBorderPainted(false);
        
         btn_porcentaje.setOpaque(false);
        btn_porcentaje.setContentAreaFilled(false);
        btn_porcentaje.setBorderPainted(false);
        
        
        
         btn_suma.setOpaque(false);
        btn_suma.setContentAreaFilled(false);
        btn_suma.setBorderPainted(false);
        
        
        
         btn_resta.setOpaque(false);
        btn_resta.setContentAreaFilled(false);
        btn_resta.setBorderPainted(false);
        
          batery_btn.setOpaque(false);
        batery_btn.setContentAreaFilled(false);
        batery_btn.setBorderPainted(false);
        
         batery_btn.setOpaque(false);
        batery_btn.setContentAreaFilled(false);
        batery_btn.setBorderPainted(false);
         btn_c.setOpaque(false);
        btn_c.setContentAreaFilled(false);
        btn_c.setBorderPainted(false);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batery_btn;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
