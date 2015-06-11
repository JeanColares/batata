package jeanMK;
public class SubZero extends Personagens {


    public SubZero ()
    {
       
    }
    
   
    
    
    public String gelofrente ()
    {
        return " Cima - Baixo - Quadrado" +  chuteforte;
    }
    
    public String gelochao ()
    {
        return "Trás- Frente " + socoforte;
    }
    
    public String slide ()
    {
        return "Frente - Trás " + chutefraco;
    }
    
    public String combo ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    public String combo2 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    public String fatality1 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    public String fatality2 ()
    {
        return chuteforte + "-" + chutefraco;
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
    
    private String supergelo()
    {
        return chuteforte + "-" + chutefraco + "- Trás - Trás " + socofraco;
    }

   
    }

