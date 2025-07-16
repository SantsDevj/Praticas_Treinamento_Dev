package desafio_poo_01.formas_geometricas;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("FORMAS GEOMÉTRICAS");
        System.out.println("Escolha uma das opções:");
        System.out.println("1.Círculo\n2.Rectângulo");
        int opcoes = read.nextInt();

        //Escolhendo uma das opções
        switch (opcoes) {
            case 1:
                //Instânciando a classe Círculo
                Circulo circ = new Circulo();
                System.out.print("Insira o raio de círculo que pretendes:   ");
                double raio = read.nextDouble();
                circ.setRaio(raio);
                System.out.println("Calculando o raio");
                System.out.println(circ.calcularArea());
                break;
            case 2:
                //Instânciando a classe Círculo
                Rectangulo rect = new Rectangulo();
                System.out.print("Insira a altura do rectângulo:   ");
                float alt = read.nextFloat();
                System.out.print("Insira a largura do rectângulo:   ");
                float larg = read.nextFloat();
                rect.setAltura(alt);
                rect.setLargura(larg);
                System.out.println("Calculando a área do triângulo");
                System.out.println(rect.calcularArea());
                break;                
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
