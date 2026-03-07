package model;

public class UserModel {
    
    private int id;
    private String users;
    private String passw;
    
    public UserModel(){
        
    }
    
    public String getUsers(){
        return users;  
    }
    
    public void setUsers(){
        this.users = users;
    }
     public String getPassw(){
        return passw;  
    }
    
    public void setPassw(){
        this.passw = passw;
    }

}