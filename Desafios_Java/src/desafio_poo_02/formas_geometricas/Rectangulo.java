package desafio_poo_01.formas_geometricas;

public final class Rectangulo extends Formas{
    private float largura;
    private float altura;

    //Getters e Setters
    //Altura
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //largura
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    //Calcular a área do Rectângullo+
    @Override
    public double calcularArea(){
        float areaR;
        return areaR = this.largura * this.altura;
    }
}
