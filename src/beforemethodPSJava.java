import org.testng.annotations.BeforeMethod;

public class beforemethodPSJava {

	//METHODS,VARIABLES
	public void dothis() 
	{
		System.out.println("I am here");
	}

	@BeforeMethod
	public void beforerun() 
	{
		System.out.println("Run me first");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
