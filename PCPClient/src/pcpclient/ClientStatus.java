/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class ClientStatus {
    
    public static boolean registration(String alias, String topic){
        // creazione del pacchetto PCP
        byte[] packet = new byte[2048];
        byte[] ack = new byte[2048];
        
        // indice pacchetto
        int index = 0;
        
        // opcode
        packet[index++] = 10;
   
        // version
        packet[index++] = 0;
        
        // alias
        for (byte b: alias.getBytes())
            packet[index++] = b;
        
        // byte separatore
        packet[index++] = 0;
        
        //topic
        for (byte b: topic.getBytes())
            packet[index++] = b;
        
        // byte separatore
        packet[index++] = 0;
        
        try {
            //creazione della connessione TCP con il server
            Socket client = new Socket(InetAddress.getLoopbackAddress(),53101); // creazione ClientSocket su porta 53101
            DataInputStream is = new DataInputStream(client.getInputStream());
            DataOutputStream os = new DataOutputStream(client.getOutputStream());
            os.write(packet);
            is.read(ack);
            byte opcode = ack[0];
            byte assigned_id = (byte) (ack[1] + ack[2]);
            String alias_confirmation = new String();
            for (byte b : ack)
                if (b != 0)
                    alias_confirmation += b;
            
            if (alias.equals(alias_confirmation)){
                return true;
            }
            
            return false;
            
        } catch (IOException ex) {
            Logger.getLogger(ClientStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
}
