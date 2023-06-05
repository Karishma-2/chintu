package basicPrograms;
public class Typecasting1 {
public static void main(String[] args) {
	//int to float possible
	/*int x = 30;
	float y = x;
	System.out.println("X = "+x+" Y = "+y);*/
	
	//float to int not possible doing typecasting
	float x = 30.2f;
	int y =(int) x;
	System.out.println("X = "+x+" Y = "+y);
}
}
