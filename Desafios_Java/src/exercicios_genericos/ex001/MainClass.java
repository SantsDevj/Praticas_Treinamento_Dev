package exercicios_genericos.ex001;

public class MainClass {
    public static void main(String[] args) {
        Caixa<String> c1 = new Caixa<>(10);
        c1.add("Jhon");


        Caixa<Integer> c2 = new Caixa<>(10);

        Caixa<User> c3 = new Caixa<>(10);
        
    }
}
