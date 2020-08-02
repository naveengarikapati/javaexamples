package details;

public class Account {
private String panCard;
private double balance;

public Account(String PanCard, double Balance) {
	this.panCard=panCard;
	this.balance=balance;
}
public String getPanCard() {
	return panCard;
}
public void setPanCard(String panCard) {
	this.panCard = panCard;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	 this.balance = balance;
}

}
