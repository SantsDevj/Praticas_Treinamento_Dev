package exception_excercicios;

public class Exercicio07 {
    public static void calcularOPeracao(double a, double b, String operacao){
        try {
            if (operacao == "Soma") {
            double soma = a + b;
            System.out.println(soma);
        } else if (operacao == "Subtrair") {
            double sub = a - b;
            System.out.println(sub);
        } else {
            if (operacao == "Multiplicar") {
                double multi = a * b;
                System.out.println(multi);
            } else{
                if (operacao == "Dividir") {
                    try {
                        double div = a / b;
                        System.out.println(div);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro matemático de divisão");
                    }
                }
            }
        }    
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Operação desconhecida");
        }
         
    }
    public static void main(String[] args) {
        String operacao = "Dividir";
        double num1 = 12;
        double num2 = 0;    
        calcularOPeracao(num1, num2, operacao);
    }
}
