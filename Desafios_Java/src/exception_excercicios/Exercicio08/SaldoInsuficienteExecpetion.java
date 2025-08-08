package exception_excercicios.Exercicio08;

public class SaldoInsuficienteExecpetion extends RuntimeException{
    private String msg;
    public SaldoInsuficienteExecpetion(String s){
        this.msg = s;
    }
}
