
package pcpclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class ClientStatus {
    
    public static boolean registration(String alias, String topic) {
        
        // creation of th PCP packet
        
        byte[] packet = new byte[2048];                         //PCP packet to send
        
        byte[] pkt = new byte[2048];                            //PCP received packet
        
        byte[] ack = new byte[2048];                            //PCP registration ack
        
        byte opcode;
        
        byte[] assigned_id = new byte[2];
        
        byte[] alias_confirmation_bytes = new byte[32];         //max alias lenght is 32 characters 
        
        
        // packet index
        
        int index = 0;
        
        
        // opcode
        
        packet[index++] = 10;
   
        
        // version
        
        packet[index++] = 0;
        
        
        // alias
        
        for (byte b: alias.getBytes())
            
            packet[index++] = b;
        
        
        // byte separator
        
        packet[index++] = 0;
        
        
        //topic
        
        for (byte b: topic.getBytes())
            
            packet[index++] = b;
        
        // byte separator
        
        packet[index++] = 0;
        
        try {
            //creation of a TCP connection with the server
            
            Socket client = new Socket("127.0.0.1",53101); // creation of the ClientSocket on the port 53101 "172.16.7.141"
            
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
