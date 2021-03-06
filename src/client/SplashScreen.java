/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesse
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
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

        SplashPanel1 = new javax.swing.JPanel();
        DevelopersTxt = new javax.swing.JLabel();
        loadingNum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LoadingImg = new javax.swing.JLabel();
        DTJ_Logo = new javax.swing.JLabel();
        Splash_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(600, 200));
        setMaximumSize(new java.awt.Dimension(300, 300));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(100, 200));

        SplashPanel1.setBackground(new java.awt.Color(255, 255, 255));
        SplashPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        SplashPanel1.setMaximumSize(new java.awt.Dimension(300, 300));

        DevelopersTxt.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DevelopersTxt.setForeground(new java.awt.Color(102, 102, 102));
        DevelopersTxt.setText(" Program Developers: Dustin Dejesus, Tian Gao and Jesse Ford");

        loadingNum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loadingNum.setForeground(new java.awt.Color(102, 102, 102));
        loadingNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingNum.setText("99%");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("   © 2018 All Rights Reserved    ");

        LoadingImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/loading.gif"))); // NOI18N
        LoadingImg.setMaximumSize(new java.awt.Dimension(400, 300));
        LoadingImg.setPreferredSize(new java.awt.Dimension(400, 300));

        DTJ_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/DTJlogo.PNG"))); // NOI18N
        DTJ_Logo.setText("jLabel2");

        Splash_Cancel.setText("Cancel");
        Splash_Cancel.setToolTipText("Click to Cancel Start-up");
        Splash_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Splash_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SplashPanel1Layout = new javax.swing.GroupLayout(SplashPanel1);
        SplashPanel1.setLayout(SplashPanel1Layout);
        SplashPanel1Layout.setHorizontalGroup(
            SplashPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanel1Layout.createSequentialGroup()
                .addGroup(SplashPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SplashPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(DTJ_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SplashPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LoadingImg, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadingNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SplashPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addComponent(Splash_Cancel))
                    .addGroup(SplashPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(DevelopersTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        SplashPanel1Layout.setVerticalGroup(
            SplashPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(DTJ_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SplashPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SplashPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LoadingImg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SplashPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(loadingNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(DevelopersTxt)
                .addGroup(SplashPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SplashPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(Splash_Cancel)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Splash_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Splash_CancelActionPerformed
        // User Clicks "Cancel." Application Closing.
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
          
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);

    WindowEvent wev2 = new WindowEvent(this, SplashScreen.ERROR);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev2);
    
    
    String ObjButtons[] = {"Yes","No"};
 
        int PromptResult = JOptionPane.showOptionDialog(null,
                "Are you sure you want to exit?", "Closing Session",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
        ObjButtons,ObjButtons[1]);
    if(PromptResult==0)
    {
      System.exit(0); 


    
    
    
    
    
    }//GEN-LAST:event_Splash_CancelActionPerformed
    }
        
    
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SplashScreen().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DTJ_Logo;
    private javax.swing.JLabel DevelopersTxt;
    private javax.swing.JLabel LoadingImg;
    private javax.swing.JPanel SplashPanel1;
    private javax.swing.JButton Splash_Cancel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel loadingNum;
    // End of variables declaration//GEN-END:variables

}
