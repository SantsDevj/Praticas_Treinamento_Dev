package preparacao_exame;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        //Este progrma remove os números que são múltiplos do menor elemento de um arraylist
        Scanner read =  new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        //Inserido os númros dentro de uma lista
        System.out.println("Insira 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            numeros.add(read.nextInt());
        }
        //Imprimindo os números inseridos dentro da lista
        System.out.println("\nNúmeros inseridos na lista");
        System.out.print("[");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + ", ");
        }
        System.out.println("]");
        //Verificando o menor elemento
        int menor = numeros.getLast();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
            if (numeros.get(i) % menor == 0) {
                numeros.remove(numeros.get(i));
            }
        }
        System.out.printf("O menor número inserido foi %d", menor);
        System.out.println("\nA nova lista sem múltiplos do menor elemento:");
        System.out.println(numeros);
        read.close();
    }
}
