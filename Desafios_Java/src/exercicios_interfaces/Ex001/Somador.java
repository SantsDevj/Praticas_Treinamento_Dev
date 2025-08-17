package exercicios_interfaces.Ex001;

public class Somador implements Calculadora{

    @Override
    public int calcular(int a, int b) {
        int soma = a + b;
        return soma;
    }
    
}
