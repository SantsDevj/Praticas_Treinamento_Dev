package exercicios_collections.exercicios_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex001 {
    public static void main(String[] args) {
        Collection listaItens = new ArrayList<>();

        Collections.addAll(listaItens, "Leite", "Pão", "Ovos", "Maçã", "Quiejo");

        System.out.println(listaItens);
    }
}
