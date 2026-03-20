package controller;

import dao.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.UserModel;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    
    @Override
    protected  void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
 
        String users = request.getParameter("users");
        String passw = request.getParameter("passw");
        
        UserModel user = new UserModel();
       
        user.setUsers();
        user.setPassw();
        
        UserDAO dao = new UserDAO();
        
        if(dao.validarLogin(user)){
            HttpSession session = request.getSession();
            
            session.setAttribute("usuario", users);
            
            response.sendRedirect("pages/dashboard.html");
        }else{
            response.sendRedirect("index.html");
        }
    }
}
