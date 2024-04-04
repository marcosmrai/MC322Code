package Aula3Main;

public class VetoresDistancias {
  public static void main(String args[]){
    int [][] distancias = {{10, 20, 30}, {30, 40}, {30, 40, 50}};

    System.out.println("Tamanho de distancias: "+distancias.length);
    for (int []linha:distancias){
      System.out.println("Tamanho da linha: "+linha.length);
    }
  }
}