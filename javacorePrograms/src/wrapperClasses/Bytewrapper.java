package wrapperClasses;

public class Bytewrapper {

	
    	//autoBoxing
		public static void main(String[] args) 
		{
			//primitive value
			byte rank = 21;
			
			//Byte object
			//Byte b1 = rank;//converting primitive byte value to Byte object
			Byte b1 = Byte.valueOf(rank);
			
			System.out.println(b1);	
			
			System.out.println("===========================");
			
			//Byte object
			byte myAge = 20;
			Byte age = new Byte(myAge);
			
			//primitive value
			//byte age1 = age;//converting Byte object to primitive byte value
			byte age1 = age.byteValue();
			
			System.out.println(age1);


	}

}
