package exception_excercicios;

import java.util.Scanner;
//Neste exercício devo evitar um erro ao dividir os números
public class Exercicio01 {
    public static double dividirNum (int div,  int dev){
        double divisao = 0;
        divisao = div / dev;
        return divisao;
    }
    public static void main(String[] args) {
        Scanner read_value = new Scanner(System.in);
        //Inserir os números/Ler valores
        System.out.println("--------------------------------");
        System.out.println("|"+ "-----DIVISÃO DE NÚMEROS-----" + "   |");
        System.out.println("--------------------------------");
        System.out.println("Insira o primeiro número:");
        int num01 = read_value.nextInt();
        System.out.println("Insira o segundo número:");
        int num02 = read_value.nextInt();
        System.out.printf("A divisão entre %d e %d é igual à:", num01, num02);
        try{
            System.out.println("\n" + dividirNum(num01, num02));
        } catch(ArithmeticException except){
            System.out.println("Erro! Não é possivel dividir por zero");
        }
        
        read_value.close();
    }
}
