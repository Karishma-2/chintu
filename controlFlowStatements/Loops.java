package controlFlowStatements;

import java.util.Scanner;

public class Loops {
	Scanner scan;
	public Loops()
	{
		 scan = new Scanner(System.in);
	}
	
	
public void displayNaturalNumbersUsingWhileLoop()
{
	
	System.out.println("Enter n and max value");
	int n=scan.nextInt(),max=scan.nextInt();
	System.out.println("Using While");
	while(n<=max)
	{
		System.out.println(n);
		n++;
	}
}

public void displayNaturalNumbersUsingDoWhileLoop()
{
	
	System.out.println("Enter n and max value");
	int n=scan.nextInt(),max=scan.nextInt();
	System.out.println("Using Do While");
	do
	{
		System.out.println(n);
		n++;
	}while(n<=max);
}

public void displayNaturalNumbersUsingForLoop()
{
	
	System.out.println("Enter n and max value");
	int n1=scan.nextInt(),max=scan.nextInt();
	System.out.println("Using For");
	for(int n=n1;n<=max;n++) {
		System.out.println(n);
	}
	
}
}
//The method While(boolean) is undefined for the type Loops
//Type mismatch: cannot convert from int to boolean
//Unreachable code
/*
 syntax: while loop
 
 initialization;
 while(condition)
 {
 logic;
 updation;
 }
 
 
 syntax: do while loop
 initialization;
 do
 {
 logic;
 updation;
 }while(condition);
 
 for(initialization;condition;updation)
 {
 logic;
 }
 
 */
