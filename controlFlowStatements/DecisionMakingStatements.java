package controlFlowStatements;

import java.util.Scanner;

public class DecisionMakingStatements {

	public Scanner scan;
	
	DecisionMakingStatements()
	{
		System.out.println("Hello Im Constructor without parameters");
		scan = new Scanner(System.in);
	}
	
	
	DecisionMakingStatements(Scanner scan)
	{
		System.out.println("Hello Im Constructor with parameter");
		this.scan=scan;
	}
	
	
	public void checkAisGreater()
	{
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		if(a>b)
		{
			System.out.println("A is greater");
		}
	}
	
	public void checkAOrBisGreater()
	{
		
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is Greater");
		}
	}
	
	public void checkAOrBisGreaterOrEqual()
	{
		
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else if(b>a)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("A B values are Equal");
		}
	}
	
	
	public void game()
	{
		System.out.println("Enter Level-1 score");
		int score=scan.nextInt();
		if(score>=2000)
		{
			System.out.println("Congratulations u have unlocked Level-2");
			System.out.println("Enter Level-2 score");
			 score=scan.nextInt();
			 
			 if(score>=4000)
			 {
					System.out.println("Congratulations u have unlocked Level-3");
					System.out.println("Enter Level-3 score");
					 score=scan.nextInt();
					 if(score>=6000) {
						 System.out.println("Congratualtions u won the Game");
					 }
					 else {
						 System.out.println("ur runner up");
			             }
			 }
			 else
			 {
				 System.out.println("Nice attempt try next time");
			 }
		}
		else
		{
			System.out.println("Very bad play no worries try next time");
		}
		
	}
	
	public void calculatorUsingIf()
	{
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		System.out.println("Select Operator:");
		char operator=scan.next().charAt(0);
		if(operator=='+')
			System.out.println("Sum = "+(a+b));
		else  if(operator=='-')
			System.out.println("Sub = "+(a-b));
		else if(operator=='*')
			System.out.println("Mul = "+(a*b));
		else
			System.out.println("Invalid Operator");
		
	}
	
	public void calculatorUsingSwitch()
	{
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		System.out.println("Select Operator:");
		char operator=scan.next().charAt(0);
			switch(operator)
			{
		    default: System.out.println("Invalid Operator");
			 break;
		    case '+':System.out.println("Sum = "+(a+b));
			break;
			case '-':System.out.println("Sub = "+(a-b));
			break;
			case '*':System.out.println("Mul = "+(a*b));
			break;
			}
	}
	
	
}











