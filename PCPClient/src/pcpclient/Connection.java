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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class Connection {
    private static Socket client;
    private static DataInputStream is;
    private static DataOutputStream os;
    private static byte[] id = new byte[2];     //private id
    private static String alias = new String();
    private static List<byte[]> packetsReceived;

    public static void createConnection() {
        try {
            client = new Socket("127.0.0.1",53101);
            //client.setSoTimeout(2000);
            is = new DataInputStream(client.getInputStream());
            os = new DataOutputStream(client.getOutputStream());
            packetsReceived = new ArrayList<>();
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

    public static Socket getSocket() {
        return client;
    }

    public static DataInputStream getIs() {
        return is;
    }

    public static DataOutputStream getOs() {
        return os;
    }

    public static byte[] getId() {
        return id;
    }

    public static String getAlias() {
        return alias;
    }

    public static void setId(byte[] id) {
        Connection.id = id;
    }

    public static void setAlias(String alias) {
        Connection.alias = alias;
    }

    public static List<byte[]> getPacketsReceived() {
        return packetsReceived;
    }
    
    public static void addPacket(byte[] packet){
        packetsReceived.add(packet);
    }
    
    public static void removePacket(byte[] packet){
        packetsReceived.remove(packet);
    }
    
}
