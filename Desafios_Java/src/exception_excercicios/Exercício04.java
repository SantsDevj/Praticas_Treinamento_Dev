package exception_excercicios;

import java.util.Scanner;

public class Exercício04 {
    public static void covertStringtoInteger(String string){
        try {
            if (string.length() <= 3) {
                int converter = Integer.parseInt(string);
                System.out.println("String convertido para integer: " + string);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string não pode ser convertida para integer");
        }
    }
    public static void main(String[] args) {
        //Converter um Integer para String
        Scanner scan = new Scanner(System.in);
        System.out.println("CONVERSOR DE STRING PARA INTEGER");
        System.out.print("Insira apenas um caracter:    ");
        String umaString = scan.next();
        //Converter uma String para Integer
        covertStringtoInteger(umaString);
    }
}
