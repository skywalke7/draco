/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ws.servicesImpl;

import com.home.ws.db.ConnectionDB;
import com.home.ws.forms.MusicalGroup;
import com.home.ws.services.AlbumService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class AlbumServiceImpl implements AlbumService {

    ConnectionDB connectionDB;
    Connection connection;
    String query;
    PreparedStatement preparedStatement;
    ResultSet rs;
    
    public MusicalGroup getAlbumByArtist(String name) {
        connectionDB = new ConnectionDB();
        connection = connectionDB.initConnection();
        MusicalGroup musicalGroup = new MusicalGroup();
        
        if(connection != null) {
            try {
                query = "SELECT * FROM GROUPS WHERE group_name ='" +name+ "'";
                preparedStatement = connection.prepareStatement(query);
                rs = preparedStatement.executeQuery();
                
                while(rs.next()) {
                    musicalGroup.setGroupName(rs.getString("group_name"));
                    musicalGroup.setGroupDescription(rs.getString("group_description"));
                    musicalGroup.setGroupWeb(rs.getString("group_web"));
                }
                
                System.out.print("MUSICAL GROUP -> " + musicalGroup);
                return musicalGroup;
                
            } catch (SQLException ex) {
                Logger.getLogger(AlbumServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if(rs != null) {
                        rs.close();
                    } 
                    if(preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if(connection != null) {
                        connection.close();
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
            
        } 
        
        return null;
    }

    public String getId(String name) {
        connectionDB = new ConnectionDB();
        connection = connectionDB.initConnection();
        String s = "";
        
        if(connection != null){            
            try {
                query ="SELECT group_id FROM GROUPS";
                preparedStatement = connection.prepareStatement(query);
                rs = preparedStatement.executeQuery();
                System.out.print("RS sizee = " + rs.getFetchSize());
                while(rs.next()){
                    s += rs.getString("group_id") + "| " ;
                }
                
                return s.substring(0, s.length() - 2) ;
            } catch (SQLException ex) {
                Logger.getLogger(AlbumServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return null;
    }
    
    
}
