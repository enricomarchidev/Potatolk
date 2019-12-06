/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class ControlMessages {
    public static void groupUsersListRequest(){
        // creazione del pacchetto PCP
        byte[] packet = new byte[2048];                         //PCP packet to send
        byte[] pkt = new byte[2048];
        byte[] assigned_id = Connection.getId();
        
        // packet index
        int index = 0;
        
        // opcode
        packet[index++] = 50;
        
        // assigned id
        packet[index++] = assigned_id[0];
        packet[index++] = assigned_id[1];
        
        DataOutputStream os = Connection.getOs();
        DataInputStream is = Connection.getIs();
        try {
            os.write(packet);
            //is.read(pkt);
            //while(pkt[0] != 51){        //pkt[0] is the opcode    
                //is.read(pkt);
            //}               
        } catch (IOException ex) {
            Logger.getLogger(ClientStatus.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
}
