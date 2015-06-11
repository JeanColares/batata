package jeanMK;

import javax.swing.JOptionPane;

public class Playstation {

    public static void main(String[] args) {
        Reptile rep = new Reptile ();
        rep.setSocofraco("Bolinha");
        rep.setSocoforte("X");
        rep.setDefesa("Quadrado");
        rep.setAgarra("r1"); 
        rep.setEspecial("Triangulo");
        rep.setChuteforte("r2");
        rep.setChutefraco("Retangulo");
        
        SubZero sub = new SubZero ();
        sub.setSocofraco("Bolinha");
        sub.setSocoforte("X");
        sub.setDefesa("Quadrado");
        sub.setAgarra("r1"); 
        sub.setEspecial("Triangulo");
        sub.setChuteforte("r2");
        sub.setChutefraco("Ret�ngulo");
        
         Scorpion sco = new Scorpion ();
         sco.setSocofraco("Quadrado");
         sco.setSocoforte("Baixo");
         sco.setDefesa("Circulo");
         sco.setAgarra("Bolinha");
         sco.setEspecial("Cima");
         sco.setChuteforte("X");
         sco.setChutefraco("Triangulo");
         
         JonnyCage j = new JonnyCage ();
         j.setSocofraco("Quadrado");
         j.setSocoforte("Baixo");
         j.setDefesa("Circulo");
         j.setAgarra("Bolinha");
         j.setEspecial("Cima");
         j.setChuteforte("X");
         j.setChutefraco("Triangulo");
       
        
         JOptionPane.showMessageDialog(null,"Playstation\nReptile\n"
                 + "Comandos Basicos:");
        JOptionPane.showMessageDialog(null,"Soco fraco: " +  rep.getSocofraco() + "\nSoco forte: " + rep.getSocoforte() + 
                "\nDefesa: " +  rep.getDefesa() + "\nComandos especiasis:\nInvisivel: " + "" + rep.invisivel() + "Acido: " + 
                rep.acido());
        JOptionPane.showMessageDialog(null,"SubZero\nComandos Basicos:");
        JOptionPane.showMessageDialog(null,"Soco fraco: " +  sub.getSocofraco() + "\nSoco forte: " + sub.getSocoforte() + 
                 "\nDefesa: " +  rep.getDefesa() + "\nComandos especiasis:\nGelo Frente: " + sub.gelofrente() + "\nGelo Ch�o: " + 
                sub.gelochao() + "\nSlide: " + sub.slide() );
        JOptionPane.showMessageDialog(null,"Scorpion\nComandos Basicos:");
        JOptionPane.showMessageDialog(null,"Soco fraco: " +  sub.getSocofraco() + "\nSoco forte: " + sub.getSocoforte() + 
                 "\nDefesa: " +  sco.getDefesa() + "\nComandos especiasis:\nSpear:" + sco.spear() + "\nTake Down: " + sco.takedown() +
                         "\nTeleport: " + sco.teleport() +"\n" );
        
        Lutas luta = new Lutas ("Bahamas", rep, sco);

        luta.acertaGolpe("p1");
        JOptionPane.showMessageDialog(null, "Personagem 1 acerta golde!\nVida de personagem 1:" + luta.personagem1.getVida() + "\nVida de Scorpion:" 
                + luta.personagem2.getVida() );
        luta.acertaGolpe("p2");
        JOptionPane.showMessageDialog(null, "\nPersonagem 2 acerta golpe!\nVida de personagem 2:" + luta.personagem2.getVida() + "\nVida de reptile:" 
                + luta.personagem1.getVida() );
        luta.acertaCombo("p2");
        JOptionPane.showMessageDialog(null, "Personagem 2 acerta combo 1!\nVida de personagem 2:" + luta.personagem2.getVida() + "\nVida de reptile:" 
                + luta.personagem1.getVida() );
        
        
 
    }
    
}
