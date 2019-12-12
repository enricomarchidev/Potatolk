/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico Marchi
 */
public class packetInterpreter extends Thread{

    //this thread interprets all packets of the list packetsReceived
    @Override
    public void run() {
        this.setName("packetInterpreter");
        while(true){
            while(Connection.getPacketsReceived().isEmpty()){
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(packetInterpreter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            byte[] packetReceived = Connection.getPacketsReceived().get(0);
            switch (packetReceived[0]) {        //opcode byte
                //opcodes
                case 51:
                    //opcode 51
                    ControlMessages.groupUsersListParse(packetReceived);
                    break;
                case 5:
                    //opcode 05
                    Messages.userToChatReceive(packetReceived);
                    break;
            }
            Connection.removePacket(packetReceived);        //packet processed
        }
    }   
}
