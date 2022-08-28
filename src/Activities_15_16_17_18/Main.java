package Activities_15_16_17_18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(divide(5, 0));
        String[] sNames = {"Nacho", "Laura", "Alejandra"};
        goThroughArray(sNames);
        readFile();
    }

    /**
     * Method which divides two integers.
     * @param iNum1 Dividend of the division.
     * @param iNum2 Divisor of the division.
     * @return Result of the division
     * @throws ArithmeticException Cannot divide by zero.
     * @since 14/08/2022
     * @author Nacho Campos Martí
     */
    public static int divide(int iNum1, int iNum2) throws ArithmeticException{
        if(iNum2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return iNum1/iNum2;
    }

    /**
     * Method which prints the elements of a String array.
     * @param sArray Collection of names
     * @throws ArrayIndexOutOfBoundsException You tried to print a greater array index.
     * @since 14/08/2022
     * @author Nacho Campos Martí
     */
    public static void goThroughArray(String[] sArray) throws ArrayIndexOutOfBoundsException{
        try {
            for(int i = 0; i <= sArray.length; i++){
                System.out.println(sArray[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You tried to print a greater array index. Try to reduce the for statement condition");
        }
    }

    /**
     * Method which reads a file.
     * @throws FileNotFoundException
     * @throws IOException
     * @since 14/08/2022
     * @author Nacho Campos Martí
     */
    public static void readFile() throws FileNotFoundException, IOException {
        String sFileData;
        FileReader f = new FileReader("text.txt");
        BufferedReader b = new BufferedReader(f);
        while((sFileData = b.readLine())!=null) {
            System.out.println(sFileData);
        }
        b.close();
    }
}
