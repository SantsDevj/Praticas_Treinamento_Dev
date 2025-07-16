public class Gerente extends Funcionario{
    //subescrevendo o método calcularBonus
    @Override
    public double calcularBonus(){
        return this.salario * (20/100);
    }
}
