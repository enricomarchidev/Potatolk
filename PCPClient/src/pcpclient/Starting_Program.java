/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

/**
 *
 * @author Gaole Elia
 * @version 1.0
 */
public class Starting_Program {
     public static void main(String args[]) {
         PCPLogin pcplog = new PCPLogin();
         pcplog.setVisible(true);
         int ctrl = 1;
         while (pcplog.isActive()){
            ctrl = pcplog.Control(pcplog); 
            if (ctrl == 1)
                pcplog.setVisible(false);
        }  
    }  
}
