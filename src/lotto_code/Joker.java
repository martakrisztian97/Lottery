package lotto_code;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Joker extends javax.swing.JFrame {
  
  public Joker() {
    initComponents();
    initOwnComp();
  }
  
  private void initOwnComp() {
    panelSzamok.add(ball1);
    panelSzamok.add(ball2);
    panelSzamok.add(ball3);
    panelSzamok.add(ball4);
    panelSzamok.add(ball5);
    panelSzamok.add(ball6);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    draw = new javax.swing.JButton();
    drawpicture = new javax.swing.JLabel();
    ball1 = new javax.swing.JLabel();
    ball2 = new javax.swing.JLabel();
    ball3 = new javax.swing.JLabel();
    ball4 = new javax.swing.JLabel();
    ball5 = new javax.swing.JLabel();
    ball6 = new javax.swing.JLabel();
    balls = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Joker sorsolás");
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/favicon.png")));
    setResizable(false);
    setSize(new java.awt.Dimension(600, 400));
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });
    getContentPane().setLayout(null);

    draw.setBackground(new java.awt.Color(0, 255, 51));
    draw.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    draw.setText("Sorsolás");
    draw.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        drawMouseClicked(evt);
      }
    });
    getContentPane().add(draw);
    draw.setBounds(272, 273, 110, 30);

    drawpicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    drawpicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/draw.jpg"))); // NOI18N
    getContentPane().add(drawpicture);
    drawpicture.setBounds(10, 11, 582, 300);

    ball1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
    ball1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    getContentPane().add(ball1);
    ball1.setBounds(10, 317, 72, 70);

    ball2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
    ball2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    getContentPane().add(ball2);
    ball2.setBounds(112, 317, 72, 70);

    ball3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
    ball3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    getContentPane().add(ball3);
    ball3.setBounds(214, 317, 72, 70);

    ball4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
    ball4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    getContentPane().add(ball4);
    ball4.setBounds(316, 317, 72, 70);

    ball5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
    ball5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    getContentPane().add(ball5);
    ball5.setBounds(418, 317, 72, 70);

    ball6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
    ball6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    getContentPane().add(ball6);
    ball6.setBounds(520, 317, 72, 70);

    balls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ballsjoker.png"))); // NOI18N
    getContentPane().add(balls);
    balls.setBounds(10, 317, 582, 72);

    setSize(new java.awt.Dimension(616, 439));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
  
  public void sorsolas() {
    jokerszamok = new int[6];
    for (int i = 0; i < jokerszamok.length; i++)
    {
      jokerszamok[i] = (int)(Math.random()*10)+0;
    }
    
    for (int i = 0; i < jokerszamok.length; i++) {
      for (int j = 0; j < panelSzamok.size(); j++) {
        panelSzamok.get(j).setText(jokerszamok[j]+"");
      }
    }
  }
  
  private void drawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawMouseClicked
    sorsolas();
  }//GEN-LAST:event_drawMouseClicked

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    new Menu().setVisible(true);
  }//GEN-LAST:event_formWindowClosing

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
      java.util.logging.Logger.getLogger(Joker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Joker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Joker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Joker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Joker().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel ball1;
  private javax.swing.JLabel ball2;
  private javax.swing.JLabel ball3;
  private javax.swing.JLabel ball4;
  private javax.swing.JLabel ball5;
  private javax.swing.JLabel ball6;
  private javax.swing.JLabel balls;
  private javax.swing.JButton draw;
  private javax.swing.JLabel drawpicture;
  // End of variables declaration//GEN-END:variables
  ArrayList<JLabel> panelSzamok = new ArrayList();
  int [] jokerszamok;
}