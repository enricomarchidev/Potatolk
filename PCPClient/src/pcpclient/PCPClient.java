/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pcpclient;

import AppPackage.AnimationClass;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;



/**
 *
 * @author Gaole Elia
 * @version 1.0
 */
public class PCPClient extends javax.swing.JFrame{
    
    PCPLogout PCPOut;
    ArrayList<String> ls;
    DefaultListModel model; 
    
    /** Creates new form PCPClient */
    
    public PCPClient() {
        
        initComponents();
        
        PCPOut = new PCPLogout();
        ls = new ArrayList<String>();
        model = new DefaultListModel<String>();
        jPanelList.setVisible(false);
        DefaultCaret caret = (DefaultCaret)jTextAreaChat.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    public JTextField getAlias() {
        return Alias;
    }

    public JTextField getChat() {
        return Chat;
    }

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
        UpperBar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        XBut = new javax.swing.JLabel();
        DashBut = new javax.swing.JLabel();
        jPanelList = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UserList = new javax.swing.JList<>();
        UserListPane = new javax.swing.JLabel();
        UserPane = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chatRoom = new javax.swing.JTextField();
        Chat = new javax.swing.JTextField();
        loggedIn = new javax.swing.JTextField();
        Alias = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();

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
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
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

        WText.setBackground(new java.awt.Color(64, 68, 75));
        WText.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        WText.setForeground(new java.awt.Color(153, 153, 153));
        WText.setToolTipText("");
        WText.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        WText.setDisabledTextColor(new java.awt.Color(163, 163, 163));
        WText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WTextKeyPressed(evt);
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeleteButMousePressed(evt);
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SendButMousePressed(evt);
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

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 590, 80));

        UpperBar.setBackground(new java.awt.Color(32, 34, 37));
        UpperBar.setPreferredSize(new java.awt.Dimension(100, 24));
        UpperBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                UpperBarMouseDragged(evt);
            }
        });
        UpperBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UpperBarMousePressed(evt);
            }
        });
        UpperBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/POTATOLKS.PNG"))); // NOI18N
        UpperBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 20));

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
        UpperBar.add(XBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

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
        UpperBar.add(DashBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        jPanel4.add(UpperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        jPanelList.setBackground(new java.awt.Color(22, 24, 27));

        jScrollPane3.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(240, 130));

        UserList.setBackground(new java.awt.Color(22, 24, 27));
        UserList.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        UserList.setForeground(new java.awt.Color(230, 230, 230));
        UserList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserList.setPreferredSize(new java.awt.Dimension(240, 40));
        UserList.setSelectionBackground(new java.awt.Color(82, 82, 82));
        jScrollPane3.setViewportView(UserList);

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        jPanel4.add(jPanelList, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 239, 520));

        UserListPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/user_pane.png"))); // NOI18N
        UserListPane.setAutoscrolls(true);
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
        jPanel4.add(UserPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 390, -1, 60));

        jLabel6.setBackground(new java.awt.Color(54, 57, 63));
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 30, 430));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/angle.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 21, 10, 30));

        chatRoom.setEditable(false);
        chatRoom.setBackground(new java.awt.Color(54, 57, 63));
        chatRoom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chatRoom.setForeground(new java.awt.Color(255, 255, 255));
        chatRoom.setText("Chat room:");
        chatRoom.setBorder(null);
        jPanel4.add(chatRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        Chat.setEditable(false);
        Chat.setBackground(new java.awt.Color(54, 57, 63));
        Chat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chat.setForeground(new java.awt.Color(0, 255, 204));
        Chat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(Chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 100, -1));

        loggedIn.setEditable(false);
        loggedIn.setBackground(new java.awt.Color(54, 57, 63));
        loggedIn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loggedIn.setForeground(new java.awt.Color(255, 255, 255));
        loggedIn.setText("You are logged in as");
        loggedIn.setToolTipText("");
        loggedIn.setBorder(null);
        loggedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggedInActionPerformed(evt);
            }
        });
        jPanel4.add(loggedIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, -1));

        Alias.setEditable(false);
        Alias.setBackground(new java.awt.Color(54, 57, 63));
        Alias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Alias.setForeground(new java.awt.Color(0, 255, 204));
        Alias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AliasActionPerformed(evt);
            }
        });
        jPanel4.add(Alias, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 220, -1));

        jTextAreaChat.setEditable(false);
        jTextAreaChat.setBackground(new java.awt.Color(54, 57, 63));
        jTextAreaChat.setColumns(20);
        jTextAreaChat.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextAreaChat.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaChat.setRows(5);
        jTextAreaChat.setBorder(null);
        jTextAreaChat.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextAreaChat.setSelectionColor(new java.awt.Color(54, 57, 63));
        jScrollPane4.setViewportView(jTextAreaChat);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 580, 400));

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

    private void UpperBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperBarMousePressed
        /**
        * Method that allows us to take X and Y of the PCPClient window
        */
        
        x = evt.getX();
        y = evt.getY();
        
    }//GEN-LAST:event_UpperBarMousePressed

    private void UpperBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperBarMouseDragged
       /**
        * Method that allows us to move the PCPClient window
        */
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        
        this.setLocation(xx - x, yy - y);
        
    }//GEN-LAST:event_UpperBarMouseDragged

    private void XButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseExited
        
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/exit_but.png")));
        
    }//GEN-LAST:event_XButMouseExited

    private void XButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseEntered
        
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dark_exit_but.png")));
        
    }//GEN-LAST:event_XButMouseEntered

    private void XButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseClicked
        
        PCPOut.setVisible(true);
        
    }//GEN-LAST:event_XButMouseClicked

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

    private void LogOutButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButMouseExited
        
        LogOutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/logOut_but.png")));
        
    }//GEN-LAST:event_LogOutButMouseExited

    private void LogOutButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButMouseEntered
       
        LogOutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Dark_logOut_but.png")));
        
    }//GEN-LAST:event_LogOutButMouseEntered

    private void LogOutButMouseClicked(java.awt.event.MouseEvent evt) {                                       
       
    //private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        //setState(javax.swing.JFrame.ICONIFIED);
        //PCPOut.setVisible(true);
        
    }                                      

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
        
        int y = UserPane.getY();
        
        if(y == 40){
            
            UserPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/close_user_panNew.png")));
            
        }else if(y == 390){
            
            UserPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/open_user_panNew.png")));
        }
        
    }//GEN-LAST:event_UserPaneMouseEntered

    private void UserPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPaneMouseExited
        
        UserPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/user_pan.png")));
        
    }//GEN-LAST:event_UserPaneMouseExited
    
    private void UserPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPaneMouseClicked

            AnimationClass anim = new AnimationClass();
            
            int y = UserPane.getY();
            
            int set;
            
            if(y == 390){
                
                anim.jLabelXRight(UserListPane.getX(), 50, 3, 3, UserListPane);
                anim.jLabelXRight(UserPane.getX(), 302, 3, 3, UserPane);
                
                anim.jLabelYUp(UserPane.getY(), 40, 3, 2, UserPane);
                
                set = 0;
                
                //ls.add("Ciccio");
                
                ListModification(Group.getAliasList(), set);   
                
            }else if(y == 40){
                
                anim.jLabelXLeft(UserListPane.getX(), -190, 3, 3, UserListPane);
                anim.jLabelXLeft(UserPane.getX(), 62, 3, 3, UserPane);
                
                anim.jLabelYDown(UserPane.getY(), 390, 3, 2, UserPane);
                
                set = 1;
                
                ListModification(ls, set);

            }
            
    }//GEN-LAST:event_UserPaneMouseClicked

    private void SendButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendButMousePressed
         AnimationClass anim = new AnimationClass();
            
            int y = UserPane.getY();
            
            int set;
            
            if(y == 40){
                
                anim.jLabelXLeft(UserListPane.getX(), -190, 3, 3, UserListPane);
                anim.jLabelXLeft(UserPane.getX(), 62, 3, 3, UserPane);
                
                anim.jLabelYDown(UserPane.getY(), 390, 3, 2, UserPane);
                
                set = 1;
                
                ListModification(ls, set);

            }
            
        String message = WText.getText();
        
        Messages.userToChatSend(message);
            
        WText.setText("");
        
    }//GEN-LAST:event_SendButMousePressed

    private void DeleteButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButMousePressed
        
        WText.setText("");
        
    }//GEN-LAST:event_DeleteButMousePressed

    private void WTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WTextKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            AnimationClass anim = new AnimationClass();
            
            int y = UserPane.getY();
            
            int set;
            
            if(y == 40){
                
                anim.jLabelXLeft(UserListPane.getX(), -190, 3, 3, UserListPane);
                anim.jLabelXLeft(UserPane.getX(), 62, 3, 3, UserPane);
                
                anim.jLabelYDown(UserPane.getY(), 390, 3, 2, UserPane);
                
                set = 1;
                
                ListModification(ls, set);

            }
                    
            String message = WText.getText();

            Messages.userToChatSend(message);

            WText.setText("");
        
        }
        
    }//GEN-LAST:event_WTextKeyPressed

    private void loggedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggedInActionPerformed

    private void AliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AliasActionPerformed

   public void ListModification(List<String> ls, int setter){
        
       if(setter == 0){ 
           
            for(int i = 0; i < ls.size(); i++){
                
                String str = ls.get(i);
                
                if(!model.contains(ls.get(i))){
                    
                    model.addElement(str);
                    
                }
                
                if(!ls.contains(ls.get(i))){
                    
                    model.removeElement(str);
                    
                }
                
            UserList.setModel(model);
            
            jPanelList.setVisible(true);
            
            }
            
        }else if(setter == 1){
            
            jPanelList.setVisible(false);
        }
                       
   }

    int x,y;
    
    public void showMessage(String chat){
        
            jTextAreaChat.setText(chat);  
     
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
        PCPClient pcp = new PCPClient();
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                PCPLogin pcplog = new PCPLogin(pcp);
                pcplog.setVisible(true);
                //new PCPClient().setVisible(true);
                
            }
            
        });
        
            
            Group.createGroup();        //creating group
            String chatMessages = new String();
            
            while(true){
                
                while(Group.getGroupMessages().isEmpty()){
                    
                    try {
                        
                        sleep(100);
                        
                    } catch (InterruptedException ex) {
                        
                        Logger.getLogger(PCPClient.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    
                }
                
                List<Message> currentMessages = Group.getGroupMessages();
                
                Message currentMessage = currentMessages.get(0);
                
                String message = currentMessage.toString();
                
                chatMessages += message;
                
                pcp.showMessage(chatMessages);
                
                Group.removeMessage(currentMessage);
                
                
                
            }
            
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alias;
    private javax.swing.JTextField Chat;
    private javax.swing.JLabel DashBut;
    private javax.swing.JLabel DeleteBut;
    private javax.swing.JLabel LogOutBut;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel SendBut;
    private javax.swing.JPanel UpperBar;
    private javax.swing.JList<String> UserList;
    private javax.swing.JLabel UserListPane;
    private javax.swing.JLabel UserPane;
    private javax.swing.JTextField WText;
    private javax.swing.JLabel XBut;
    private javax.swing.JTextField chatRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField loggedIn;
    // End of variables declaration//GEN-END:variables

}
