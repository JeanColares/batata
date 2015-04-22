package jeanpessoa;
import javax.swing.JOptionPane;
    import modelo.Pessoa;
public class JeanPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa ();
        
        //Tratamento de erros inesperados...   
        while (pessoa.getCodigo()==null)
        {    
            try 
            {
                //aqui é o que estou executando
                pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
                //enquanto tiver dando erro, o codigo fica null
            }
            catch (Exception ex)
            {
                //aqui é o que quero fazer quando der erro
                JOptionPane.showMessageDialog(null, "O CÓDIGO É EM NÚMERO");
            }
        }
        
        pessoa.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        pessoa.setSexo(JOptionPane.showInputDialog("Digite o sexo: "));
        
        //Exibir na tela       
        JOptionPane.showMessageDialog(null,"Código: " + pessoa.getCodigo() + "\n" + 
                "Nome: " + pessoa.getNome() + "\n" + "Sexo: " + pessoa.getSexo());
    }
    
}
