package desafio_poo_01.animal_heranca;

public class Gato extends Animal{
    @Override
    public void fazerBarrulo(){
        System.out.println("Miau Miau");
    }
    public void infomacao(){
        System.out.println("Nome do gato: " + getNome());
        System.out.println("Idade do gato: " + getIdade());
    }
}
