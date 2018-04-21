import interfaces.Functional;


public class CarPart implements Functional {

static int condition = 100;
	public void status() {
		
		condition--;
		if (condition > 0) {
			System.out.println("The car is running");
			System.out.println("The condition is:"+ " " + condition);
		}
		else
			System.out.println("The car is broken");
		
	}
	
	public void function() {
		
		
	}


	
	

	
}
