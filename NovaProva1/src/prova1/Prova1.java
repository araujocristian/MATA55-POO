package prova1;

/**
 *
 * @author CRISTIAN
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Cristian Araujo", "Eng Comp", 2);
        Disciplina[] discpilinas1 = new Disciplina[2];
        
        discpilinas1[0] = new Disciplina("ENG40", 5.0);
        discpilinas1[1] = new Disciplina("ENG410", 5.0);

        
        System.out.println(aluno1.setDisciplina("ENG50", 5.0));
        //aluno1.setDisciplina("ENG51", 3.0);
        
        System.out.println(aluno1.setDisciplina(discpilinas1));
        
        System.out.println("---------------------------------------------------------------");
        System.out.println(aluno1.getNota("ENG40"));
        System.out.println("---------------------------------------------------------------");
        aluno1.imprimeAluno();
    }
    
}
