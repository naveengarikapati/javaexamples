package inheritance;

public class Accountmain {
   public static void main(String args[]) {
	Account accounts[]= new Account[2];
	
	SavingsAccount account1 = new SavingsAccount("ankit",1000,21,"andhrapradesh");
	CurrentAccount account2 = new CurrentAccount("naveen",2500,24,"madhyapradesh");
	
	accounts[0]=account1;
	accounts[1]=account2;
	for(Account account:accounts) {
		String holdername=account.getHoldername();
		double balance=account.getBalance();
		int age=account.getAge();
		System.out.println(" name is " + holdername + " age is " + age + " balance is " + balance);
		
		boolean isSA = account instanceof SavingsAccount;
		if(isSA) {
			SavingsAccount SA = (SavingsAccount) account;
			System.out.println("houseaddress=" + SA.getHouseaddress());
		}
		boolean isCA = account instanceof CurrentAccount;
		if(isCA) {
			
			CurrentAccount CA = (CurrentAccount) account;
			System.out.println("officeaddress=" + CA.getOfficeaddress());
		
		}
		
	}
	
}
}
