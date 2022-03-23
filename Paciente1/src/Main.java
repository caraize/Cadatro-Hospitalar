/*
Aula 4 Paciente. aula de revisao 30.09
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Paciente1 p = new Paciente1();
       
       Paciente1 p2 = new Paciente1("Gabriel");
       
       p.cadastraDados();
       p.ImprimeDados();
        System.out.println("Idade: " + p.calculaIdade(2022));
        
       /*p2.ImprimeDados();
        
        */
    
}
    
}
