/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class UsuarioDAO {
   public Boolean inserir (Usuario  user)
    {
        Boolean retorno;
        
        String sql = "INSERT INTO usuario(login, senha, Nome)" + "VALUES (?, ?, ?)";
        
      
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            //insere os parâmetros
            pst.setString(1, user.getLogin());
            pst.setString(2, user.getSenha());
            pst.setString(3, user.getNome());
            
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<Usuario> listar()
    {
        List <Usuario> lista = new ArrayList<Usuario>();
        String sql = "SELECT * FROM usuario";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            //Executo o sql e jogo em um resultset
            ResultSet res = pst.executeQuery();
            
            while (res.next())
            {
                Usuario user = new Usuario();
                user.setLogin(res.getString("login"));
                user.setSenha(res.getString("senha"));
                user.setNome(res.getString("Nome"));
                lista.add(user);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Boolean remover (Usuario user)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM usuario WHERE login = ?";
        
        //Prepara a execução do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setString(1, user.getLogin());
            pst.executeUpdate();
            retorno = true;
        }
        
        catch (Exception ex)
        {
            retorno = false;         
        }
        
        return retorno;
    }
    
    public Boolean atualizar (Usuario user)
    {
        Boolean retorno;
        
        String sql = "UPDATE USUARIO SET SENHA = ?, NOME = ? WHERE LOGIN = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setString(1, user.getSenha());
            pst.setString(2, user.getNome());
            pst.setString(3, user.getLogin());
            
            pst.executeUpdate();
            retorno = true;
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public Usuario login (Usuario user)
    {
        Usuario retorno = null;
        String sql = "SELECT * FROM usuario WHERE login = ? and senha = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setString(1, user.getLogin());
            pst.setString(2, user.getSenha());
            
            ResultSet res = pst.executeQuery();
            
            
            if (res.next())
            {
                retorno = new Usuario();
                retorno.setNome(res.getString("Nome"));
                retorno.setLogin(res.getString("login"));
                retorno.setSenha(res.getString("senha"));
            }
        } 
        catch (Exception e) 
        {
            
        }
        
        return retorno;
    }
}

