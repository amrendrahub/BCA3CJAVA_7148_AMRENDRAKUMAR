// 6_7.. Loop

import java.util.Scanner;

public class prg6_7{
		
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	
	System.out.print("enter your name");
	String name = scn.nextLine();
	
	System.out.print("enter your number");
   	int a = scn.nextInt();

	int i;
	for(i=0;i<=a;i++){
	  System.out.println(i + name);
	}
	
	}
	
 }
