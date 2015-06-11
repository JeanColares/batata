
package jeanMK;


public class Kitana extends Personagens {
    
    public String slash ()
    {
        return "Trás - Cima " + socofraco + "-" + chuteforte;
    }
    
    public String power ()
    {
        return "Baixo - Frente " + socoforte +  "-" + socoforte + "-" + chuteforte;
    }
    
    public String extreme ()
    {
        return "Frente - Frente " + chuteforte + "-" + socoforte;
    }
    
    public String combo ()
    {
        return socoforte + "-" + chutefraco + "-" + socoforte + "Frente - Trás";
    }
    
    public String combo2()
    {
        return "Frente - Trás - Frente " + chuteforte + "-" + socoforte + "-" + chuteforte;
    }
    
    public String fatality1 ()
    {
        return "Trás - Trás - Trás " + socoforte + "-" + chutefraco + "-" + chuteforte;
    }
    
    public String fatality2 ()
    {
        return chuteforte + "-" + socoforte + "-" + chuteforte + "-" + chutefraco + "-" + chuteforte + extreme();
    }
}
