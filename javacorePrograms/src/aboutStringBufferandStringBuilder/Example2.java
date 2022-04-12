package aboutStringBufferandStringBuilder;

public class Example2 {


	public static void main(String[] args) 
	{		
		
		StringBuffer name = new StringBuffer("Vishnu");
		
		name.append(" Priya");
		
		System.out.println(name);	
		
		System.out.println("==================");
		
		StringBuilder myName = new StringBuilder("Vishnu");
		
		myName.append("Chetty");
		
		System.out.println(myName);

	}

}
