
import javax.swing.JOptionPane;


public class Paciente1 {
    String nome; //nome é um atributo   
    String RG;
    String endereço;
    String telefone;
    int anoNascimento;
    String Sangue;
    
    
    
    public Paciente1(){}
    
    public Paciente1(String n){
    this.nome = n; //this serve apenas para chamar a variavel para o metodo
    }
    
    public void cadastraDados(){
        nome = JOptionPane.showInputDialog(null,"Digite o nome do Paciente");
        RG = JOptionPane.showInputDialog(null,"Digite o RG do Paciente");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano de nascimento do Paciente"));
        endereço = JOptionPane.showInputDialog(null,"Digite seu endereço");
        telefone = JOptionPane.showInputDialog(null,"Digite o seu telefone");
        Sangue = JOptionPane.showInputDialog(null,"Digite seu tipo sanguineo");
        
    }
    public void ImprimeDados (){
        System.out.println("Dados do paciente" + 
                            "\nNome: " + nome +
                             "\nRG: " + RG +
                              "\nAno de Nascimento: " + anoNascimento +
                                "\nSeu endereço:  " + endereço +
                                    "\nSeu telefone: " + telefone +
                                        "\nSeu tipo sanguineo: " +Sangue
                                       + "\n ..............");
    }
    
    
    public int calculaIdade(int anoAtual){
    return  anoAtual -  anoNascimento ;
    }
}
