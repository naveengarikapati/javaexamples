package inheritance;

public class Account {
	 String holderName;
     int age;
     double balance;
     
     Account(String holderName,double balance, int age) {
    	 this.holderName=holderName;
    	 this.balance=balance;
    	 this.age=age;
    	 
     }
    	 
     Account() {
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


}

   



