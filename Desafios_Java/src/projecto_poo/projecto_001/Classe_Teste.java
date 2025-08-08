package projecto_poo.projecto_001;

import java.util.Scanner;

public class Classe_Teste {
    public static void main(String[] args) {
        //Importando as bibliotecas necessárias para este projecto: Scanner, .
        Scanner read = new Scanner(System.in);
        System.out.println("--------------------\n| BIBLIOTECA SAED |\n--------------------");
        //navegagr pela área dos membros ou área dos autores
        int ops = 0; //Inicializando esta variável para que use no bloco "do"
        do{
            System.out.println("Escolha uma das opções:");
            String[] opcs = {"1.Ir na área de Autores", "2.Ir na área de Membros"};
            for(String opcao: opcs){
                System.out.println(opcao);
            }
            ops = read.nextInt();
            if (ops > 2) {
                System.out.println("OPção inválida! Tente novamente");
            }

        }while(ops > 2);
        switch (ops) {
            case 1:
                System.out.println("--------------------\n| BEM-VINDO A ÁREA DE AUTORES |\n--------------------");
                System.out.println("Escolha uma das opções:");
                System.out.println("1.Registrar Livros.\n2.Ver Livros Registrados.");
                int ops2 = read.nextInt();
                switch (ops2) {
                    case 1:
                    //Inserindo os dados dos livros
                        System.out.println("Insira o nome do autor:");
                        String autor =  read.nextLine();
                        System.out.println("Insira o título do livro:");
                        String titulo =  read.nextLine();
                        System.out.println("Insira o isbn:");
                        String isbn =  read.nextLine();
                        System.out.println("Insira o nome do autor:");
                        int ano_pub =  read.nextInt();
                        //Instânciando a classe Livro
                        Livro livro = new Livro(autor, titulo, isbn, ano_pub);

                        System.out.println("Exibindo as informações do livro inserido ");
                        break;
                    case 2:

                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                break;
            case 2:
                System.out.println("--------------------\n| BEM-VINDO A ÁREA DE MEMBROS |\n--------------------");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        read.close();
    }
    
}
