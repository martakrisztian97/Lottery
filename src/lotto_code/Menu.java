package lotto_code;

import java.awt.Toolkit;

public class Menu extends javax.swing.JFrame {

  public Menu() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    hatoslotto = new javax.swing.JButton();
    otoslotto = new javax.swing.JButton();
    skandinavlotto = new javax.swing.JButton();
    joker = new javax.swing.JButton();
    eurojackpot = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Szerencsejáték Zrt.");
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/favicon.png")));
    setResizable(false);
    setSize(new java.awt.Dimension(400, 300));

    hatoslotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/hatoslotto.png"))); // NOI18N
    hatoslotto.setFocusable(false);
    hatoslotto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        hatoslottoActionPerformed(evt);
      }
    });

    otoslotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/otoslotto.png"))); // NOI18N
    otoslotto.setFocusable(false);
    otoslotto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        otoslottoActionPerformed(evt);
      }
    });

    skandinavlotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/skandinavlotto.png"))); // NOI18N
    skandinavlotto.setFocusable(false);
    skandinavlotto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        skandinavlottoActionPerformed(evt);
      }
    });

    joker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/joker.png"))); // NOI18N
    joker.setFocusable(false);
    joker.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jokerActionPerformed(evt);
      }
    });

    eurojackpot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/eurojackpot.png"))); // NOI18N
    eurojackpot.setFocusable(false);
    eurojackpot.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        eurojackpotActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(133, 133, 133)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(eurojackpot)
          .addComponent(joker)
          .addComponent(skandinavlotto)
          .addComponent(otoslotto)
          .addComponent(hatoslotto))
        .addGap(133, 133, 133))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(otoslotto)
        .addGap(20, 20, 20)
        .addComponent(hatoslotto)
        .addGap(20, 20, 20)
        .addComponent(joker)
        .addGap(20, 20, 20)
        .addComponent(skandinavlotto)
        .addGap(20, 20, 20)
        .addComponent(eurojackpot)
        .addGap(20, 20, 20))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void otoslottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otoslottoActionPerformed
    new Otoslotto().setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_otoslottoActionPerformed

  private void hatoslottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hatoslottoActionPerformed
    new Hatoslotto().setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_hatoslottoActionPerformed

  private void jokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokerActionPerformed
    new Joker().setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_jokerActionPerformed

  private void skandinavlottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skandinavlottoActionPerformed
    new Skandinavlotto().setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_skandinavlottoActionPerformed

  private void eurojackpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eurojackpotActionPerformed
    new Eurojackpot().setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_eurojackpotActionPerformed

  public static void main(String args[]) {
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
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Menu().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton eurojackpot;
  private javax.swing.JButton hatoslotto;
  private javax.swing.JButton joker;
  private javax.swing.JButton otoslotto;
  private javax.swing.JButton skandinavlotto;
  // End of variables declaration//GEN-END:variables
}