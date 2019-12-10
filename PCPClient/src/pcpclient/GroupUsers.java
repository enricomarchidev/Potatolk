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
public class GroupUsers {
    private static List<String> aliasList;
    private static boolean aliasListUpdated;

    public static void users() {
        aliasList = new ArrayList<>();
        aliasListUpdated = false;
    }

    public static void setAliasList(List<String> aliasList) {
        GroupUsers.aliasList = aliasList;
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
        GroupUsers.aliasListUpdated = aliasListUpdated;
    }
    
}
