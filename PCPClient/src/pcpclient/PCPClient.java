/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pcpclient;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.JPanel;



/**
 *
 * @author Gaole Elia
 * @version 1.0
 */
public class PCPClient extends javax.swing.JFrame {
    PCPLogout PCPOut = new PCPLogout();
        
    /** Creates new form PCPClient */
    public PCPClient() {
        initComponents();
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height /2 - this.getSize().height / 2);
        
//        anim.jLabelXLeft(UserListPane.getX(), +1000, 3, 1, UserListPane);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        LogOutBut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        WText = new javax.swing.JTextField();
        DeleteBut = new javax.swing.JLabel();
        SendBut = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        XBut = new javax.swing.JLabel();
        DashBut = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        XButUserList = new javax.swing.JLabel();
        UserListPane = new javax.swing.JLabel();
        UserPane = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 38, 153));
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 1000));

        jPanel4.setBackground(new java.awt.Color(54, 57, 63));
        jPanel4.setForeground(new java.awt.Color(32, 34, 37));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(32, 34, 37));
        MenuPanel.setForeground(new java.awt.Color(32, 34, 37));

        jSeparator2.setBackground(new java.awt.Color(45, 47, 50));
        jSeparator2.setForeground(new java.awt.Color(45, 47, 50));

        LogOutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/LogOut_but.png"))); // NOI18N
        LogOutBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutButMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOutBut)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutBut)
                .addContainerGap())
        );

        jPanel4.add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 520));

        jPanel2.setBackground(new java.awt.Color(47, 49, 54));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        WText.setBackground(new java.awt.Color(64, 68, 75));
        WText.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        WText.setForeground(new java.awt.Color(153, 153, 153));
        WText.setToolTipText("");
        WText.setBorder(null);
        WText.setDisabledTextColor(new java.awt.Color(163, 163, 163));
        WText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                WTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                WTextFocusLost(evt);
            }
        });
        WText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WTextActionPerformed(evt);
            }
        });

        DeleteBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Canc_but.png"))); // NOI18N
        DeleteBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButMouseExited(evt);
            }
        });

        SendBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Send_but.png"))); // NOI18N
        SendBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SendButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SendButMouseExited(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(45, 47, 50));
        jSeparator3.setForeground(new java.awt.Color(45, 47, 50));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 118, 125));
        jLabel1.setText("Insert Text");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WText, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SendBut)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(WText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SendBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addContainerGap())
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 459, 590, -1));

        jPanel6.setBackground(new java.awt.Color(32, 34, 37));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel6.add(XBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        DashBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/hide_but.png"))); // NOI18N
        DashBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashButMouseExited(evt);
            }
        });
        jPanel6.add(DashBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/POTATOLKS.PNG"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        XButUserList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/close_userlist_pane.png"))); // NOI18N
        XButUserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XButUserListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XButUserListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XButUserListMouseExited(evt);
            }
        });
        jPanel4.add(XButUserList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        UserListPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/user_pane.png"))); // NOI18N
        jPanel4.add(UserListPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 20, 260, -1));

        UserPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/user_pan.png"))); // NOI18N
        UserPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserPaneMouseExited(evt);
            }
        });
        jPanel4.add(UserPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 60));

        jLabel6.setBackground(new java.awt.Color(54, 57, 63));
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, 30, 21));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/angle.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 21, 10, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void XButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseExited
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/exit_but.png")));
    }//GEN-LAST:event_XButMouseExited

    private void XButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseEntered
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dark_exit_but.png")));
    }//GEN-LAST:event_XButMouseEntered

    private void XButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseClicked
        PCPOut.setVisible(true);
    }//GEN-LAST:event_XButMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
    }//GEN-LAST:event_jPanel2MouseDragged

    private void SendButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendButMouseExited
        SendBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Send_but.png")));
    }//GEN-LAST:event_SendButMouseExited

    private void SendButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendButMouseEntered
        SendBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Dark_Send_but.png")));
    }//GEN-LAST:event_SendButMouseEntered

    private void DeleteButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButMouseExited
        DeleteBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Canc_but.png")));
    }//GEN-LAST:event_DeleteButMouseExited

    private void DeleteButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButMouseEntered
        DeleteBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/On_Canc_but.png")));
    }//GEN-LAST:event_DeleteButMouseEntered

    private void WTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WTextActionPerformed

    }//GEN-LAST:event_WTextActionPerformed

    private void WTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WTextFocusLost

    }//GEN-LAST:event_WTextFocusLost

    private void WTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WTextFocusGained

    }//GEN-LAST:event_WTextFocusGained

    private void LogOutButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButMouseExited
        LogOutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/logOut_but.png")));
    }//GEN-LAST:event_LogOutButMouseExited

    private void LogOutButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButMouseEntered
        LogOutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Dark_logOut_but.png")));
    }//GEN-LAST:event_LogOutButMouseEntered

    private void LogOutButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButMouseClicked
        PCPOut.setVisible(true);
    }//GEN-LAST:event_LogOutButMouseClicked

    private void DashButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashButMouseExited
        DashBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/hide_but.png")));
    }//GEN-LAST:event_DashButMouseExited

    private void DashButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashButMouseEntered
        DashBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dark_hide_but.png")));
    }//GEN-LAST:event_DashButMouseEntered

    private void DashButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashButMouseClicked
        setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_DashButMouseClicked

    private void UserPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPaneMouseEntered
        UserPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/surrounded_user_pan.png")));
    }//GEN-LAST:event_UserPaneMouseEntered

    private void UserPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPaneMouseExited
        UserPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/user_pan.png")));
    }//GEN-LAST:event_UserPaneMouseExited

    private void UserPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPaneMouseClicked
        //if(UserPane.getX() instanceof = 60){
            AnimationClass anim = new AnimationClass();
            anim.jLabelXRight(XButUserList.getX(), 280, 3, 3, XButUserList);
            anim.jLabelXRight(UserListPane.getX(), 50, 3, 3, UserListPane);
            anim.jLabelXRight(UserPane.getX(), 300, 3, 3, UserPane);
        //}
    }//GEN-LAST:event_UserPaneMouseClicked

    private void XButUserListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButUserListMouseEntered
        XButUserList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dark_close_userlist_pane.png")));
    }//GEN-LAST:event_XButUserListMouseEntered

    private void XButUserListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButUserListMouseExited
        XButUserList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/close_userlist_pane.png")));
    }//GEN-LAST:event_XButUserListMouseExited

    private void XButUserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButUserListMouseClicked
        AnimationClass anim = new AnimationClass();
            anim.jLabelXLeft(XButUserList.getX(), 40, 3, 3, XButUserList);
            anim.jLabelXLeft(UserListPane.getX(), -190, 3, 3, UserListPane);
            anim.jLabelXLeft(UserPane.getX(), 60, 3, 3, UserPane);
    }//GEN-LAST:event_XButUserListMouseClicked

    int x,y;
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
            java.util.logging.Logger.getLogger(PCPClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCPClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCPClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCPClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PCPLogin pcplog = new PCPLogin();
                pcplog.setVisible(true);
                
                //new PCPClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DashBut;
    private javax.swing.JLabel DeleteBut;
    private javax.swing.JLabel LogOutBut;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel SendBut;
    private javax.swing.JLabel UserListPane;
    private javax.swing.JLabel UserPane;
    private javax.swing.JTextField WText;
    private javax.swing.JLabel XBut;
    private javax.swing.JLabel XButUserList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    boolean isRunning() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
