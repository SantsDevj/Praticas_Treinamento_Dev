package exercicios_genericos.ex002;

public class MainClass {
    public static void main(String[] args) {
        Par<Integer, String> p1 = new Par<Integer, String>(10, "12");

        Par<String, Double> p2 = new Par<String, Double>("1", (double) 4);
        
        //Imprimindo os valores do p1
        System.out.println("Imprimindo o primeiro par");
        System.out.println(p1.getChave());
        System.out.println(p1.getValor());
        
        //Imprimindo os valores de p2
        System.out.println("Imprimindo o segundo par");
        System.out.println(p2.getChave());
        System.out.println(p2.getValor());
    }
}
