package controlFlowStatements;

import java.util.Scanner;

public class Patterns {

	public void displayNumberPattern(int rows ,int cols)
	{
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void displayNumberPattern(int rows)
	{
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public void displayNumberPattern2(int rows)
	{
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void displayNumberPattern3(int rows)
	{
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int space=rows;space>i;space--)
				System.out.print("* * ");
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public void displayNumberPattern4(int rows)
	{
		
		for(int i=rows;i>=1;i--)
		{
			for(int space=rows;space>i;space--)
				System.out.print("  ");
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void displayNumberPattern5(int rows ,int cols)
	{
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				if(i==1||i==rows||j==1||j==cols)
				System.out.print("* ");
				else
					System.out.print("😊");
			}
			System.out.println();
		}
	}
	
}
