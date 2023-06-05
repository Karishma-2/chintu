package controlFlowStatements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeriesOfPalindromeTest {
	@Test
public  void main() {
	try {
	SeriesOfPalindrome obj = new SeriesOfPalindrome();
	int count=obj.displaySeriesOfPalindrome();
	obj.display(count);
	Assert.assertTrue(false);
	}
	catch(Throwable e)
	{
		System.out.println("Welcome");
	}
}
}
