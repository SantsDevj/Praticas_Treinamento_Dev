package exercicios_genericos.ex006;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora<Integer> calc1 = new Calculadora<Integer>(12, 23);
        System.out.println(calc1.somar());
        System.out.println(calc1.subtrarir());
        System.out.println(calc1.multiplicar());
        System.out.println(calc1.dividir());
    }
}
