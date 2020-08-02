package dualaccount;

public class CustomerMain {
		   public static void main(String args[]) {
			Customer customer[]= new Customer[2];
			
			RegularCustomer customers1 = new RegularCustomer("chinnu","naveen",1000,"andhrapradesh");
			BusinessCustomer customers2 = new BusinessCustomer("chinni", "keer",2500,"madhyapradesh");
			
			customer[0]=customers1;
			customer[1]=customers2;
			for(Customer customers:customer) {
				String name=customers.getName();
				double balance=customers.getBalance();
				String id=customers.getId();
				System.out.println(" name is " + name + " id is " + id + " balance is " + balance);
				
				boolean isBC =customers instanceof BusinessCustomer;
				if(isBC) {
					BusinessCustomer BC = (BusinessCustomer) customers;
					System.out.println("businessCustomer=" + BC.getOfficeAddress());
				}
				boolean isRC = customers instanceof RegularCustomer;
				if(isRC) {
					
					RegularCustomer RC = (RegularCustomer) customers;
					System.out.println("regularCustomer=" + RC.getHouseAddress());
				
				}
				
			}
			
		}
}
