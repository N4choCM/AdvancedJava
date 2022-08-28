package Activities_19_20_21.Original;

public class Main {
    public static void main(String[] args) {
        /* No sé cómo se utiliza Args ni para qué sirve y no me queda claro ni al ver el vídeo de la clase
        ni al buscar info en internet.

        String sText1 = args[0];
        String sText2 = args[1];
        System.out.println(sText1);
        System.out.println(sText2);  */

        System.out.println(sumTwoNumbers(2, 3));
        System.out.println(sumThreeNumbers(2, 3, 4));

    }

    public static int sumTwoNumbers(int a, int b){
        return a + b;
    }

    public static int sumThreeNumbers(int a, int b, int c){
        return a + b + c;
    }
}
