package jeanMK;
public class Xbox {
    

    public static void main(String[] args) {
        
        Reptile p1 = new Reptile ();
        p1.setSocofraco("X");
        p1.setSocoforte("Cima");
        p1.setDefesa("Triangulo");
        p1.setAgarra("Retangulo");
        p1.setEspecial("Baixo");
        p1.setChuteforte("Quadrado");
        p1.setChutefraco("Bolinha");
         
         SubZero sub = new SubZero ();
         sub.setSocofraco("Bolinha");
         sub.setSocoforte("X");
         sub.setDefesa("Quadrado");
         sub.setAgarra("r1"); 
         sub.setEspecial("Triangulo");
         sub.setChuteforte("r2");
         sub.setChutefraco("Retangulo");
         
         Scorpion p2 = new Scorpion ();
         p2.setSocofraco("Quadrado");
         p2.setSocoforte("Baixo");
         p2.setDefesa("Circulo");
         p2.setAgarra("Bolinha");
         p2.setEspecial("Cima");
         p2.setChuteforte("X");
         p2.setChutefraco("Triangulo");
         
         
         KungLao kung = new KungLao ();
         kung.setSocofraco("Retangulo");
         kung.setSocoforte("Circulo");
         kung.setDefesa("Triangulo");
         kung.setAgarra("X");
         kung.setEspecial("Cima");
         kung.setChuteforte("Quadrado");
         kung.setChutefraco("Bolinha");
         
         Raiden r = new Raiden ();
         r.setSocofraco("Baixo");
         r.setSocoforte("Triangulo");
         r.setDefesa("Quadrado");
         r.setAgarra("Cima");
         r.setEspecial("Losango"); 
         r.setChuteforte("X");
         r.setChutefraco("Circulo");
         
         Kitana k = new Kitana ();
         r.setSocofraco("Losango");
         r.setSocoforte("Cima");
         r.setDefesa("X");
         r.setAgarra("Circulo");
         r.setEspecial("Baixo"); 
         r.setChuteforte("X");
         r.setChutefraco("Retangulo");
         
         Lutas luta = new Lutas ("Bahamas",  p1, k);
         luta.acertaGolpe("p1");
         System.out.println("Personagem 1 acerta golpe: normal em Personagem 2\nVida do personagem 1" + luta.personagem1.vida + "\nVida do personagem"
                 + " 2:" + luta.personagem2.vida);
        luta.acertaCombo("k");
        System.out.println("Personagem 2 acerta combo 1 em Personagem 2\nVida do personagem 1" + luta.personagem1.vida + "\nVida do personagem"
                 + " 2:" + luta.personagem2.vida);
        luta.acertaCombo2("k");
        System.out.println("Personagem 2 acerta combo 2 em Personagem 2\nVida do personagem 1" + luta.personagem1.vida + "\nVida do personagem"
                 + " 2:" + luta.personagem2.vida);
        
        Lutas luta2 = new Lutas ("Teatro", kung, r);
        luta2.acertaGolpe("r");
        System.out.println("Personagem 2 acerta golpe: normal em Personagem 1\nVida do personagem 1" + luta2.personagem1.vida + "\nVida do personagem"
                 + " 2:" + luta2.personagem2.vida + "\n");
        luta2.acertaGolpe("r", 13);
        System.out.println("Personagem 2 acerta golpe com dano em Personagem 1\nVida do personagem 1" + luta2.personagem1.vida + "\nVida do personagem"
                 + " 2:" + luta2.personagem2.vida + "\n");
        luta2.acertaCombo2("r");
        System.out.println("Personagem 2 acerta combo 2 em Personagem 1\nVida do personagem 1" + luta2.personagem1.vida + "\nVida do personagem"
                 + " 2:" + luta2.personagem2.vida + "\n");
        luta2.acertaCombo("p1");
        System.out.println("Personagem 1 acerta golpe: normal em Personagem 2\nVida do personagem 1" + luta2.personagem1.vida + "\nVida do personagem"
                 + " 2:" + luta2.personagem2.vida + "\n");
        

    }
    
}
