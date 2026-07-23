
//2 Write a java program to get name from user and display on screen.

import java.util.Scanner;
	public class prg2_1{
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the string:");
			String Userstr=scn.nextLine();
			
			System.out.println("Enter the integer:");
			int Userinteger=scn.nextInt();
			
			scn.close();
			
			System.out.println("Entered string: " + Userstr);
			System.out.println("Entered integer: " + Userinteger);
   
        }
}    