package controlFlowStatements;
public class Bank {
private float accountBalance=100000;
private String customerId="1147888999";
private String password="livetech";

public float getBalance(String customerId,String password )
{
	if(this.customerId.equals(customerId) && this.password.equals(password))
      return accountBalance;
	else
		return -1;
}

public boolean setBalance(String customerId,String password,float amount )
{
	if(this.customerId.equals(customerId) && this.password.equals(password))
	{
		accountBalance =accountBalance+amount;
		return true;
	}
	else
		return false;
}
	
}
