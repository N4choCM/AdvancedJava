package Activities_12_13_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(calculatesFactorial(5));
        System.out.println(recommendClothe());
    }

    /**
     * Method that returns an Integer with the factorial of the number given as a parameter.
     * @param iNumber Integer from which the factorial is calculated.
     * @return Result of the factorial of the Integer given as a parameter.
     * @since 13/08/2022
     * @author Nacho Campos Martí
     */
    public static int calculatesFactorial(int iNumber){
        int iResult = 1;

        for(int i=1; i<= iNumber; i++){
            iResult *= i;
        }

        return iResult;
    }

    /**
     * Method that recommends which kind of clothe the user might wear depending on the temperature.
     * First, the user is asked about the current temperature (this number is kept as a String).
     * Second, the given temperature is parsed to process it as an Integer.
     * Eventually, a ternary operator is used to suggest the type of clothing as a String.
     * @return String with the type of clothing the user might wear depending on the temperature.
     * @throws IOException Error that might be produced if the user doesn't give a temperature or does it incorrectly.
     * @since 13/08/2022
     * @author Nacho Campos Martí
     */
    public static String recommendClothe() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the current temperature: ");
        String sTemperature = br.readLine();
        int iTemperature = Integer.parseInt(sTemperature);
        String sResult = iTemperature > 20 ? "It's hot! Wear your short trousers and short sleeves T-shirt!"
                : iTemperature == 20 ? "What a lovely day! Wear your long trousers and short sleeves T-shirt!"
                : "It's cold! Wear your warmest jumper!";
        return sResult;
    }
}
