package controlFlowStatements;

public class ReverseNumberTest {
public static void main(String[] args) {
	ReverseNumber obj = new ReverseNumber();
	int n=obj.scanNvalue();
	int rev=obj.getReverseOfNumber(n);
	obj.displayReverse(n, rev);
	boolean status=obj.isPalindrome(n, rev);
	obj.displayPalindromeOrNot(status);
	
}
}
