package exercicios_collections.recoradando;

public class Teste_Classe {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.adicionar(15);
        lista.adicionar(17);
        lista.adicionar(19);
        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }
    
}