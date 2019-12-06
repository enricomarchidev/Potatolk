/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class packetReceiver implements Runnable{
    byte[] pkt = new byte[2048];                            //PCP received packet
    DataInputStream is = Connection.getIs();
    
    @Override
    public void run() {
        //while not disconnected
        while(true){
            try {
                is.read(pkt);
                Connection.addPacket(pkt);
            } catch (IOException ex) {
                Logger.getLogger(packetReceiver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
}
