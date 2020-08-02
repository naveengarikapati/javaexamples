package dualaccount;

public class BusinessCustomer extends Customer {
private String officeAddress;
	
	 public BusinessCustomer(String id,String name,double balance,String officeAddress) {
		super(id,name,balance);
		this.officeAddress=officeAddress;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
}
