package Aula3Main;

import java.util.ArrayList;
import java.util.Arrays;

public class VetoresAPI {
    public static void main (String args[]){
    ArrayList<String> nomes = new ArrayList<String>();

    String nome1 = "Andre";
    String nome2 = "Joana";
    String nome3 = "Pedro";

    /*Adiciona String ao array */
    nomes.add(nome1);
    nomes.add(nome2);
    nomes.add(nome3);
    nomes.add("Carolina");
  

    /* Invoca o método toString to ArrayList */
    System.out.println(nomes);
    System.out.println("Tamanho atual da lista: " + nomes.size());
    String segundo = nomes.get(1);
    nomes.remove(1);
    String terceiro = nomes.get(2);
    System.out.printf("Joana %s esta na lista\n", nomes.contains("Joana") ? "" : "nao");
    System.out.printf("Andre %s esta na lista\n", nomes.contains("Andre") ? "" : "nao");
    System.out.println("Tamanho atual da lista: " + nomes.size());
    System.out.println(nomes);
    }
}