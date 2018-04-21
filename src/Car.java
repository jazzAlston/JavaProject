import java.util.ArrayList;
import java.util.List;

public class Car {
	
   List<CarPart> cList = new ArrayList<>();
	 
	public Car ( ) 
	{
	   CarPart e = new Engine();
	   CarPart t = new Tires();
	   CarPart f = new FuelTank();
	
	   
	   cList.add(e);
	   cList.add(t);
	   cList.add(f);
	 
	
	
	}  	  
	
    
	
	
	public void run() 
	{
		
	    
		for (CarPart c : cList)
			c.function();
	}
      

	}


 


