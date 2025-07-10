package desafio_poo_01.animal_heranca;

public class main {
    public static void main(String[] args) {
        Cao dog1 = new Cao();

        dog1.setIdade(10);
        dog1.setNome("Krypto");
        dog1.infomacao();
        dog1.fazerBarrulo();
        
        //Instanciando a Classe gato
        Gato g1 = new Gato();
        g1.setIdade(2);
        g1.setNome("Arnold");
        g1.fazerBarrulo();
        g1.infomacao();
    }
}
