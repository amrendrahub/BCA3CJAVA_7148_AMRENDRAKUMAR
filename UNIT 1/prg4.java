// 4.WRITE A JAVA PROGRAM TO PERFORM DIFFERENT ARITHMETIC OPERATION USING (COMMAND LINE ARGS).

import java.util.Scanner;

public class prg4{
	
    public static void main(String args[]) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}
