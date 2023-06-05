package oops;

public class Test1 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.display();
	driver.get();
	driver.click();
	
	
	EdgeDriver driver2 = new EdgeDriver();
	driver2.print();
	driver2.get();
	driver2.click();
}
}
