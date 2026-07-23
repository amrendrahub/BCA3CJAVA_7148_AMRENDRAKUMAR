// 7_1. Write a java progaram to use if condition.

import java.util.Scanner;

public class prg7_1{
	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("please enter your Score");
	int examScore = input.nextInt();
				
		if(examScore>=75){
			System.out.println("result : you passed");
		}
	}
}