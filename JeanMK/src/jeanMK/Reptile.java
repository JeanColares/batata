package jeanMK;
    public class Reptile extends Personagens{

    
    public Reptile ()
    {
        
        
    }

   
    public String invisivel ()
    {
        return " Baixo - Cima - Bolinha" +  chuteforte;
    }
    
    public String acido ()
    {
        return "Baixo - Frente " + socofraco;
    }
    
    public String bolarapida ()
    {
        return "Tras - Tras " + socofraco;
    }
    
   
    public String bolalenta ()
    {
        return "Tras - Tras " + chutefraco;
    }
    
  
    public String combo ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    @Override
    public String combo2 ()
    {
        return chuteforte + "-" + chutefraco + "-" + socoforte;
    }
    
  
    public String fatality1 ()
    {
        return chuteforte + "-" + chutefraco + "- Tras - Tras " + chuteforte;
    }
    
  
    public String fatality2 ()
    {
        return chuteforte + "-" + chuteforte + "-" + socoforte + "-" + socofraco + "-" + chutefraco;
    }
    
    private String bolaultrassonica()
    {
        return chuteforte + "-" + chutefraco + "- Tras - Tras " + socofraco + chutefraco + "- Tras - Tras " + chuteforte;
    }
}
