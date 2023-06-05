package controlFlowStatements;

public class SeriesOfPalindrome extends ReverseNumber {
private int lw,up;
	private void scanRange()
	{
		System.out.println("Enter lw,up value");
		lw=scan.nextInt();
		up=scan.nextInt();
	}
	
	public int displaySeriesOfPalindrome()
	{
		this.scanRange();
		int count=0;
		for(int i=lw;i<=up;i++)
		{
			int rev=this.getReverseOfNumber(i);
			boolean status=this.isPalindrome(i, rev);
			if(status)
				count++;
			this.displayPalindromeNumber(status,rev);
		}
		return count;
	}
	
	public void display(int count)
	{
		System.out.println("In a Given Range i.e "+lw+" "+up+" No.of palindrome : "+count);
	}
	
}
