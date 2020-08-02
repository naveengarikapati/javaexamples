package Array;

public class Demo {
	String name; // default null

	int age; // 0

	double balance; // false

	/**
	 * constructor is executed immediately after obj creation
	 * 
	 * constructor is only executed once after the obj creation constructor never
	 * returns anything so it has no return type
	 */
	Demo(String name, int age,double balance) {
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	Demo(){
    	this("",21,1000);
    }

	int getAge() {
		return age;
	}

	void setAge(int ageArg) { // 21
		age = ageArg;
	}

	String getName() {
		return name;
	}

	void setName(String nameArg) {
		name = nameArg;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balanceArg) {
		balance = balanceArg;

	}
	void setCredit(double amount) {
		balance = balance + amount;
		
	}
	
	double getDedit() {
		return balance;
	}
	void setDebit(double amount) {
		if(amount<=balance) {
			balance = balance - amount;
		}
	}

}
