package wrapperClasses;

public class Integerwrapper {


		//autoBoxing
				public static void main(String[] args) 
				{
					//using integer wrapper class
					System.out.println("Integer wrapper class autoboxing");
					
					int age = 50;
					
					//Integer object
					
					Integer myAge = Integer.valueOf(age);
					
					System.out.println(myAge);	
					
					System.out.println("===========================");
					
					//Int object
					System.out.println("Integer wrapper class autoUnboxing");
					Integer age1 = new Integer(23);
					
					//primitive value
					//int myAge1 = age1;//converting Integer object to primitive int value
					int myAge1 = age1.intValue();
					
					System.out.println(myAge1);


	}

}
