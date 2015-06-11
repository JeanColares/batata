package jeanMK;
import javax.swing.JOptionPane;

public class Lutas {
    public String cenario;
    public Personagens personagem1;
    public Personagens personagem2;

    
    public Integer dano;
    public Integer danocombo;
    public Integer novodano;
    
    public Lutas ()
    {
        this.cenario = "Casa do Goro";
        this.personagem1 = new Personagens ();
        this.personagem2 = new Personagens ();
        this.dano = 5;
        this.danocombo = 20;
        
    }
    
    public Lutas (String cenario, Personagens p1, Personagens p2)
    {
        this.cenario = cenario;
        this.personagem1 = p1;
        this.personagem2 = p2;
        this.dano = 5;
        this.danocombo = 20;
        
    }

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Personagens getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Personagens personagem1) {
        this.personagem1 = personagem1;
    }

    public Personagens getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(Personagens personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo() {
        return danocombo;
    }

    public void setDanocombo(Integer danocombo) {
        this.danocombo = danocombo;
    }
    
    
    public void acertaGolpe (String lutador)
    {
        if (lutador.equals("p1"))
        {
            this.personagem2.setVida(this.personagem2.getVida()-this.dano);
     
        }
        else
        {
            this.personagem1.setVida(this.personagem1.getVida()-this.dano);
        }
    }
    public void acertaGolpe (String lutador, Integer novodano)
    {
        if (lutador.equals("p1"))
        {
            this.personagem2.setVida(this.personagem2.getVida()-this.novodano);
     
        }
        else
        {
            this.personagem1.setVida(this.personagem1.getVida()-this.novodano);
        }
    }
    
    public void acertaCombo (String lutador)
    {
        if (lutador.equals("p1"))
        {
            this.personagem2.setVida(this.personagem2.getVida()-this.danocombo);
            JOptionPane.showMessageDialog(null, this.personagem1.combo1());
     
        }
        else
        {
            this.personagem1.setVida(this.personagem1.getVida()-this.danocombo);
            JOptionPane.showMessageDialog(null, this.personagem2.combo1());
        }
    }
    
    
    public void acertaCombo2 (String lutador)
    {
        if (lutador.equals("p1"))
        {
            this.personagem2.setVida(this.personagem2.getVida()-this.danocombo);
            JOptionPane.showMessageDialog(null, this.personagem1.combo2());
     
     
        }
        else
        {
            this.personagem1.setVida(this.personagem1.getVida()-this.danocombo);
            JOptionPane.showMessageDialog(null, this.personagem1.combo1());
        }
    }
}
