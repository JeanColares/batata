/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jean
 */
public class Usuario {
    private String Login;
    private String Nome;
    private String Senha;
    private String Confirma;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getConfirma() {
        return Confirma;
    }

    public void setConfirma(String Confirma) {
        this.Confirma = Confirma;
    }


    
}
