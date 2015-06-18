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
import modelo.Notebook;
/**
 *
 * @author Jean
 */
public class NotebookDAO {
 public Boolean inserir (Notebook notebook)
 {
    Boolean retorno;
        
        String sql = "INSERT INTO Notebook (Id, nome, marca, descricao, PrecoNormal, PrecoBF, Recomenda) VALUES  (:, :, :, :, :, :)";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            pst.setInt(1, notebook.getId());
            pst.setString(2, notebook.getNome());
            pst.setString(3, notebook.getMarca());
            pst.setString(4, notebook.getDescricao());
            pst.setDouble(5, notebook.getPrecoNormal());
            pst.setDouble(6, notebook.getPrecoBF());
            pst.setBoolean(7, notebook.getDestaque());
            
            
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
    
    public List<Notebook> listar()
    {
        List <Notebook> lista = new ArrayList<Notebook>();
        String sql = "SELECT * FROM notebook";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            ResultSet res = pst.executeQuery();

            while (res.next())
            {
                Notebook notebook = new Notebook();
                notebook.setId(res.getInt("id"));
                notebook.setNome(res.getString("nome"));
                notebook.setMarca(res.getString("marca"));
                notebook.setDescricao(res.getString("descrição"));
                notebook.setPrecoNormal(res.getDouble("preço normal"));
                notebook.setPrecoBF(res.getDouble("preço black friday"));
                notebook.setDestaque(res.getBoolean("destaque"));
                lista.add(notebook);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(NotebookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Boolean remover (Notebook notebook)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM notebook WHERE id = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            pst.setInt(1, notebook.getId());
         
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
    
    public Boolean atualizar (Notebook notebook)
    {
        Boolean retorno;
        
        String sql = "UPDATE notebook SET id = ?, nome = ?, marca = ?, descrição = ?, preço normal = ?, preço black friday = ?, destaque = ? WHERE id = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setInt(1, notebook.getId());
            pst.setString(2, notebook.getNome());
            pst.setString(3, notebook.getMarca());
            pst.setString(4, notebook.getDescricao());
            pst.setDouble(5, notebook.getPrecoNormal());
            pst.setDouble(6, notebook.getPrecoBF());
            pst.setBoolean(7, notebook.getDestaque());
            
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
    
    public List<Notebook> listarDestaque (Boolean destaque)
    {
        List <Notebook> lista = new ArrayList<Notebook>();
        
        String sql = "SELECT * FROM notebook WHERE destaque = ? ORDER BY RANDOM() LIMIT 3";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            pst.setBoolean(1, destaque);
            
            ResultSet res = pst.executeQuery();
            
            while (res.next())
            {
                Notebook notebook = new Notebook();
                notebook.setId(res.getInt("id"));
                notebook.setNome(res.getString("nome"));
                notebook.setMarca(res.getString("marca"));
                notebook.setDescricao(res.getString("descrição"));
                notebook.setPrecoNormal(res.getDouble("preço normal"));
                notebook.setPrecoBF(res.getDouble("preço black friday"));
                notebook.setDestaque(res.getBoolean("destaque"));
                lista.add(notebook);
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
  
}

