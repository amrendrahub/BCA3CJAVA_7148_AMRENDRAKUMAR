// 7_1. Write a java progaram to use if & else condition.


import java.util.Scanner;

public class prg7_2{
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("please enter your examScore");
	    int examScore = input.nextInt();
		
		if  (examScore>=70){
			
			System.out.println("result : you passed.");
		} else {
			
			System.out.println("reslut : Sorry you fail.");
		}
		
		System.out.println("Execution complete.");
	}
}