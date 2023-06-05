package controlFlowStatements;

public class BankTest {
public static void main(String[] args) {
	Bank b = new Bank();
	float accountBalance=b.getBalance("1147888999", "livetech");
      if(accountBalance!=-1)
    	  System.out.println("Balance : "+accountBalance);
      else
    	  System.out.println("Invalid CustomerId or Password");
      
      boolean status=b.setBalance("1147888999", "livtech", 1200000);
      if(status)
    	  System.out.println("Amount Credited");
      else
    	  System.out.println("Invalid CustomerId or Password");


}
}
