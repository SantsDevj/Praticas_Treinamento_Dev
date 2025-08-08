package exception_excercicios.Exercicio08;

public class ContaBancaria {
    private double saldo;

    //Coonstructor
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    //getters e setters
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método desta classe
    public void sacar(double valorSaque){
        if (valorSaque > getSaldo()) {
            throw new SaldoInsuficienteExecpetion("Saldo Insuficiente para realizar saque");
        } else{
            setSaldo(getSaldo()-valorSaque);
            System.out.println("Valor saqueado: " + valorSaque);
            System.out.println("Saque realizado com sucesso!");
        }
    }
}
