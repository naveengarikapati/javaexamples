package details;

import java.util.*;

public class Customer {
private String customerId;
private String name;
private Account account;


public Customer(String customerId,String name) {
	this.name=name;
	this.customerId=customerId;
	
}

public Customer(String customerId,String name,Account account) {
	this(customerId,name);
	this.account=account;
	
}

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public boolean equals(Object arg) {
	if(this==arg) {
		return true;
	}
	
   if(arg==null || !(arg instanceof Customer) ) {
		return false;
   }
	
    Customer that=(Customer)arg;	
	boolean isequal=this.customerId==that.customerId;
	return isequal;
}

public String toString() {
	String str=customerId+" "+ name+" "+account+" ";
	return str;
}
}
