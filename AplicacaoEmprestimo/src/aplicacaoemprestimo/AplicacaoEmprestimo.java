package aplicacaoemprestimo;

import java.util.Scanner;
public class AplicacaoEmprestimo{
    public static void main(String args[]){
        Pessoa pessoa;        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome = scanner.nextLine();
        System.out.println("Voce e funcionario?");
        String func = scanner.nextLine(); 
    if(func.equals("sim")){            
            System.out.println("Voce e funcionario publico?");
            String funcpublic = scanner.nextLine();        
            if(funcpublic.equals("sim")){
                   System.out.println("Qual e o orgao?");
                   String orgao = scanner.nextLine();
                   System.out.println("Qual salario?");
                   double salario = scanner.nextDouble();                   
                   pessoa = new FuncionarioPublico(nome,salario,orgao);
                   System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());
            }
            else{ 
                   System.out.println("Voce e chefe de departamento?");
                   String chefe = scanner.nextLine();        
                   if(chefe.equals("sim")){
                       System.out.println("Qual departamento?");
                       String depto = scanner.nextLine();
                       System.out.println("Qual salario?");
                       double salario = scanner.nextDouble();                    
                       pessoa = new ChefeDepartamento(nome,salario,depto);
                       System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());
                   }
                   else{
                       System.out.println("Qual salario?");
                       double salario = scanner.nextDouble();
                       pessoa = new Funcionario(nome,salario);
                       System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());
                    }              
            }
        }
        else{
            pessoa = new Pessoa(nome);
            System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());       
        }
    }
    
    public static float calculaEmprestimo(Pessoa p) {
            return 1000f; 
    }
    
    public static float calulaEmprestimo(Object f){
        float emprestimo = 0;
        
        if(f instanceof ChefeDepartamento){
            ChefeDepartamento aux = (ChefeDepartamento) f;
            emprestimo = (float) (4*aux.qualSalario());
        }
        
        if(f instanceof Funcionario){
            Funcionario aux = (Funcionario) f;
            emprestimo = (float) (2*aux.qualSalario());
        }
        
        return emprestimo;
    }
}
