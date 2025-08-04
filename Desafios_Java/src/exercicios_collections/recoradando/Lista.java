package exercicios_collections.recoradando;

import java.util.Iterator;

public class Lista<T> implements Iterable<T>{
    private T[] itens = (T[]) new Object[10];
    private int contador;

    //Adicionando itens dentro da  na lista
    public void adicionar(T item){
        if (contador == itens.length) {
            T[] novoItens = (T[]) new Object [itens.length * 2];
        }
        this.itens[contador++] = item;
    }
    //Obtendo um elemento através do índice
    public T obter(int indice){
        if (indice < 0 || indice > itens.length ) {
            throw new IndexOutOfBoundsException("Índice fora do tamanho da lista");
        }
        return itens[indice];
    }
    @Override
    public Iterator<T> iterator() {
        return new IteradorLista(this);
    }
    
    private class  IteradorLista implements Iterator<T>{
        private Lista<T> lista;
        private int indice;

        public IteradorLista(Lista<T> lista){
            this.lista = lista;
        }
        @Override
        public boolean hasNext(){
            return (indice < lista.contador);
        }

        @Override
        public T next(){
            return lista.itens[indice++];
        }
    }
    
}