package Aula3Main;

import java.util.Arrays;

public class VetoresAluno {
    public static void main (String args[]){
        Aluno alunos[] = new Aluno[5];
        System.out.println("Tamanho do array: "+alunos.length);

        alunos[0] = new Aluno(123, "Andre");
        alunos[1] = new Aluno(456, "Joana");
        alunos[2] = new Aluno(789, "Pedro");

        System.out.println(alunos[0]);
        System.out.println(alunos[1]);
        System.out.println(alunos[2]);
        alunos = Arrays.copyOf(alunos, 2);
        System.out.println("**********");
        System.out.println("Tamanho do array: "+alunos.length);
        System.out.println(alunos[1]);
        //System.out.println(alunos[5]);
    }
}

class Aluno{
    private int matricula;
    private String nome;
  
    public Aluno(int matricula, String nome){
      this.matricula = matricula;
      this.nome = nome;
    }
  
    public int getMatricula(){
      return matricula;
    }
  
    public String getNome(){
      return nome;
    }
  
    @Override
    public String toString(){
      String out = "";
      out += "Aluno "+getNome()+" com matricula "+getMatricula()+"\n";
      return out;
    }
  }