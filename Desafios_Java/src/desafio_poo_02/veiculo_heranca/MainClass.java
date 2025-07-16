package desafio_poo_02.veiculo_heranca;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("SUBSCREVER O SEU CARRO");
        System.out.println("Escolha uma das opções.");
        String[] opcoes = {"1.Carro", "2.Mota"};
        for (String string : opcoes) {
            System.out.println(string);
        }
        int opcs = read.nextInt();

        //Seleccionando as opções
        switch (opcs) {
            case 1:
                //instanciando a Classe Carro
                Carro c1 = new Carro();
                System.out.println("Qual é a marca do seu carro");
                String marca = read.nextLine();
                System.out.println("Em que ano foi fabricado");
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida!");
            break;
        }
    }
}
