package Activities_19_20_21.Final;

public class Main {
    /* No sé cómo se utiliza Args ni para qué sirve y no me queda claro ni al ver el vídeo de la clase
        ni al buscar info en internet.

        String sText1 = args[0];
        String sText2 = args[1];
        System.out.println(sText1);
        System.out.println(sText2);  */

    public static void main(String[] args) {
        System.out.println(sumAll(2, 3));
        System.out.println(sumAll(2, 3, 4));
    }

    public static int sumAll(int... iNumbers) {

        int iResult = 0;
        for (int i = 0; i < iNumbers.length; i++) {
            iResult += iNumbers[i];
        }
        return iResult;
    }
}
