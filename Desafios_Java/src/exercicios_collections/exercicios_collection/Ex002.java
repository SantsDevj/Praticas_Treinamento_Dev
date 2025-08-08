package exercicios_collections.exercicios_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        System.out.println("Insira as suas cinco notas:");
        for (int i = 0; i < 5; i++) {
            notas.add(read.nextInt());  
        }
        //Imprimindo as notas adicionadas na lista
        System.out.print("Notas adicionadas pelo usuário: ");
        System.out.println(notas);
        //calculando a média e a soma
        int soma = 0; //Inicializando a variável para soma
        for (Integer notas_alunos : notas) {
            soma += notas_alunos;
        }
        System.out.printf("A soma de todas as notas é igual à %d e a média aritmética é igual à  %d!", soma, (soma/notas.size()));
        read.close();
    }
}
