/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CadastroUsersDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.CadastroUsuarioModel;

/**
 *
 * @author helde
 */
public class CadastroController extends HttpServlet {
    protected  void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
        CadastroUsuarioModel users = new CadastroUsuarioModel();
        
        users.setNome(request.getParameter("nameFirst"));
        users.setSobrenome(request.getParameter("sobreNome"));
        users.setMatricula(Long.parseLong(request.getParameter("matricula")));
        users.setCpf(request.getParameter("cpf"));
        users.setSexo(request.getParameter("sexo"));
        users.setDtaNascimento(Long.parseLong(request.getParameter("dtaNascimento")));
        users.setEmail(request.getParameter("email"));
        users.setTelefone(Long.parseLong(request.getParameter("telefone")));
        users.setUsuario(request.getParameter("usuario"));
        users.setSenha(request.getParameter("Senha"));
        users.setFuncao(request.getParameter("funcao"));
        users.setCep(Long.parseLong(request.getParameter("cep")));
        users.setEndereco(request.getParameter("endereco"));
        users.setCidade(request.getParameter("cidade"));
        users.setBairro(request.getParameter("bairro"));
        users.setEstado(request.getParameter("estado"));
        users.setNumero(Long.parseLong(request.getParameter("numero")));
        users.setComplemento(request.getParameter("complemento"));
        
       CadastroUsersDAO dao = new CadastroUsersDAO();
        
       if(dao.cadastrar(users)){
           response.sendRedirect("pages/dashboard.html");
       }else {
           response.sendRedirect("pages/dashboard.html");
       }
        
        
        
    }
}
