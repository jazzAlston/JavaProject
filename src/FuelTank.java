import interfaces.Functional;

class FuelTank extends CarPart implements Functional{
	 
	public void status() {};
	
	
	public void function() {
		
		 if (condition<100) {
			 
			 System.out.println("The tank is not full");
		 }
		System.out.println("The fuel level is:" + " "+ condition);
		
	}
	
	}

