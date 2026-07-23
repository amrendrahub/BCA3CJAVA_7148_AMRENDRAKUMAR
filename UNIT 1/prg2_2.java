//2.2 Write a java program to get name from user and display on screen.

import java.util.Scanner;
	public class prg2_2{
		public static void main(String args[]){
		
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the name:");
			String name=scn.nextLine();
			
			System.out.println("Enter the age:");
			String age=scn.nextLine();
                        
            System.out.println("Enter the mobileno:");
			String mn=scn.nextLine();
                        
            System.out.println("Enter the email:");
			String email=scn.nextLine();
                       
            System.out.println("Enter the city:");
			String city=scn.nextLine();

            scn.close();
			
			System.out.println("Entered name: " + name);
			System.out.println("Entered age: " + age);
            System.out.println("Entered mobileno: " + mn);
            System.out.println("Entered email: " + email);
            System.out.println("Entered city: " + city);
			
  }
}