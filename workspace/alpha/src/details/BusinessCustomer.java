package details;

public class BusinessCustomer extends Customer {
private String officeAddress;
public BusinessCustomer(String id,String name, String officeAddress,Account account) {
	super(id,name,account);
	this.officeAddress = officeAddress;
}

public String getOfficeAddress() {
	return officeAddress;
}
public void setOfficeAddress(String officeAddress) {
	this.officeAddress = officeAddress;
}

}
