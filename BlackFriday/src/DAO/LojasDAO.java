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
import modelo.Lojas;

/**
 *
 * @author Jean
 */
public class LojasDAO {
    public Boolean inserir (Lojas  loja)
    {
        Boolean retorno;
        
        String sql = "INSERT INTO loja(idloja, nome, recomendada)" + "VALUES (?, ?, ?)";
        
      
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            //insere os parâmetros
            pst.setInt(1, loja.getIdLoja());
            pst.setString(2, loja.getNomeLoja());
            pst.setBoolean(3, loja.getRecomenda());
            
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
    
    public List<Lojas> listar()
    {
        List <Lojas> lista = new ArrayList<Lojas>();
        String sql = "SELECT * FROM loja";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            //Executo o sql e jogo em um resultset
            ResultSet res = pst.executeQuery();
            
            while (res.next())
            {
                Lojas loja = new Lojas();
                loja.setIdLoja(res.getInt("id"));
                loja.setNomeLoja(res.getString("nome"));
                loja.setRecomenda(res.getBoolean("recomendada"));
                lista.add(loja);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(LojasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Boolean remover (Lojas loja)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM Lojas WHERE idloja = ?";
        
        //Prepara a execução do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setInt(1, loja.getIdLoja());
            pst.executeUpdate();
            retorno = true;
        }
        
        catch (Exception ex)
        {
            retorno = false;         
        }
        
        return retorno;
    }
    
    public Boolean atualizar (Lojas loja)
    {
        Boolean retorno;
        
        String sql = "UPDATE USUARIO SET Recomendada = ?, Nome = ? WHERE idloja = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setInt(1, loja.getIdLoja());
            pst.setString(2, loja.getNomeLoja());
            pst.setBoolean(3, loja.getRecomenda());
            
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
    
    public Lojas loja (Lojas loja)
    {
        Lojas retorno = null;
        String sql = "SELECT * FROM loja WHERE idloja = ? and senha = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setInt(1, loja.getIdLoja());
            pst.setString(2, loja.getNomeLoja());
            
            ResultSet res = pst.executeQuery();
            
            
            if (res.next())
            {
                retorno = new Lojas();
                retorno.setIdLoja(res.getInt("id"));
                retorno.setNomeLoja(res.getString("nome"));
                retorno.setRecomenda(res.getBoolean("recomendada"));
            }
        } 
        catch (Exception e) 
        {
            
        }
        
        return retorno;
    }
}



