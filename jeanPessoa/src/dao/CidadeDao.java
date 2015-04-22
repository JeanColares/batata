package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cidade;

public class CidadeDao {
    
    public Boolean inserir(Cidade cidade)
    {
        Boolean retorno;
        
        String sql = "INSERT INTO cidade(nome)" + "VALUES(?)";
        
        PreparedStatement pst = Conexão.getPreparedStatement(sql);
        
        try 
        {
            pst.setString(1, cidade.getCidnome());
            
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
    
    public List<Cidade> listar()
    {
        List<Cidade> lista = new ArrayList<Cidade>();
        
        String sql = "SELECT * FROM cidade";
        
        PreparedStatement pst = Conexão.getPreparedStatement(sql);
        
        try 
        {
             ResultSet res = pst.executeQuery();
            
            while (res.next())
            {
                Cidade cidade = new Cidade();
                cidade.setCidcod(res.getInt("id"));
                cidade.setCidnome(res.getString("nome"));
                lista.add(cidade);
            }
        } 
         catch (SQLException ex) 
        {
            Logger.getLogger(CidadeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
    public Boolean remover(Cidade cidade)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM cidade WHERE id = ?";
        
        PreparedStatement pst = Conexão.getPreparedStatement(sql);
        
        try 
        {
            pst.setInt(1, cidade.getCidcod());
            
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
}
