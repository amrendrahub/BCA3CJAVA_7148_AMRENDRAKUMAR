// 6_9.. Loop.

import java.util.Scanner;

 class prg6_9{
		
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	
	System.out.print("enter your name");
	String name = scn.nextLine();
	
	System.out.print("enter your number");
    int a = scn.nextInt();

	int i=0;
	do{
	 System.out.println( i + name);
	 i++;
	}while(i<=a);
	
	}
	
 }
