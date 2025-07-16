package desafio_poo.projecto_biblioteca;

import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
         System.out.println("----------------------------");
        System.out.println("|-----BEM-VINDO A BIBLIOTECA SAED-----|");
        System.out.println("----------------------------");
        //Escolhendo uma área da biblioteca
        System.out.println("ESCOLHA UMA DAS OPÇÕES:");
        String[] opcs = {"1.Autor", "2.Membro", "3.Sobre a Biblioteca", "5.Sair"};
        for (String choice : opcs) {
            System.out.println(choice);
        }
        System.out.println("insira a opção (1-4):");
        int opcoes = read.nextInt();
        switch (opcoes) {
            case 1:
                 System.out.println("----------------------------");
                System.out.println("|-----INFORMAÇÕES DO LIVRO-----|");
                System.out.println("----------------------------");
                
                break;
        
            default:
                break;
        }
        //Instanciando a Classe Livro
        Livro book = new Livro(null, null, 0, false);
    }
}
