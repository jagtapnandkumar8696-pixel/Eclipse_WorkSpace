package encapsulation;

public class BankAccount {
	
	

	public static void main(String[] args) {
		Bank b=new Bank();
		
		
	//	b.changepin(12345, 565, 123);
		
		
		b.withdrow(12345, 565, 1000);	
		double b1=b.getBalance();
		System.out.println(b1);
	int j=	b.getBank_Acoount();
	System.out.println(j);
	b.setBank_Acoount(6789);
	System.out.println("Account no is now "+b.bank_Acoount);
	}

}
