package Aula2Main;

import java.util.Scanner;

class EntradaDados{
    public static void main(String[] args){
        int i, leitura;
        Scanner entrada = new Scanner(System.in);
        for (i=0; i<5; ++i){
            System.out.print("Informe um numero inteiro: ");
            leitura = entrada.nextInt();
            System.out.printf("Acabei de ler %d\n", leitura);
        }
        entrada.close();
    }
}