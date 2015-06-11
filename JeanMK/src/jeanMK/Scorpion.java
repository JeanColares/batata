package jeanMK;
public class Scorpion extends Personagens {
    

    public Scorpion ()
    {
       
    }

    
    public String spear ()
    {
        return " Baixo - Tras - Bolinha" +  socofraco;
    }
    
    public String teleport ()
    {
        return "Baixo - Baixo " + socoforte;
    }
    
    public String takedown ()
    {
        return "Trás - Frente " + chuteforte;
    }
    
    public String combo ()
    {
        return chuteforte + "-" + chuteforte;
    }
    
    public String combo2 ()
    {
        return chuteforte + "-" + socoforte;
    }
    
    public String fatality ()
    {
        return chuteforte + "-" + socofraco;
    }
    
    public String fatality2 ()
    {
        return socoforte + "-" + chutefraco;
    }
    
    private String airdeamon()
    {
        return chuteforte + "-" + chutefraco + "- Frente - Trás " + socoforte;
    }
}
