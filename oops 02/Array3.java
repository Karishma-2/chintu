package oops;

import java.util.Scanner;

public class Array3 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter rows and cols");
	int rows=scan.nextInt(),cols=scan.nextInt();
	
	int a[][]= new int[rows][cols];
	
	System.out.println("Enter values");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			a[i][j]=scan.nextInt();
		}
	}
	
	System.out.println("Array values");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
	
}
}
