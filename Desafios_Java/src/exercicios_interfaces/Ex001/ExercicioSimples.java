package exercicios_interfaces.Ex001;

public class ExercicioSimples {
    public static void main(String[] args) {
        Somador som1 = new Somador();
        //Exercício 01
        System.out.println(som1.calcular(20, 23));

        //Exercício 02
        Calculadora subtracao = (a, b) -> a - b;
        int resultado = som1.calcular(50, 25);

        System.out.println(subtracao.calcular(25, 45));
        
    }
}
