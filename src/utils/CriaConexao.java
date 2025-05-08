/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author paulojp
 */
public class CriaConexao {
    
    public static Connection getConexao() throws SQLException {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao banco de dados.");
                return DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","P9544504");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar: " + e.getMessage());
            throw new SQLException(e.getMessage());
            
        }   
        
    }
    
}
