/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ws.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class ConnectionDB {
    
    Connection connection = null;
    
    public Connection initConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicStore", "root", "root1234");
	} catch (SQLException e) {
            e.printStackTrace();
	}
        
        if (connection != null) {
            System.out.println("You made it, take control your database now!");
            return connection;
	} else {
            System.out.println("Failed to make connection!");
            return null;
	}
    }    
}
