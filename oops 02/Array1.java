package oops;

public class Array1 {
public static void main(String[] args) {
	//int a = 100,200,300,400;//Type mismatch: cannot convert from int[] to int
	int a[] = {100,200,300,400};
  //             0  1   2   3
	System.out.println(a[a.length-1]);
	System.out.println("Array values:");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
}
}
