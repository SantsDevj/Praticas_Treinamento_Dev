package exercicios_genericos.ex005;

public class ElementoArray {
    public static <T> void primeiroElemento(T[] array){
        System.out.println("Imprimindo o primeiro elemento do Array:");
        System.out.println(array[0]);

        if (array.equals( " ") || array.equals(0)) {
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Integer[] array1 = new Integer[3];
        array1[0] = 12;
        array1[1] = 14;
        primeiroElemento(array1);

        String[] array2 = new String[3];
        primeiroElemento(array2);
        array2[0] = "João";
        array2[1] = "Alex";
    }
}
