package oops;

public class ReverseArray  extends CommonMethods{

	public int[] getReverseArray(int a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++,j--)
		{
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		return a;
	}
	
	public char[] getReverseOfString(char a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++,j--)
		{
			char temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
	/*	int size=obj.scanArraySize();
		int a[]=obj.getArrayValues(size);
		obj.displayArray(a,"Before Reverse of array : ");
		int rev[]=obj.getReverseArray(a);
		obj.displayArray(rev,"After Reverse of array : ");
	*/
		String str1=obj.scanString();
		char a[]=obj.convertStringToCharArray(str1);
		char rev[]=obj.getReverseOfString(a);
		String str2=obj.convertCharArrayToString(rev);
		obj.displayString("Before Reverse : ", str1);
		obj.displayString("After Reverse : ", str2);
		boolean status= obj.isPalindromeString(str1, str2);
		obj.displayPalindromeOrNot(status);

	
	}
}
