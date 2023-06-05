package oops;

public class Test {
public static void main(String[] args) {
	/*Calculator c1 = new Calculator();
	c1.add(10, 10);
	c1.sub(10, 10);*/
	/*NewCalculator c2 = new NewCalculator();
	c2.mul(10, 10);
	c2.add(10, 20);
	c2.sub(13, 13);*/
	
	/*SmartCalculator c3 = new SmartCalculator();
	c3.mul(10, 10);
	c3.add(10, 20);
	c3.sub(13, 13);
	c3.square(10);*/
	
	Calculator c3 = new SmartCalculator();
	c3.add(10, 10); //Compile time
	c3.sub(10, 10);//Run time
	
}
}
