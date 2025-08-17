package exception_excercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void definirIdade(int idade) throws IllegalAccessException{
        if (idade > 130 || idade < 0) {
            throw new IllegalAccessException("Idade inválida. Deve estar entre 0 e 130");
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        int idade = read.nextInt();
        try{
            definirIdade(idade);
        } catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }
        read.close();
    }
}
