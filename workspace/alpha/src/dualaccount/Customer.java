package dualaccount;

public class Customer {
	private String id;
	private String name;
	private double balance;

	public Customer(String id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	Customer() {
		this(" ", " ", 200);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
