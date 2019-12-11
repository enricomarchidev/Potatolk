/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 *
 * @author Enrico Marchi
 */
public class ControlMessages {
    public static void groupUsersListRequest(){
        // creazione del pacchetto PCP
        byte[] packet = new byte[2048];                         //PCP packet to send
        byte[] pkt = new byte[2048];
        byte[] assigned_id = Connection.getId();
        
        // packet index
        int index = 0;
        
        // opcode
        packet[index++] = 50;
        
        // assigned id
        packet[index++] = assigned_id[0];
        packet[index++] = assigned_id[1];
        
        DataOutputStream os = Connection.getOs();
        DataInputStream is = Connection.getIs();
        try {
            os.write(packet);
            //is.read(pkt);
            //while(pkt[0] != 51){        //pkt[0] is the opcode    
                //is.read(pkt);
            //}               
        } catch (IOException ex) {
            Logger.getLogger(ClientStatus.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    public static void groupUsersListParse(byte[] pkt){
        byte type = pkt[1];     //type of group list
        byte listLenght = pkt[2];
        byte[] listByte = new byte[2045];
        String listJSON = new String();
        List<String> listJava = new ArrayList<>();
        //json parser library
        Gson gson = new Gson(); 
        Type aliasListType = new TypeToken<ArrayList<String>>(){}.getType();
        switch (type) {        
                //opcodes
                case 0:         //complete users list
                    listByte = Arrays.copyOfRange(pkt, 3, listByte.length + 3);
                    for(byte b : listByte){
                        if(b != 0){
                            listJSON += (char)b;
                        }else{
                            break;
                        }
                    }
                    
                    //json array to java list
                    listJava = gson.fromJson(listJSON, aliasListType);                  
                    
                    Group.setAliasList(listJava);
                    Group.setAliasListUpdated(true);
                    System.out.println("Complete users list received: " + listJSON);
                    break;
                case 1:
                    listByte = Arrays.copyOfRange(pkt, 3, listByte.length + 3);
                    for(byte b : listByte){
                        if(b != 0){
                            listJSON += (char)b;
                        }else{
                            break;
                        }
                    }
                    
                    //json array to java list
                    listJava = gson.fromJson(listJSON, aliasListType);  
                    
                    Group.addAlias(listJava.get(0));
                    Group.setAliasListUpdated(true);
                    System.out.println("Joined user list received: " + listJSON);
                    break;
                case 2:
                    listByte = Arrays.copyOfRange(pkt, 3, listByte.length + 3);
                    for(byte b : listByte){
                        if(b != 0){
                            listJSON += (char)b;
                        }else{
                            break;
                        }
                    }
                    
                    //json array to java list
                    listJava = gson.fromJson(listJSON, aliasListType);
                    
                    Group.removeAlias(listJava.get(0));
                    Group.setAliasListUpdated(true);
                    System.out.println("Disconnected user list received: " + listJSON);
                    break;
        }
    }
}
