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
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class ClientStatus {
    
    public static boolean registration(String alias, String topic) {
        // creazione del pacchetto PCP
        byte[] packet = new byte[2048];                         //PCP packet to send
        byte[] pkt = new byte[2048];                            //PCP received packet
        byte[] ack = new byte[2048];                            //PCP registration ack
        byte opcode;
        byte[] assigned_id = new byte[2];
        byte[] alias_confirmation_bytes = new byte[32];         //max alias lenght is 32 characters 
        
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
            client.setSoTimeout(2000);
            DataInputStream is = new DataInputStream(client.getInputStream());
            DataOutputStream os = new DataOutputStream(client.getOutputStream());
            os.write(packet);
            is.read(pkt);
            opcode = pkt[0];
            if(opcode == 20){
                ack = pkt;
                assigned_id[0] = ack[1];
                assigned_id[1] = ack[2];
                alias_confirmation_bytes = Arrays.copyOfRange(ack, 3, alias.length() + 3);
                String alias_confirmation_string = new String(alias_confirmation_bytes);
                //alias_confirmation_string.replaceAll("\\P{Print}","");

                if (alias.equals(alias_confirmation_string)){
                    return true;
                }
            }
            
            //errors section
            //then use error class to manage pkt
            return false;
            
        } catch (IOException ex) {
            Logger.getLogger(ClientStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
}
