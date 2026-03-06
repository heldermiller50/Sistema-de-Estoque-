/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telalogin;


import conections.conections.ConectionsFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.Connection; 
    
/**
 *
 * @author helde
 */
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String usuario = request.getParameter("users");
        String senha = request.getParameter("passw");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try (var con = ConectionsFactory.getConections()){
            String sql = "SELECT * FROM users WHERE username= ? AND psw= ?";
            
            PreparedStatement stmt = con.preparedStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                response.sendRedirect("dashboard.html");
            }else {
                out.println("<h2>Dados errados</h2>");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            out.println("<h2>Erro ao conectar ao banco de dados.</h2>");
        }
    }
}
