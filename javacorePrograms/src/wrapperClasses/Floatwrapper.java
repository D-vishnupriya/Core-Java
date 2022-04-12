package wrapperClasses;

public class Floatwrapper {

	public static void main(String[] args) 
	{
		float price = 30.45f;
		
		//Float f = price;
		Float f = Float.valueOf(price);
		
		System.out.println(f);
		
		System.out.println("=====================");
		
		Float f2 = new Float(56.34f);
		
		//float value = f2;
		float value = f2.floatValue();		
		
		System.out.println(value);

	}

}
