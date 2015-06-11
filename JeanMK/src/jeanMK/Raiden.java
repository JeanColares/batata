/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeanMK;

/**
 *
 * @author Fernanda - 4I 
 */
public class Raiden extends Personagens {
    
    public String toward ()
    {
        return "Trás - Cima " + socofraco + "-" + chuteforte;
    }
    
    public String rain ()
    {
        return "Baixo - Frente " + socoforte +  "-" + socoforte + "-" + chuteforte;
    }
    
    public String tornado ()
    {
        return "Frente - Frente " + chuteforte + "-" + socoforte;
    }
    
    public String combo ()
    {
        return socoforte + "-" + chutefraco + "-" + socoforte + "Frente - Trás";
    }
    
    public String combo2 ()
    {
        return "Frente - Trás - Frente " + chuteforte + "-" + socoforte + "-" + chuteforte;
    }
    
    public String fatality ()
    {
        return "Trás - Trás - Trás " + socoforte + "-" + chutefraco + "-" + chuteforte;
    }
    
    public String fatality2 ()
    {
        return chuteforte + "-" + socoforte + "-" + chuteforte + "-" + chutefraco + "-" + chuteforte + rain();
    }
}
