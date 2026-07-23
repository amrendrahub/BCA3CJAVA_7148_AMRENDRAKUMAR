// 5. WRITE A JAVA PROGRAM TO GET A DIFFERENT VALUES FROM USER AT RUNTIME USING SCANNER.

import java.util.Scanner;

public class prg5{
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter your name: ");
        String name = input.nextLine();
		
        System.out.print("Enter your Course: ");
        String course = input.nextLine();
		
        System.out.print("Enter batch: ");
        String div = input.nextLine();
         
        System.out.print("Enter class: ");
        String cl = input.nextLine();
		
        System.out.print("Enter roll: ");
        int roll = input.nextInt();
        
        System.out.println(name);
   	    System.out.println(course);
	    System.out.println(div);
	    System.out.println(cl);
	    System.out.println(roll);
	 
	}
}
