package prova1;

import java.util.ArrayList;

/**
 *
 * @author CRISTIAN
 */
public class Aluno {
    private String nome, curso;
    private double notaTCC;
    private Disciplina[] disciplinas;
    private int qDis;

    public Aluno(String nome, String curso, int quantDisciplina) {
        this.nome = nome;
        this.curso = curso;
        disciplinas = new Disciplina[quantDisciplina];
        this.qDis = 0;
    }

    public Aluno(String nome, String curso) {
        this(nome, curso, 10);
    }
    
    /*public boolean addNota(String codigo, double nota){
        for(int i=0; i < disciplinas.length; i++){
            if(disciplinas[i].getCodigo().equals(codigo)){
                disciplinas[i].setNota(nota);
                return true;
            }
        }
        return false;
    }*/
    public boolean setDisciplina(String codigo, double nota){
        if(qDis < disciplinas.length){
            disciplinas[qDis] = new Disciplina(codigo, nota);
            qDis++;
            return true;
        }
        return false;
    }
    
    public boolean setDisciplina(Disciplina newDisciplinas[]){
        if(newDisciplinas.length <= disciplinas.length - qDis){
            for(int i=0; i<newDisciplinas.length; i++){
                disciplinas[qDis] = newDisciplinas[i];
                qDis++;
            }
            return true;
        }
        
        return false;
    }
    
    /*public boolean addNota(Disciplina newDisciplinas[]){
        for(int i=0; i<newDisciplinas.length; i++){
            for(int j=0; j<disciplinas.length; j++){
                if(newDisciplinas[i].getCodigo().equals(disciplinas[j].getCodigo())){
                    disciplinas[j].setNota(newDisciplinas[i].getNota());
                }
            }
        }
    }*/
    
    public double getNota(String codigo){
            for(int i=0; i<qDis; i++){
                System.out.println(i);
                if(disciplinas[i].getCodigo().equals(codigo)){
                    
                    return disciplinas[i].getNota();
                }
            }
            return -1;
    }
    
    public void imprimeAluno(){
        System.out.print("Nome: ");
        System.out.println(nome);
        System.out.print("Curso: ");
        System.out.println(curso);
        System.out.println("Disciplinas: ");
        for(int i=0; i<qDis; i++){
            System.out.print(disciplinas[i].getCodigo());
            System.out.print(" Nota: ");
            System.out.println(disciplinas[i].getNota());
        }
        System.out.print("Nota TCC:  ");
        System.out.println(notaTCC);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaTCC() {
        return notaTCC;
    }

    public void setNotaTCC(double notaTCC) {
        this.notaTCC = notaTCC;
    }
    
    
    
    
}
