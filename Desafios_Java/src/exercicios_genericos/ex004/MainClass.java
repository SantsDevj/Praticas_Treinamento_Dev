package exercicios_genericos.ex004;

public class MainClass {
    public static void main(String[] args) {
        Trocador<Integer> tr1 = new Trocador<Integer>(12, 11);  
        tr1.trocarValores();
        System.out.println(tr1.getValor1());
        System.out.println(tr1.getValor2());
        
    }
}
