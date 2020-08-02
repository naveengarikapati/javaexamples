package details;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerMain {
	private Map<String,Customer>store=new HashMap<>();
public static void main(String args[]) { 
	CustomerMain demo=new CustomerMain();
	 demo.runApp();	
	}

public void runApp() {
	try {
		Account account1=new Account("Pr1at234", 1252);
	   Account account2=new Account("ch3err45y", 5674);
	   Account account3=new Account("Pr1at234", 1675);
	   Account account4=new Account("ch3err45y", 5624);
	   
	   final String name1="ankitha",name2="balakrishna",name3 = "hariprasad", name4="saiteja";
	   
	RegularCustomer customer1 = new RegularCustomer("anki","ankitha", "vizag",account1);
	BusinessCustomer customer2 = new BusinessCustomer("bala","balakrishna", "banglore",account2);
	RegularCustomer customer3 = new RegularCustomer("prasad","hariprasad",  "vijayawada",account3);
	BusinessCustomer customer4 = new BusinessCustomer("dandamudi","saiteja", "chennai",account4);
	
	store.put(customer1.getName(), customer1);
	store.put(customer2.getName(), customer2);
	store.put(customer3.getName(), customer3);
	store.put(customer4.getName(), customer4);
	
	System.out.println("****fetch studnt by name=" + name3);

	Customer fetched = findByName(name3);
    if(fetched instanceof RegularCustomer) {
     RegularCustomer fetchedRegCustomer=(RegularCustomer) fetched;
     display(fetchedRegCustomer);
    }
    if(fetched instanceof BusinessCustomer) {
	     BusinessCustomer fetchedBusiCustomer=(BusinessCustomer) fetched;
	     display(fetchedBusiCustomer);
	}
	    
    
	System.out.println("*******displaying all students********"); 
	
	displayAll();
	}
	catch(InvalidCustomerArgumentException e) {
		System.out.println("customer is null");
	}
	catch(Exception e) {
	  System.out.println("some error occurred in program");	
	}
}
	public Customer findByName(String name) {
		Customer customer = store.get(name);
		return customer;
}
public void displayAll() {
	Set<String>keys=store.keySet();
	for (String key:keys) {
		Customer current=store.get(key);
		
		boolean isBC =current instanceof BusinessCustomer;
		if(isBC) {
			BusinessCustomer BC = (BusinessCustomer) current;
			display(BC);
		}
		boolean isRC = current instanceof RegularCustomer;
		if(isRC) {
			
			RegularCustomer RC = (RegularCustomer) current;
			display(RC);
		
		}
		
	}
}
public void checkNull(Customer customer) {
	if(customer==null) {
		InvalidCustomerArgumentException exception=new InvalidCustomerArgumentException("null argument");
	    throw exception;	
	}
}
public void displayCustomer(Customer customer) {
    checkNull(customer);
    String customerId = customer.getCustomerId();
	String name = customer.getName();
	Account account=customer.getAccount(); 
	System.out.println("customerId is " + customerId + " name is " + name );
	System.out.println("pancard and balance details are" +account.getPanCard()+" "+account.getBalance()+" ");
	
}
public void display(RegularCustomer customer) {
	checkNull(customer);
	displayCustomer(customer);
	System.out.println("houseAddress=" + customer.getHouseAddress());
	
}

public void display(BusinessCustomer customer) {		
	checkNull(customer);
	displayCustomer(customer);
	System.out.println("officeAddress=" + customer.getOfficeAddress());
	
}

}
