package preparacao_exame;


import java.util.Random;

public class Exerc03 {
    //Este programa conta os números primos numa lista
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random numsal = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsal.nextInt(100);
        }
        int cont = 0;
        boolean ePrimo = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 1) {
                ePrimo = false;
            }
            for(int c = 2; c <= Math.sqrt(nums[i]); c++){
                if (nums[i] % c == 0) {
                    ePrimo = false;
                    break;

                }
            }

            if (ePrimo) {
                System.out.print(nums[i] + ", ");
                cont++;
            }
        }
        System.out.println(cont);
    }
}
