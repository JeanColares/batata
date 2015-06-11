

package jeanMK;


public class JonnyCage extends Personagens {
    
    public String bolaFrente ()
    {
        return "Baixo - Frente " + socofraco;
    }
    
    public String bolaCima ()
    {
        return "Baixo - Frente " + socoforte;
    }
    
    public String slide ()
    {
        return "Frente - Frente " + chuteforte;
    }
    
    public String combo ()
    {
        return socoforte + "-" + chutefraco;
    }
    
    public String combo2 ()
    {
        return chuteforte + "-" + socoforte + "-" + chuteforte;
    }
    
    public String fatality ()
    {
        return socoforte + "-" + chutefraco + "-" + chuteforte;
    }
    
    public String fatality2 ()
    {
        return chuteforte + "-" + socoforte + "-" + chuteforte + "-" + chutefraco + "-" + chuteforte;
    }
}
