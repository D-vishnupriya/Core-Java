package wrapperClasses;

public class Longwrapper {

	public static void main(String[] args)
	{
		
			//using long wrapper class
			System.out.println("long wrapper class autoboxing");
			
			long data = 123456789;
			//Long mydata = data;
			
		
			Long mydata = Long.valueOf(data);
			
			System.out.println(mydata);	
			
			System.out.println("===========================");
			
			//using Long wrapper class
			System.out.println("long  wrapper class autoUnboxing");
			long dataa= 789456001;
			Long data1 = new Long(dataa);
			
			//long myData1 = data1;
			long myData1 = data1.longValue();
			System.out.println(myData1);

	}

}
