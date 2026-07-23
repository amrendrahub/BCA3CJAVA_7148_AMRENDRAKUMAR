//  3.WRITE A JAVA PROGRAM TO GET PERSONAL INFORMATION FROM USER AND DISPLAY ON SCREEN.

import java.util.Scanner;

	public class test{		
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
