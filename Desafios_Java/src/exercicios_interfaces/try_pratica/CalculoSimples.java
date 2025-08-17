package exercicios_interfaces.try_pratica;

public class CalculoSimples {
    public static void main(String[] args) {
        Multiplicar mult = new Multiplicar();

        System.out.println(mult.calcular(12, 2));
        Calculadora div = (a, b) -> a / b;

        System.out.println(div.calcular(12, 2));
    }
}
