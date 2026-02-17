package encapsulation;

public class Bank {
	
	public int bank_Acoount=12345;
	private int pin =565;
	private double balance=100000;
	// getter method for bank_account varible
	public int getBank_Acoount() {
		return bank_Acoount;
	}
	// setter method for bank_account varible
	
	public void setBank_Acoount(int bank_Acoount) {
		this.bank_Acoount = bank_Acoount;
	}
	public void withdrow(int acc,int pincode,int withd)
	{
		if(acc==bank_Acoount && pincode==pin)
			
		{
			System.out.println("login successfull");
			
			if(withd>balance)
			{
				System.out.println("Insuficient balance");
				
			}
			else
			{
				balance=balance-withd;
				System.out.println("Balance is "+balance);
			}
			
		}
		else
		{
			System.out.println("Unauthorized user");
		}
	}
	public void changepin(int acc,int oldpin,int newpin)
	{
		if(acc==bank_Acoount && oldpin==pin)
		{
			pin=newpin;
			System.out.println("pin chnaged ");
			
		}
		else
		{
			System.out.println("pin not matched");
		}
	}
	public double getBalance() {
		return balance;
	}
	
	

}
