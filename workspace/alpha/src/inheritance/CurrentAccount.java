package inheritance;

public class CurrentAccount extends Account{

		String officeaddress;

		CurrentAccount(String Holdername,int age, double balance , String officeaddress)
		{
			super(Holdername,balance,age);
			this.officeaddress= officeaddress;
		}

		public String getOfficeaddress() {
			return officeaddress;
		}

		public void setOfficeaddress(String officeaddress) {
			this.officeaddress =officeddress;
		}



	}
  


