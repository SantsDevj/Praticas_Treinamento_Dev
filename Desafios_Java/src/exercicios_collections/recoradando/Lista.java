package exercicios_collections.recoradando;

import java.util.Iterator;

public class Lista<T extends Number>  implements Iterable<T>{
    private T[] itens_lista;
    private int contador;

    //Construtor para inicializar a capacidade da lista
    public Lista(int cap_lista){
        this.itens_lista = (T[]) new Object[cap_lista];
    }

    //Adicionar elemento sobre a lista
    public void adicionar(T elemento){
        if (contador == itens_lista.length) {
            itens_lista[contador++] = elemento;
        }
    }
    //Obter o elemento da Lista
    public T obter(int indice){
        return itens_lista[indice];
    }

    @Override
    public Iterator<T> iterator() {
        return ListaIterador(this);
    }

    private class ListaIterador implements iterator<T>{
        private Lista<T> lista;
        private int indice;

        public ListaIterador(Lista<T> lista){
            this.lista = lista;
        }
        
        @Override
        public boolean hasNext(){
            return (indice < lista.contador);
        }

        @Override
        public T next(){
            return lista.itens_lista[indice++];
        }
    }

}
