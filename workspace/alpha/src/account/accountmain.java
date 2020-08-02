package account;

public class accountmain {
public static void main(String[]args) {
	account account1=new account("praneeth",200,21);
	account account2=new account("prasanna",300,21);
	account account3=new account("naveen",500,21);
	account store[]=new account[3];
	store[0]=account1;
	store[1]=account2;
	store[2]=account3;
	account1.setCredit(100);
	account2.setDebit(200);
	
	
	for(account account:store) {
		System.out.println(account.getholderName()+" "+account.getBalance()+" "+account.getAge());
	}
	
}
}
