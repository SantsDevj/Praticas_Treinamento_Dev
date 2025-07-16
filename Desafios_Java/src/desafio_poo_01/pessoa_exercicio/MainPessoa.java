package desafio_poo_01.pessoa_exercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        //Chamando a classe pessoa
        Pessoa[] pers = new Pessoa[10];
        //Importando recursos 
        Scanner readvalue = new Scanner(System.in);

        //Início do programa
        System.out.println("--------------------");
        System.out.println("|-----Bem-Vindo-----|");
        System.out.println("--------------------");
        System.out.println("Insira os seus Dados.");
        //Inicializando as variáveis
        String nome =  "";
        int idade = 0;
        System.out.println("Nome:");
        nome = readvalue.next();
        try{
            System.out.println("Idade:");
            idade = readvalue.nextInt();
        } catch(InputMismatchException excep){
            System.out.println("Valor Inválido");
        }
        System.out.println("Em que posição pretendes guardar estes dados? \n De 1 a 10");
        int pos = 0;
        try {
            pos = readvalue.nextInt();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice Inválido");
        }
        pers[pos] = new Pessoa(nome, idade);
        readvalue.close();
        pers[pos].mostrarDetails();
    }
}
