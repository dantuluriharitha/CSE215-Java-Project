/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project215;

import javax.swing.JFrame;

/**
 *
 * @author MD Khairul Hasan
 */
public class Available extends javax.swing.JFrame {

    /**
     * Creates new form Availbale
     */
    String aa= " ";
    int ss =0;
    public Available(String n, String b, String g, String a, String d, String m, String blgr, String bgs,String x , int y) {
        initComponents();

        // jtfAll.setText(n+"   "+b+"   "+g+"    "+a+"    "+d+"    "+m+"    "+blgr+"    "+bgs+"    ");
        jtfAll.setText(n);
        jtfAll1.setText(b);
        jtfAll2.setText(g);
        jtfAll3.setText(a);
        jtfAll4.setText(d);
        jtfAll5.setText(m);
        jtfAll6.setText(bgs);
        jtfAll7.setText(blgr);
aa=x;
ss= y;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3rd = new javax.swing.JPanel();
        jname = new javax.swing.JLabel();
        jbd = new javax.swing.JLabel();
        jg = new javax.swing.JLabel();
        ja = new javax.swing.JLabel();
        jd = new javax.swing.JLabel();
        jmo = new javax.swing.JLabel();
        jbag = new javax.swing.JLabel();
        jbl = new javax.swing.JLabel();
        jbtnPrice = new javax.swing.JButton();
        jtfAll = new javax.swing.JTextField();
        jtfAll1 = new javax.swing.JTextField();
        jtfAll2 = new javax.swing.JTextField();
        jtfAll3 = new javax.swing.JTextField();
        jtfAll4 = new javax.swing.JTextField();
        jtfAll5 = new javax.swing.JTextField();
        jtfAll6 = new javax.swing.JTextField();
        jtfAll7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3rd.setBackground(new java.awt.Color(0, 51, 102));

        jname.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jname.setForeground(new java.awt.Color(255, 255, 255));
        jname.setText("Name");

        jbd.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jbd.setForeground(new java.awt.Color(255, 255, 255));
        jbd.setText("Birth Date");

        jg.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jg.setForeground(new java.awt.Color(255, 255, 255));
        jg.setText("Gender");

        ja.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        ja.setForeground(new java.awt.Color(255, 255, 255));
        ja.setText("Age");

        jd.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jd.setForeground(new java.awt.Color(255, 255, 255));
        jd.setText("Date");

        jmo.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jmo.setForeground(new java.awt.Color(255, 255, 255));
        jmo.setText("Mobile No");

        jbag.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jbag.setForeground(new java.awt.Color(255, 255, 255));
        jbag.setText("Bag");

        jbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jbl.setForeground(new java.awt.Color(255, 255, 255));
        jbl.setText("Blood Group");

        jbtnPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPrice.setText("Price");
        jbtnPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPriceMouseClicked(evt);
            }
        });
        jbtnPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPriceActionPerformed(evt);
            }
        });

        jtfAll.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfAll.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll.setEnabled(false);
        jtfAll.setFocusable(false);
        jtfAll.setHighlighter(null);
        jtfAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAllActionPerformed(evt);
            }
        });

        jtfAll1.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAll1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll1.setEnabled(false);
        jtfAll1.setFocusable(false);
        jtfAll1.setHighlighter(null);
        jtfAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAll1ActionPerformed(evt);
            }
        });

        jtfAll2.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAll2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll2.setEnabled(false);
        jtfAll2.setFocusable(false);
        jtfAll2.setHighlighter(null);
        jtfAll2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAll2ActionPerformed(evt);
            }
        });

        jtfAll3.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAll3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll3.setEnabled(false);
        jtfAll3.setFocusable(false);
        jtfAll3.setHighlighter(null);
        jtfAll3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAll3ActionPerformed(evt);
            }
        });

        jtfAll4.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAll4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll4.setEnabled(false);
        jtfAll4.setFocusable(false);
        jtfAll4.setHighlighter(null);
        jtfAll4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAll4ActionPerformed(evt);
            }
        });

        jtfAll5.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAll5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll5.setEnabled(false);
        jtfAll5.setFocusable(false);
        jtfAll5.setHighlighter(null);
        jtfAll5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAll5ActionPerformed(evt);
            }
        });

        jtfAll6.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAll6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll6.setEnabled(false);
        jtfAll6.setFocusable(false);
        jtfAll6.setHighlighter(null);
        jtfAll6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAll6ActionPerformed(evt);
            }
        });

        jtfAll7.setBackground(new java.awt.Color(204, 204, 255));
        jtfAll7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAll7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAll7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfAll7.setEnabled(false);
        jtfAll7.setFocusable(false);
        jtfAll7.setHighlighter(null);
        jtfAll7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAll7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3rdLayout = new javax.swing.GroupLayout(jPanel3rd);
        jPanel3rd.setLayout(jPanel3rdLayout);
        jPanel3rdLayout.setHorizontalGroup(
            jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3rdLayout.createSequentialGroup()
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3rdLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jbtnPrice))
                    .addGroup(jPanel3rdLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3rdLayout.createSequentialGroup()
                                .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAll, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3rdLayout.createSequentialGroup()
                                .addComponent(jbd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3rdLayout.createSequentialGroup()
                                .addComponent(jg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAll2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3rdLayout.createSequentialGroup()
                                .addComponent(ja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAll3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3rdLayout.createSequentialGroup()
                                .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAll4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3rdLayout.createSequentialGroup()
                                .addComponent(jmo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAll5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3rdLayout.createSequentialGroup()
                                .addComponent(jbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAll7, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3rdLayout.createSequentialGroup()
                                .addComponent(jbag, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(jtfAll6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3rdLayout.setVerticalGroup(
            jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3rdLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ja, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3rdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbag, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAll6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jbtnPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3rd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3rd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPriceMouseClicked
        Price liu = new Price(aa,ss);
        liu.setVisible(true);
        liu.pack();
        liu.setLocationRelativeTo(null);
        liu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbtnPriceMouseClicked

    private void jtfAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAllActionPerformed

    }//GEN-LAST:event_jtfAllActionPerformed

    private void jbtnPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPriceActionPerformed

        // jtfAll.setText();
// TODO add your handling code here:
    }//GEN-LAST:event_jbtnPriceActionPerformed

    private void jtfAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAll1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAll1ActionPerformed

    private void jtfAll2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAll2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAll2ActionPerformed

    private void jtfAll3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAll3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAll3ActionPerformed

    private void jtfAll4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAll4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAll4ActionPerformed

    private void jtfAll5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAll5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAll5ActionPerformed

    private void jtfAll6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAll6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAll6ActionPerformed

    private void jtfAll7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAll7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAll7ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // ava.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3rd;
    private javax.swing.JLabel ja;
    private javax.swing.JLabel jbag;
    private javax.swing.JLabel jbd;
    private javax.swing.JLabel jbl;
    private javax.swing.JButton jbtnPrice;
    private javax.swing.JLabel jd;
    private javax.swing.JLabel jg;
    private javax.swing.JLabel jmo;
    private javax.swing.JLabel jname;
    private javax.swing.JTextField jtfAll;
    private javax.swing.JTextField jtfAll1;
    private javax.swing.JTextField jtfAll2;
    private javax.swing.JTextField jtfAll3;
    private javax.swing.JTextField jtfAll4;
    private javax.swing.JTextField jtfAll5;
    private javax.swing.JTextField jtfAll6;
    private javax.swing.JTextField jtfAll7;
    // End of variables declaration//GEN-END:variables
}