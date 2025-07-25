package exercicios_genericos.ex003;

public class ClassePrincipal {
    public static void imprimirLista(List<Integer> lista){
        for (int object : lista) {
            System.out.print("[");
            System.out.print(object);
            System.out.print("]");
        }
    }
    public static void main(String[] args) {
        List<Integer> lista = new List<Integer>(10);
        
        lista.adicionar(14);
        lista.adicionar(16);
        imprimirLista(lista);
    }
}
