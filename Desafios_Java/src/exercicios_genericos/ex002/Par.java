package exercicios_genericos.ex002;

public class Par<C, V> {
    private C chave;
    private V valor;

    public Par(C chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }

   

    public C getChave() {
        return chave;
    }
    public V getValor() {
        return valor;
    }
}
