package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * jlbavaresco@gmail.com
 */
public class Conexão {
    
    private static final String banco = 
            "jdbc:postgresql://localhost:5432/bancoexercicio";
   
    private static final String driver = 
            "org.postgresql.Driver";
    
    private static final String usuario = "postgres";
    private static final String senha = "postgres";  
   
    private static Connection con = null;
    
    
    public static Connection getConexao(){
        if (con == null){
            try {
                Class.forName(driver);
                con = 
                DriverManager.getConnection(
                        banco, usuario, senha);
            } catch (ClassNotFoundException ex) {
                System.out.println("Não encontrou o driver");
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar: "+
                        ex.getMessage());
            }
        }
        return con;
    }
   
    public static PreparedStatement getPreparedStatement(String sql){
        if (con == null){
           
            con = getConexao();
        }
        try {
           
            return con.prepareStatement(sql);
        } catch (SQLException e){
            System.out.println("Erro de sql: "+
                    e.getMessage());
        }
        return null;
    }
    
}

