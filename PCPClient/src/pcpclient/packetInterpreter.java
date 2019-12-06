/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

/**
 *
 * @author Enrico Marchi
 */
public class packetInterpreter implements Runnable{

    @Override
    public void run() {
        while(true){
            while(Connection.getPacketsReceived().isEmpty()){
                //interpret packets
            }
        }
    }
    
}
