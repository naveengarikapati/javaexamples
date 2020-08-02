package details;

	public class RegularCustomer extends Customer {
		private String houseAddress;

		 public RegularCustomer(String id, String name,  String houseAddress,Account account) {
			super(id, name,account);
			this.houseAddress = houseAddress;
		}
	
		public String getHouseAddress() {
			return houseAddress;
		}

		public void setHouseAddress(String houseAddress) {
			this.houseAddress = houseAddress;
		}

	}

