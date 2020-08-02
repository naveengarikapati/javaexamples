package dualaccount;

public class RegularCustomer extends Customer {
	private String houseAddress;

	 public RegularCustomer(String id, String name, double balance, String houseAddress) {
		super(id, name, balance);
		this.houseAddress = houseAddress;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

}
