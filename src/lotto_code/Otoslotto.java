package lotto_code;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;

public class Otoslotto extends javax.swing.JFrame {
  
  public Otoslotto() {
    initComponents();
    initOwnComp();
  }
  
  private void initOwnComp() {
    panelSzamok.add(ball1);
    panelSzamok.add(ball2);
    panelSzamok.add(ball3);
    panelSzamok.add(ball4);
    panelSzamok.add(ball5);
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
    balls = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Ötöslottó sorsolás");
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/favicon.png")));
    setPreferredSize(new java.awt.Dimension(500, 400));
    setResizable(false);
    setSize(new java.awt.Dimension(500, 400));
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
    draw.setBounds(220, 273, 110, 30);

    drawpicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    drawpicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/draw.jpg"))); // NOI18N
    getContentPane().add(drawpicture);
    drawpicture.setBounds(10, 11, 480, 300);

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

    balls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/balls5.png"))); // NOI18N
    getContentPane().add(balls);
    balls.setBounds(10, 317, 480, 72);

    setSize(new java.awt.Dimension(516, 437));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
  
  public void sorsolas(int szamossag, int tipp) {
    nyeroszamok = new int[tipp];
    for (int i = 0; i < tipp; i++)
    {
      boolean vanEgyezes;
      do {
        vanEgyezes = false;
        nyeroszamok[i] = (int)(Math.random()*szamossag)+1;
        for (int j = 0; j < i; j++)
        {
          if (nyeroszamok[i] == nyeroszamok[j])
          {
            vanEgyezes = true;
          }
        }
      } while (vanEgyezes);
    }
    Arrays.sort(nyeroszamok);
    
    for (int i = 0; i < nyeroszamok.length; i++) {
      for (int j = 0; j < panelSzamok.size(); j++) {
        panelSzamok.get(j).setText(nyeroszamok[j]+"");
      }
    }
  }
  
  private void drawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawMouseClicked
    sorsolas(90, 5);
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
      java.util.logging.Logger.getLogger(Otoslotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Otoslotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Otoslotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Otoslotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Otoslotto().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel ball1;
  private javax.swing.JLabel ball2;
  private javax.swing.JLabel ball3;
  private javax.swing.JLabel ball4;
  private javax.swing.JLabel ball5;
  private javax.swing.JLabel balls;
  private javax.swing.JButton draw;
  private javax.swing.JLabel drawpicture;
  // End of variables declaration//GEN-END:variables
  ArrayList<JLabel> panelSzamok = new ArrayList();
  int [] nyeroszamok;
}