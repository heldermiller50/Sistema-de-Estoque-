package dao;

import conections.conections;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.UserModel;

public class UserDAO {

    public boolean validarLogin(UserModel userModel){
        String sql = "SELECT * FROM users WHERE username= ? AND psw= ?";
        try (var con = conections.ConectionsFactory.getConections()){
            
            PreparedStatement stmt = con.preparedStatement(sql);
            stmt.setString(1, userModel.getUsername());
            stmt.setString(2, userModel.getPassword());
            
            ResultSet rs = stmt.executeQuery();
            
            return rs.next();
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
