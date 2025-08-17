package exercicios_collections.exercicios_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Ex004 {
    public static void main(String[] args) {
        Collection<String> colecao = new ArrayList<>();

        if (colecao.isEmpty()) {
            System.out.println("Colecção Vazia!");
        }
        colecao.add("Tomate");
        colecao.add("Cebola");
        colecao.add("Alho");

        System.out.println("TAMANHO DA COLECÇÃO: " + colecao.size());

        colecao.clear();
        if (colecao.isEmpty()) {
            System.out.println("Colecção Vazia!");
        }
    }
}
