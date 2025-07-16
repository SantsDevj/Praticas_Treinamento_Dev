package desafio_poo_02.animal_heranca;

public class Cao extends Animal{
    //Sobescrevendo o método
    @Override
    public void fazerBarrulo(){
        System.out.println("Au Au Au!");
    }
    public void infomacao(){
        System.out.println("Nome do cão: " + getNome());
        System.out.println("Idade do cão: " + getIdade());
    }
}
