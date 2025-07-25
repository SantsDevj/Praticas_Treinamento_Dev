package exercicios_genericos.ex004;

public class Trocador<T> {
    private T valor1;
    private T valor2;

    public Trocador(T valor1, T valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T getValor1() {
        return valor1;
    }
    public T getValor2() {
        return valor2;
    }
    //Métodos de troca de valores
    public void trocarValores(){
        this.valor1 = valor2;
        this.valor2 = valor1;
    }
}
