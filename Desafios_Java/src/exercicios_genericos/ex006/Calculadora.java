package exercicios_genericos.ex006;

public class Calculadora<T extends Number> {
    private T num01;
    private T num02;
    public Calculadora(T num01, T num02){
        this.num01 = num01;
        this.num02 = num02;
    }
    public double somar(){
        double value1 = this.num01.doubleValue();
        double value2 = this.num02.doubleValue();
        double resultado = value1 + value2;
        return resultado;
    }
    public double subtrarir(){
        double value1 = this.num01.doubleValue();
        double value2 = this.num02.doubleValue();
        double resultado = value1 - value2;
        return resultado;
    }
    public double multiplicar(){
        double value1 = this.num01.doubleValue();
        double value2 = this.num02.doubleValue();
        double resultado = value1 * value2;
        return resultado;
    }
    public double dividir(){
        double value1 = this.num01.doubleValue();
        double value2 = this.num02.doubleValue();
        if (value2 == 0) {
            throw new IllegalArgumentException("É impossivel dividir um número por zero! Por favor, tente novamente!");
        }
        double resultado = value1 / value2;
        return resultado;
    }
}
