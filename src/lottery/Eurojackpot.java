package lottery;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;

public class Eurojackpot extends javax.swing.JFrame {
  
  public Eurojackpot() {
    initComponents();
    initOwnComp();
  }
  
  private void initOwnComp() {
    panelSzamokA.add(ball1);
    panelSzamokA.add(ball2);
    panelSzamokA.add(ball3);
    panelSzamokA.add(ball4);
    panelSzamokA.add(ball5);
    panelSzamokB.add(ball6);
    panelSzamokB.add(ball7);
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
        ball7 = new javax.swing.JLabel();
        balls = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eurojackpot sorsolás");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/favicon.png")));
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

        ball6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ball6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ball6);
        ball6.setBounds(163, 389, 72, 70);

        ball7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ball7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ball7);
        ball7.setBounds(265, 389, 72, 70);

        balls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ballseuro.png"))); // NOI18N
        getContentPane().add(balls);
        balls.setBounds(10, 317, 480, 144);

        setSize(new java.awt.Dimension(516, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
  public void sorsolasA(int szamossag, int tipp) {
    nyeroszamokA = new int[tipp];
    for (int i = 0; i < tipp; i++)
    {
      boolean vanEgyezes;
      do {
        vanEgyezes = false;
        nyeroszamokA[i] = (int)(Math.random()*szamossag)+1;
        for (int j = 0; j < i; j++)
        {
          if (nyeroszamokA[i] == nyeroszamokA[j])
          {
            vanEgyezes = true;
          }
        }
      } while (vanEgyezes);
    }
    Arrays.sort(nyeroszamokA);
    
    for (int i = 0; i < nyeroszamokA.length; i++) {
      for (int j = 0; j < panelSzamokA.size(); j++) {
        panelSzamokA.get(j).setText(nyeroszamokA[j]+"");
      }
    }
  }
  
  public void sorsolasB(int szamossag, int tipp) {
    nyeroszamokB = new int[tipp];
    for (int i = 0; i < tipp; i++)
    {
      boolean vanEgyezes;
      do {
        vanEgyezes = false;
        nyeroszamokB[i] = (int)(Math.random()*szamossag)+1;
        for (int j = 0; j < i; j++)
        {
          if (nyeroszamokB[i] == nyeroszamokB[j])
          {
            vanEgyezes = true;
          }
        }
      } while (vanEgyezes);
    }
    Arrays.sort(nyeroszamokB);
    
    for (int i = 0; i < nyeroszamokB.length; i++) {
      for (int j = 0; j < panelSzamokB.size(); j++) {
        panelSzamokB.get(j).setText(nyeroszamokB[j]+"");
      }
    }
  }
  
  private void drawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawMouseClicked
    sorsolasA(50, 5);
    sorsolasB(10, 2);
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
      java.util.logging.Logger.getLogger(Eurojackpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Eurojackpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Eurojackpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Eurojackpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Eurojackpot().setVisible(true);
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
    private javax.swing.JLabel ball7;
    private javax.swing.JLabel balls;
    private javax.swing.JButton draw;
    private javax.swing.JLabel drawpicture;
    // End of variables declaration//GEN-END:variables
  ArrayList<JLabel> panelSzamokA = new ArrayList();
  ArrayList<JLabel> panelSzamokB = new ArrayList();
  int [] nyeroszamokA;
  int [] nyeroszamokB;
}