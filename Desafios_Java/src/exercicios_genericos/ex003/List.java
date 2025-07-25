package exercicios_genericos.ex003;

import java.util.Iterator;

public class List<T> implements Iterable<T>{
    private T[] itens;
    private int contador = 0;

    //Constructor para inicializar a quantidade de Itens
    public List(int capacidade){
        this.itens = (T[]) new Object[capacidade];
    }

    //Adicionar elemento na lista
    public void adicionar(T elemento){
        itens[contador++] = elemento;
    }
    //Remover um elemnto na lista
    public T obter(int indice){
        if (indice < 0 || indice > itens.length) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");
        }
        return itens[indice];
    }

    //fazer com que se percora a lista
    @Override
    public Iterator<T> iterator() {
        return new imprimirLista(this);
    }

    private class imprimirLista implements Iterator<T>{
        private List<T> lista;
        private int indice;

        public imprimirLista(List<T> lista){
            this.lista = lista;
        }

        @Override
        public boolean hasNext() {
            return (indice < lista.contador);
        }

        @Override
        public T next() {
            return lista.itens[indice++];
        }
    }
}
