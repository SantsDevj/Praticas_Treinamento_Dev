package exercicios_interfaces.try_pratica;

public class Multiplicar implements Calculadora{
    @Override
    public double calcular(double a, double b) {
        double resultado = a * b;
        return resultado;
    }
    
}
