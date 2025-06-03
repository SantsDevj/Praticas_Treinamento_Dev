package preparacao_exame;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        //Este programa calcula a soma de números que são pares que seguem números ímpares
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numrs = new ArrayList<>();

        //Inserindo os números e mostrando os números inseridos na lista
        System.out.println("Insira 8 números inteiros na lista:");
        for(int i= 0; i < 8; i++){
            numrs.add(read.nextInt());
        }
        System.out.println("\nNúmeros inseridos na lista:");
        System.out.println(numrs);
        //Realizar a soma de números pares
        int soma = 0;
        boolean tem_Impar_Perto = false;
        for (int i = 0; i < numrs.size(); i++) {
            if (numrs.get(i) % 2 == 0) {
                tem_Impar_Perto = false;
            }
            if (i > 0 && numrs.get(i - 1) % 2 != 0) {
                tem_Impar_Perto = true;
            }
            if (i < numrs.size() - 1 &&  numrs.get(i + 1) % 2 != 0) {
                tem_Impar_Perto = true;
            }
            if (tem_Impar_Perto == true) {
                soma += numrs.get(i);
            }
        }
        
        System.out.printf("A soma de números pares é igual à %d", soma);
        read.close();  
    }
}
