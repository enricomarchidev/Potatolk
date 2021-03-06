
package pcpclient;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * @author Gaole Elia
 * @version 1.0
 */
public class PCPLogin extends javax.swing.JFrame {
    
    static PCPClient pcpc;
    

    /**
     * Creates new form PCPLogin
     */
    
    public PCPLogin(PCPClient pcp) {
        
        initComponents();
        
        /**
        * Setting the immage and the text 'for the uninseretion of the
        * alias' invisible
        */
        pcpc = pcp;
        ErrUserImg.setVisible(false);
        ErrUser.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TopicTxt = new javax.swing.JTextField();
        AliasTxt = new javax.swing.JTextField();
        SignInBut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CancelBut = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        DashBut = new javax.swing.JLabel();
        XBut = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ErrUserImg = new javax.swing.JLabel();
        ErrUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(47, 49, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopicTxt.setBackground(new java.awt.Color(64, 68, 75));
        TopicTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TopicTxt.setForeground(new java.awt.Color(153, 153, 153));
        TopicTxt.setToolTipText("");
        TopicTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        TopicTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TopicTxtKeyPressed(evt);
            }
        });
        jPanel1.add(TopicTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 119, 86, 36));

        AliasTxt.setBackground(new java.awt.Color(64, 68, 75));
        AliasTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AliasTxt.setForeground(new java.awt.Color(153, 153, 153));
        AliasTxt.setToolTipText("");
        AliasTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        AliasTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AliasTxtKeyPressed(evt);
            }
        });
        jPanel1.add(AliasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, 287, 36));

        SignInBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Log_but.png"))); // NOI18N
        SignInBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignInButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignInButMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignInButMousePressed(evt);
            }
        });
        jPanel1.add(SignInBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, 58));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 118, 125));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 118, 125));
        jLabel3.setText("Topic");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 100, -1, -1));

        CancelBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Cancel_but.png"))); // NOI18N
        CancelBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CancelButMousePressed(evt);
            }
        });
        jPanel1.add(CancelBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 58));

        header.setBackground(new java.awt.Color(32, 34, 37));
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

        DashBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/hide_but.png"))); // NOI18N
        DashBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashButMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DashButMousePressed(evt);
            }
        });
        header.add(DashBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/exit_but.png"))); // NOI18N
        XBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XButMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XButMousePressed(evt);
            }
        });
        header.add(XBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/Login.PNG"))); // NOI18N
        header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(47, 49, 54));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 20, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/angle.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 10, 50));

        ErrUserImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrUserImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OthersComponent/alert.png"))); // NOI18N
        jPanel1.add(ErrUserImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 20, 30));

        ErrUser.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ErrUser.setForeground(new java.awt.Color(255, 0, 0));
        ErrUser.setText("Please enter the Username");
        jPanel1.add(ErrUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignInButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButMouseEntered
        //Event that make the x button darker
        
        SignInBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Dark_Log_but.png")));
        
    }//GEN-LAST:event_SignInButMouseEntered

    private void SignInButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButMouseExited
        //Event that make the b2 button lighter
        
        SignInBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Log_but.png")));
        
    }//GEN-LAST:event_SignInButMouseExited

    private void SignInButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButMousePressed
        //The following event happen when the Sign in button is pressed
   
        
        //The boolean variable called registrated is set to false
        
        boolean registrated = false;
        
        
        
        
        /**
         * The following 'if' control if there is a 
         * correct alias in the AliasTxt
         */
        
        if(AliasTxt.getText().equals("")){
            
            JOptionPane.showMessageDialog(rootPane, "You need to insert a Username");
            
            ErrUserImg.setVisible(true);
            ErrUser.setVisible(true);
            
        }else if(AliasTxt.getText().length() < 6){
            
            JOptionPane.showMessageDialog(rootPane, "Username minimum lenght must be 6 characters");
        
        }else if(AliasTxt.getText().length() > 32){
        
            JOptionPane.showMessageDialog(rootPane, "Username maximum lenght must be 32 characters");
        
        }else{
        
            String alias = AliasTxt.getText();
            String topic = TopicTxt.getText();
        
            if(!registrated){
                
                if(ClientStatus.registration(alias, topic)){
                    
                    registrated = true;
                }
            }
        
            if(registrated){
                
                pcpc.getAlias().setText(Connection.getAlias());
                pcpc.getChat().setText(Group.getTopic());
                pcpc.setVisible(true);
                this.setVisible(false);
            }
    
        }
        
    }//GEN-LAST:event_SignInButMousePressed

    private void CancelButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButMouseEntered
        //Event that make the b2 button darker
        
        CancelBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Dark_Cancel_but.png")));
        
    }//GEN-LAST:event_CancelButMouseEntered

    private void CancelButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButMouseExited
        //Event that make the b2 button lighter
        
        CancelBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Cancel_but.png")));
        
    }//GEN-LAST:event_CancelButMouseExited

    private void CancelButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButMousePressed
        //Method that allow the b2 button to close the PCPLogin window
        
        System.exit(0);
        
    }//GEN-LAST:event_CancelButMousePressed

    private void XButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseEntered
        //Event that make the x button darker
        
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dark_exit_but.png")));
        
    }//GEN-LAST:event_XButMouseEntered

    private void XButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMouseExited
        //Event that make the x button lighter
        
        XBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/exit_but.png")));
        
    }//GEN-LAST:event_XButMouseExited

    private void XButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButMousePressed
        //Method that allow the x button to close the PCPLogin window
        
        System.exit(0);
        
    }//GEN-LAST:event_XButMousePressed

    private void DashButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashButMouseEntered
        //Event that make the das button darker
        
        DashBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dark_hide_but.png")));
        
    }//GEN-LAST:event_DashButMouseEntered

    private void DashButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashButMouseExited
        //Event that make the dash button lighter
        
        DashBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/hide_but.png")));
        
    }//GEN-LAST:event_DashButMouseExited

    private void DashButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashButMousePressed
        //Method that allow the dash button to iconify the PCPLogin window
        
        setState(javax.swing.JFrame.ICONIFIED);
        
    }//GEN-LAST:event_DashButMousePressed
    
    int x,y;
    
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        /**
        * Method that allows us to take X and Y of the PCPLogin window
        */
        
        x = evt.getX();
        y = evt.getY();
        
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        /**
        * Method that allows us to move the PCPLogin window
        */
        
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        
        this.setLocation(xx - x, yy - y);
        
    }//GEN-LAST:event_headerMouseDragged

    private void AliasTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AliasTxtKeyPressed
        /**
        * The following event it's equal to the SignInButMousePressed
        * but happen when we're going to press the enter key
        */

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            //The boolean variable called registrated is set to false
            boolean registrated = false;

            /**
            * The following 'if' control if there is a
            * correct alias in the AliasTxt
            */
            if(AliasTxt.getText().equals("")){

                JOptionPane.showMessageDialog(rootPane, "You need to insert a Username");

                ErrUserImg.setVisible(true);
                ErrUser.setVisible(true);

            }else if(AliasTxt.getText().length() < 6){

                JOptionPane.showMessageDialog(rootPane, "Username minimum lenght must be 6 characters");

            }else if(AliasTxt.getText().length() > 32){

                JOptionPane.showMessageDialog(rootPane, "Username maximum lenght must be 32 characters");

            }else{

                String alias = AliasTxt.getText();
                String topic = TopicTxt.getText();

                if(!registrated){

                    if(ClientStatus.registration(alias, topic)){

                        registrated = true;
                    }
                }

                if(registrated){
                    
                    pcpc.getAlias().setText(Connection.getAlias());
                    pcpc.getChat().setText(Group.getTopic());
                    pcpc.setVisible(true);
                    this.setVisible(false);
                    
                }

            }

        }

    }//GEN-LAST:event_AliasTxtKeyPressed

    private void TopicTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TopicTxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            //The boolean variable called registrated is set to false
            boolean registrated = false;

            /**
            * The following 'if' control if there is a
            * correct alias in the AliasTxt
            */
            if(AliasTxt.getText().equals("")){

                JOptionPane.showMessageDialog(rootPane, "You need to insert a Username");

                ErrUserImg.setVisible(true);
                ErrUser.setVisible(true);

            }else if(AliasTxt.getText().length() < 6){

                JOptionPane.showMessageDialog(rootPane, "Username minimum lenght must be 6 characters");

            }else if(AliasTxt.getText().length() > 32){

                JOptionPane.showMessageDialog(rootPane, "Username maximum lenght must be 32 characters");

            }else{

                String alias = AliasTxt.getText();
                String topic = TopicTxt.getText();

                if(!registrated){

                    if(ClientStatus.registration(alias, topic)){

                        registrated = true;
                    }
                }

                if(registrated){
                    
                    pcpc.getAlias().setText(Connection.getAlias());
                    pcpc.getChat().setText(Group.getTopic());
                    pcpc.setVisible(true);
                    this.setVisible(false);
                    
                }

            }

        }
        
    }//GEN-LAST:event_TopicTxtKeyPressed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        PCPLogin pcplog = new PCPLogin(pcpc);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PCPLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCPLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCPLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCPLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pcplog.setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AliasTxt;
    private javax.swing.JLabel CancelBut;
    private javax.swing.JLabel DashBut;
    private javax.swing.JLabel ErrUser;
    private javax.swing.JLabel ErrUserImg;
    private javax.swing.JLabel SignInBut;
    private javax.swing.JTextField TopicTxt;
    private javax.swing.JLabel XBut;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

     
}
