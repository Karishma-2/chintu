package oops;

import java.util.Scanner;

public class Array2 {
public static void main(String[] args) {
	//Step1: scan size
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size");
	int size=scan.nextInt();
	//Step2: Allocate Memory
	// datatype arrayname[] = new datatype[size];
	    int a[] = new int[size];
	//Step3: scan array values
	    System.out.println("Enter array values : ");
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=scan.nextInt();
	    }
	 //Display array
	    System.out.println("Array values: ");
	    int i=0;
	    while(i<a.length)
	    {
	    	System.out.println(a[i]);
	    	i++;
	    }
	//Enhanced for loop : for each loop
	    System.out.println("Array using for each");
	    for(int x : a)
	    {
	    	System.out.println(x);
	    }
}
}
 