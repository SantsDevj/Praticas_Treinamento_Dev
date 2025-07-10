package exercicios_genericos.ex001;

public class Caixa <T>{
    private T[] itens;
    private int cont;

    //Constructor
    public Caixa(int iniCap){
        itens = (T[]) new Object[iniCap];
    }
    public void add(T item){
        if (cont == itens.length) {
            itens[cont++] = item;
        }
    }
    //Obter o objecto armazenado
    public T getItem(int index){
        if (index < 0 || index >= itens.length) {
            throw new IndexOutOfBoundsException();
        }
        return itens[index];
    }
}
