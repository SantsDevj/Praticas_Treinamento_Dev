package desafio_poo_01.formas_geometricas;

public final class Circulo extends Formas{
    //Atributos
    private double raio;

    //Getters e Setters
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    //calcular a área do círculo
    @Override
    public double calcularArea(){
        double ac;
        return ac = Math.PI * this.raio;
    }
}
