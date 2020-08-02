package inheritance;

public class SavingsAccount extends Account {

		String houseaddress;

		SavingsAccount(String holdername, int age, double balance, String houseaddress) {
			super(holdername,balance,age);
			this.houseaddress = houseaddress;
		}

		String getHouseaddress() {
			return houseaddress;
		}

		void setHouseaddress(String houseaddress) {
			this.houseaddress = houseaddress;
		}

	}

