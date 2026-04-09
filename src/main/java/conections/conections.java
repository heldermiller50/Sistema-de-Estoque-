/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conections;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author helde
 */
public class conections implements AutoCloseable {

    public PreparedStatement preparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class ConectionsFactory{
    //Dados da conexão
        private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://db:3307/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        private static final String USER = "root";
        private static final String PASSWORD = "25011999";
        
        //Métodos
    public static conections getConections(){
        conections con = null;
        try {
            Class.forName(DRIVER);
            con = (conections) DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Banco de dados conectado.");}
        catch (Exception e) {
            System.out.println("Banco de dados não conectado.");
            e.printStackTrace();
        }
        
        return con;
        }
    }
}
    
