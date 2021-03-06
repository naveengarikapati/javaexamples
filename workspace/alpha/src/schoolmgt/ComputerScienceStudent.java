package schoolmgt;

	public class ComputerScienceStudent extends Student {

		private String laptopAlloted;

		public ComputerScienceStudent(String name, int age, boolean placed, String laptopAlloted) {
			//super with round bracket means we are calling base class constructor
			super(name, age, placed);
			this.laptopAlloted = laptopAlloted;
		}
		
		public ComputerScienceStudent(String name, int age) {
		     this(name,age,true,"");
		}
		

		public String getLaptopAlloted() {
			return laptopAlloted;
		}

		public void setLaptopAlloted(String laptopAlloted) {
			this.laptopAlloted = laptopAlloted;
		}
		
		/**
		 * annotations are metadata, data about data, information about data
		 * override annotation is informing compiler that we are overriding a base class method
		 * if we dont use override annotation then if we are not overriding , 
		 * compiler will not inform us that we are not overriding
		 */
		@Override
		public void setAge(int age) {
			if(age>17) {
				super.setAge(age);
			}
		}
			

	}

