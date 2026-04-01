package dao;

import conections.conections;
import java.sql.PreparedStatement;
import model.CadastroUsuarioModel;


public class CadastroUsersDAO {
    
    public boolean cadastrar(CadastroUsuarioModel users) {
        String sql = "INSERT INTO users" + 
                "(username, psw, nome, sobrenome, matricula, cpf, dataNasc, email, telefone, funcao, cep, endereco, cidade, bairro, estado, numero, complemento)" +
                "VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (var con = conections.ConectionsFactory.getConections()){
            
             PreparedStatement stmt = con.preparedStatement(sql);
             
             stmt.setString(1, users.getNome());
             stmt.setString(2, users.getSobrenome());
             stmt.setString(3, users.getCpf());
             stmt.setLong(4, users.getCep());
             stmt.setString(5, users.getEndereco());
             stmt.setString(6, users.getEstado());
             stmt.setString(7, users.getBairro());
             stmt.setString(8, users.getCidade());
             stmt.setLong(9, users.getNumero());
             stmt.setString(10, users.getComplemento());
             stmt.setString(11, users.getNomeUsuario());
             stmt.setString(12, users.getSenha());
             stmt.setString(13, users.getFuncao());
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
    }
        return false;
        }
}
