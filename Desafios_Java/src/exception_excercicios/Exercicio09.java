package exception_excercicios;

public class Exercicio09 {
    public void metodoA(){
        try {
            metodoB(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public void metodoB(String string) throws NullPointerException{
        if (string == null) {
            throw new NullPointerException();
        }
    }
}
