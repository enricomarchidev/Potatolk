/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class packetReceiver extends Thread{
    byte[] pkt = new byte[2048];                            //PCP received packet
    DataInputStream is = Connection.getIs();
    
    //this thread receives all packets and put them into the list packetsReceived
    @Override
    public void run() {
        this.setName("packetReceiver");
        //while not disconnected
        while(!Thread.interrupted()){
            try {
                is.read(pkt);
                Connection.addPacket(pkt);
                pkt = new byte[2048];
            } catch (IOException ex) {
                Logger.getLogger(packetReceiver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
}
