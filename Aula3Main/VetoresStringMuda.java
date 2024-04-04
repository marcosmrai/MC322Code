package Aula3Main;

public class VetoresStringMuda {
    public static void main (String args[]){
      String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", 
                        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
      int[] diaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
      System.out.println("Meses do ano: ");
      for (int i=0; i<meses.length; ++i){
        System.out.println("* " + meses[i] + " tem " + diaMes[i] + " dias");
      }
      mudaVetor2(diaMes);
      System.out.println("Meses do ano: ");
      for (int i=0; i<meses.length; ++i){
        System.out.println("* " + meses[i] + " tem " + diaMes[i] + " dias");
      }
    }
    public static void mudaVetor(int []v){
        for (int i=0; i<v.length; ++i)
            v[i] = 0;
    }
    public static void mudaVetor2(int []v){
        for (int i:v)
            i = 0;
    }
  }