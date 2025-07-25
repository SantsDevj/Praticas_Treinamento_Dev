package exception_excercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static int getElementoAray(int index, int[] nums){
        try {
            return nums[index];   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites do array");
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Adicione dez números nesta lista");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.println("Imprimindo os elementos:");
        System.out.print("[");
        for (int elementos : nums) {
            System.out.print(elementos + ",");
        }
        System.out.println("]");

        System.out.println("BUSCANDO OS ELEMWNTOS");
        System.out.println("Insira os índices, para procurares por um elemento (de 0 à 9)");
        int indic = scan.nextInt();

        System.out.println("Elemento encontrado");
        //Retornando o elemento
        System.out.println(getElementoAray(indic, nums));
    }
}
