/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.net.Socket;

/**
 *
 * @author Enrico Marchi
 */
public class ClientStatus {
    
    public void registration(String alias, String topic){
        // creazione del pacchetto PCP
        byte[] packet = new byte[2048];
        
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
        
        //creazione della connessione TCP con il server
        Socket client = new Socket(my_address,53101); // creazione ClientSocket su porta 13
        
        
    }
}
