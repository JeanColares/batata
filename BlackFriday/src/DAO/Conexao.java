/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * jlbavaresco@gmail.com
 */
public class Conexao {
    
    private static final String banco = 
            "jdbc:postgresql://localhost:5432/BlackFriday";
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

