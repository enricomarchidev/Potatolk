/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrico
 */
public class Group {
    private static List<String> aliasList;
    private static boolean aliasListUpdated;
    private static String topic;
    private static List<Message> groupMessages;
    //list of User objects
    
    public static void createGroup() {
        aliasList = new ArrayList<>();
        aliasListUpdated = false;
        groupMessages = new ArrayList<>();
    }

    public static void setAliasList(List<String> aliasList) {
        Group.aliasList = aliasList;
    }

    public static List<String> getAliasList() {
        return aliasList;
    }
    
    public static void addAlias(String alias){
        aliasList.add(alias);
    }
    
    public static void removeAlias(String alias){
        aliasList.remove(alias);
    }

    public static boolean isAliasListUpdated() {
        return aliasListUpdated;
    }

    public static void setAliasListUpdated(boolean aliasListUpdated) {
        Group.aliasListUpdated = aliasListUpdated;
    }

    public static String getTopic() {
        return topic;
    }

    public static void setTopic(String topic) {
        Group.topic = topic;
    }

    public static List<Message> getGroupMessages() {
        return groupMessages;
    }
    
    public static void addMessage(Message message){
        Group.groupMessages.add(message);
    }
    
    public static void removeMessage(Message message){
        Group.groupMessages.remove(message);
    }
}
