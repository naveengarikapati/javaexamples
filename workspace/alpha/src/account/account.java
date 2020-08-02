package account;

public class account {
     String holderName;
     int age;
     double balance;
     
     account(String holderName,double balance, int age) {
    	 this.holderName=holderName;
    	 this.balance=balance;
    	 this.age=age;
    	 
     }
    	 
     account() {
    	this("",100,21);
    	
     }
     
   String getHoldername() {
	   return holderName;
   }
   
    void setHolderName(String holderName) {
	   this.holderName=holderName;
   }
    int getAge() {
	  return age;
   }
    void setAge(int age) {
	   this.age=age;
   }
    double getBalance() {
	   return balance;
   }
    void setBalance(double balance) {
	   this.balance=balance;
   }
    double getCredit() {
    	return balance;   
    }
     void setCredit(double amount) {
	   balance=balance+amount;
	  }
    double getDebit() {
    	return balance;
    }
    
	void setDebit(double amount) {
		balance=balance-amount;
	}
}

   

