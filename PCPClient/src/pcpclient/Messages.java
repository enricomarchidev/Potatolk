/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class Messages {
    
    public static void userToChatSend(String message){
        
        // creation of th PCP packet
        
        byte[] packet = new byte[2000];                         //PCP packet to send
        byte[] id = Connection.getId();                         //User id
        
         // packet index
        int index = 0;
        
        // opcode
        packet[index++] = 5;
        
        // id
        packet[index++] = id[0];
        packet[index++] = id[1];
        
        // message
        for (byte b: message.getBytes())
            packet[index++] = b;
        
        // byte separator
        packet[index++] = 0;
        
        DataOutputStream os = Connection.getOs();
        try {
            os.write(packet);
            System.out.println("Sent message to " + Group.getTopic() + " topic: " + message);
            Message msg = new Message("you", message);
            Group.addMessage(msg);
        } catch (IOException ex) {
            Logger.getLogger(ClientStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void userToChatReceive(byte[] pkt){
        String sourceAlias = new String();
        String text = new String();              
        byte[] newPkt = Arrays.copyOfRange(pkt, 1, pkt.length);     //pkt without opcode
        int index = 1;              //packet index
        for(byte b : newPkt){
            if(b != 0){
                sourceAlias += (char)b;
            }else{
                break;
            }
            index ++;
        }
        newPkt = Arrays.copyOfRange(pkt, index + 1, pkt.length);     //pkt without opcode and source alias
        for(byte b : newPkt){
            if(b != 0){
                text += (char)b;
            }else{
                break;
            }
            index ++;
        }
        
        System.out.println("Received message from " + sourceAlias + " in the " + Group.getTopic() + " topic: " + text);
        Message msg = new Message(sourceAlias, text);
        Group.addMessage(msg);
    }
}
