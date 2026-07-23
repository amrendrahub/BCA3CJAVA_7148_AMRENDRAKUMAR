// 7_3. Write a java progaram to use if, else if, esle condition.


import java.util.Scanner;

public class prg7_3{
	
	public static void main(String [] args){
		
		Scanner input = new  Scanner(System.in);
		System.out.print("please enter your examScore");
	    int examScore = input.nextInt();
		
		if  (examScore>=80){
			System.out.println("result : Very Good.");
			}
			else if (examScore>=65){
			System.out.println("reslut : Good.");
			}
			else {
			System.out.println("reslut : Fail");
			}
		    System.out.println("Execution complete.");
	}
}
