
package pcpclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Set;
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
        if(topic.equals("")){
            topic = "general";
        }

        for (byte b: topic.getBytes())
            
            packet[index++] = b;
        
        // byte separator
        
        packet[index++] = 0;
        
        try {

            //creating a TCP connection with the server
            Connection.createConnection();
            Connection.setAlias(alias);
            //Socket client = Connection.getSocket();
            DataInputStream is = Connection.getIs();
            DataOutputStream os = Connection.getOs();

            os.write(packet);
            
            is.read(pkt);
            
            opcode = pkt[0];
            
            if(opcode == 20){
                
                ack = pkt;
                
                assigned_id[0] = ack[1];
                assigned_id[1] = ack[2];
              
                Connection.setId(assigned_id);          //saved assigned_id into connection class

                alias_confirmation_bytes = Arrays.copyOfRange(ack, 3, alias.length() + 3);
                
                String alias_confirmation_string = new String(alias_confirmation_bytes);
                
                //alias_confirmation_string.replaceAll("\\P{Print}","");
                
                if (alias.equals(alias_confirmation_string)){
                    Group.createGroup();        //creating group
                    Group.setTopic(topic);
                    packetReceiver receiverThread = new packetReceiver();
                    packetInterpreter interpreterThread = new packetInterpreter();
                    receiverThread.start();
                    interpreterThread.start();
                    System.out.println("Successfully registrated with alias " + alias);
                    return true;    //registration successful
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
    
    public static void disconnection(){
        byte[] packet = new byte[3];                         //PCP packet to send
        byte[] privateId = Connection.getId();
        
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        //System.out.println(t.getName());
        for(Thread t : threadSet){
            if(t.getName().equals("packetReceiver")){
                t.interrupt();
            }
        }
        
        // packet index
        int index = 0;
        
        // opcode
        packet[index++] = 11;
        
        // id
        packet[index++] = privateId[0];
        packet[index++] = privateId[1];
        
        Socket clientSocket = Connection.getSocket();
        DataOutputStream os = Connection.getOs();
        DataInputStream is = Connection.getIs();
        try {
            os.write(packet);
            //threads stop
            is.close();
            os.close();
            clientSocket.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ClientStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void changeOfAlias(String alias){
        byte[] packet = new byte[2048];                         //PCP packet to send
        byte[] privateId = Connection.getId();
        String oldAlias = Connection.getAlias();
        String newAlias = alias;
        
        // packet index
        int index = 0;
        
        // opcode
        packet[index++] = 18;
        
        // id
        packet[index++] = privateId[0];
        packet[index++] = privateId[1];

        // new alias
        for (byte b: oldAlias.getBytes())
            packet[index++] = b;
        
        // byte separatore
        packet[index++] = 0;
        
        // new alias
        for (byte b: newAlias.getBytes())
            packet[index++] = b;
        
        // byte separatore
        packet[index++] = 0;
        
        DataOutputStream os = Connection.getOs();
        try {
            os.write(packet);
        } catch (IOException ex) {
            Logger.getLogger(ClientStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
