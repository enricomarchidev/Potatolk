
package pcpclient;

/**
 *
 * @author Gaole Elia
 * version 1.0
 */

public class PCPLogout extends javax.swing.JFrame {

    /**
     * Creates new form PCPLogout
     */
    
    public PCPLogout() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        w1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        YesBut = new javax.swing.JLabel();
        NoBut = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        XBut = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/angle.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(47, 49, 54));
        jLabel6.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        w1.setBackground(new java.awt.Color(47, 49, 54));
        w1.setForeground(new java.awt.Color(102, 102, 102));
        w1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Would you like to log out?");
        w1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 42, 202, -1));

        YesBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Yes_but.png"))); // NOI18N
        YesBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YesButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YesButMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YesButMousePressed(evt);
            }
        });
        w1.add(YesBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 89, -1, -1));

        NoBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/No_but.png"))); // NOI18N
        NoBut.setToolTipText("");
        NoBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoButMouseExited(evt);
            }
        });
        w1.add(NoBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 89, -1, -1));

        header.setBackground(new java.awt.Color(32, 34, 37));
        header.setPreferredSize(new java.awt.Dimension(128, 24));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/exit_but.png"))); // NOI18N
        XBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XButMouseExited(evt);
            }
        });
        header.add(XBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/logout.PNG"))); // NOI18N
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        w1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 254, -1));

        jLabel8.setBackground(new java.awt.Color(47, 49, 54));
        jLabel8.setOpaque(true);
        w1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/angle.png"))); // NOI18N
        w1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void YesButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YesButMouseEntered
        /**When the cursor is on the 'Yes button'
         * The 'yes button 'change color
         */
        
        YesBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Dark_Yes_but.png"))); 
        
    }//GEN-LAST:event_YesButMouseEntered

    private void YesButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YesButMouseExited
        /**
         * When the cursor isn't on the 'yes button' it come to
         * its original color
         */
        
        YesBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Yes_but.png")));
        
    }//GEN-LAST:event_YesButMouseExited

    private void NoButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoButMouseEntered
        /**When the cursor is on the 'no button'
         * The 'no button' change color
         */
        
        NoBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Dark_no_but.png"))); 
        
    }//GEN-LAST:event_NoButMouseEntered

    private void NoButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoButMouseExited
        /**
         * When the cursor isn't on the 'no button' it come to
         * its original color
         */
        
        NoBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/No_but.png"))); 
        
    }//GEN-LAST:event_NoButMouseExited

    private void XButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseEntered
        /**When the cursor is on the 'x button'
         * The 'x button' change color
         */
        
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dark_exit_but.png")));
        
    }//GEN-LAST:event_XButMouseEntered

    private void XButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseExited
        /**
         * When the cursor isn't on the 'x button' it come to
         * its original color
         */
        
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/exit_but.png")));
        
    }//GEN-LAST:event_XButMouseExited

    private void XButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseClicked
        //This event close the PCPLogout window
        
        this.setVisible(false);
        
    }//GEN-LAST:event_XButMouseClicked
    
    int x,y;
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        /**
        * Method that allows us to take X and Y of the PCPLogoutwindow
        */
        
        x = evt.getX();
        y = evt.getY();
        
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        /**
        * Method that allows us to move the PCPLogout window
        */
        
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        
        this.setLocation(xx - x, yy - y);
        
    }//GEN-LAST:event_headerMouseDragged

    private void YesButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YesButMousePressed
        //This event close all
        ClientStatus.disconnection();
        System.exit(0);
        
    }//GEN-LAST:event_YesButMousePressed

    private void NoButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoButMouseClicked
        // When the button is clicked the PCPLogout window became invisible
        
        this.setVisible(false);
        
    }//GEN-LAST:event_NoButMouseClicked

   
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
            java.util.logging.Logger.getLogger(PCPLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCPLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCPLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCPLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCPLogout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoBut;
    private javax.swing.JLabel XBut;
    private javax.swing.JLabel YesBut;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel w1;
    // End of variables declaration//GEN-END:variables
}
