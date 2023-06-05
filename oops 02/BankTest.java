package oops;

import java.util.Scanner;

public class BankTest {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter bank name");
	String bankname=scan.next();
	Bank b;
	if(bankname.equals("HDFC"))
		b=new HDFC();
	else
		b=new SBI();
	
	b.getFDIntrestRate();
}
}
