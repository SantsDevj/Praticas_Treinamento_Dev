public abstract class Funcionario{
    protected String nome;
    protected double salario;

    //Getters e Setters
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //salario
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos da classe
    public double calcularBonus(){
        return this.salario * (10/100);
    }
}