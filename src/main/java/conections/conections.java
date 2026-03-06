/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conections;

import java.sql.DriverManager;

/**
 *
 * @author helde
 */
public class conections {
    public class ConectionsFactory{
    //Dados da conexão
        private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        private static final String USER = "root";
        private static final String PASSWORD = "25011999";
        
        //Métodos
    public static conections getConections(){
        conections con = null;
        
        try{
            Class.forName(DRIVER);
            con = DriverManager.getConections(URL, USER, PASSWORD);
            System.out.println("Banco de dados conectado.");
        }
        }
    }
}
    
