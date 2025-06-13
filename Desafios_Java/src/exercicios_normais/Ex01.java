package exercicios_normais;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //este programa é um grenciador de itens de compra.
        Scanner read = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("---------------------");
        System.out.println("Lista de Compra");
        System.out.println("---------------------");
        System.out.println("Quantos itens queres adicionar na lista?");
        int quant;
        do{
            quant = read.nextInt();
        }while(quant < 1 );
        
        System.out.println("Adicione Itens na lista:");
        for (int i = 0; i <= quant; i++) {
            lista.add(read.nextLine());

        }
        System.out.println("\nSeleccione uma das opções.");
        String[] opcs = {"1.Mostrar todos os itens", "2.Remover Itens"};
        for (String string : opcs) {
            System.out.println(string);
        }
        int num_opcs = read.nextInt();
        switch (num_opcs) {
            case 1:
                System.out.println("--------------------");
                System.out.println(lista);
                System.out.println("--------------------");
                break;
        
            case 2:
                System.out.println("Qual é o item que pretendes remover?");
                String nome_obj = read.next();

                lista.remove(nome_obj);
                System.out.println("\nNova lista:");
                System.out.println("--------------------");
                System.out.println(lista);
                System.out.println("--------------------");
                break;
            default:
                System.out.println("Opção Inválida");
            break;
        }
        read.close();
    }
    
}