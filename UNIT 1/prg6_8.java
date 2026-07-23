// 6_8.. Loop

import java.util.Scanner;

public class prg6_8{
		
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	
	System.out.print("enter your name");
	String name = scn.nextLine();
	
	System.out.print("enter your number");
    int a = scn.nextInt();

	int i=0;
	while(i<=a){
	System.out.println(i+name);
	i++;
	}
	
	}
	
 }
