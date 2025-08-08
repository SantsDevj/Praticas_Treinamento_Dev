package exercicios_collections.exercicios_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        //Criando um progranma de lista de convidados
        //Importando as bibliotecas necessárias para este programa
        Scanner lervalues = new Scanner(System.in);
        List<String> lista_convidados = new ArrayList<>();
        //Adicionando nomes na lista:
        System.out.println("Adicione os nomes para lista de convidados:");
        for (int i = 0; i < 3; i++) {
            lista_convidados.add(lervalues.nextLine());
        }
        System.out.print("Nomes adicionados na lista de convidados: " + lista_convidados);

        System.out.println("\nRemovendo o usuário do primeiro índice:");
        lista_convidados.remove(0);
        System.out.println("Lista com o usuário do primeiro índice removido: " + lista_convidados);

        System.out.println("Adicionando um usuário para preencher a lista");
        lista_convidados.add(0, "João");
        System.out.println("Nova lista actualizada: " + lista_convidados);
        lervalues.close();
    }
}
