/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ws.forms;

/**
 *
 * @author root
 */
public class MusicalGroup {
    
    private String id;
    private String groupName;
    private String groupDescription;
    private String groupWeb;
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public String getGroupWeb() {
        return groupWeb;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public void setGroupWeb(String groupWeb) {
        this.groupWeb = groupWeb;
    }
    
}
