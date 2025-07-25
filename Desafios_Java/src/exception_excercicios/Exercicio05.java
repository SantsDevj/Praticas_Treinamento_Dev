package exception_excercicios;

import java.util.Scanner;

public class Exercicio05{
    public static void divNumeros(int num1, int num2){
        try {
            int div = 0;
            div = num1 / num2;
            System.out.println("A divisão é igual à : " + div);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Bloco finally executado");
        }

    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Realize a operaçao de divisão: ");
        System.out.println("================================");
        //Inserção dos dados
        System.out.print("Insira o primeiro número:   ");
        int num1 = read.nextInt();
        System.out.print("Insira o segundo número:   ");
        int num2 = read.nextInt();
        //Realização do cálculo
        divNumeros(num1, num2);
    }
}