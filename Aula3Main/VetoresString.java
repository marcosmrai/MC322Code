package Aula3Main;

public class VetoresString {
    public static void main (String args[]){
      String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", 
                        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
      int[] diaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
      System.out.println("Meses do ano: ");
      for (String i:meses){
        System.out.println("* " + i);
      }
      for (int i=0; i<meses.length; ++i){
        System.out.println("* " + meses[i] + " tem " + diaMes[i] + " dias");
      }
    }
  }