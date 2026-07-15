// write a java program to get a name from user and display on display
import java.util.Scanner;
public class userInput{
	public static void main(String args[]){

	Scanner scn= new Scanner(System.in);
	System.out.println("enter a string:");
	String userInputstring = scn.nextLine();

	System.out.println("enter an integer:");
	int userinputInt= scn.nextInt();

	scn.close();
    System.out.println("you entered string:"+ userInputstring);
	System.out.println("you entered integer:"+ userinputInt);
	}
}
