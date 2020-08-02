package override;

 abstract public class vehicle {

		   void move() {
				System.out.println("vehicle moves");
			}
		   private String numberPlate;

			public vehicle(String numberPlate) {
				this.numberPlate=numberPlate;
			}

			public String getNumberPlate() {
				return numberPlate;
			}

		}

