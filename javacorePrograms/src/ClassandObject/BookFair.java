package ClassandObject;
import java.util.Scanner;
public class BookFair 
{
	
//variable
 String Bname;
 double price;
 double discount;
 
 BookFair() //constructor
 {
	 Bname="";
	 price=0.0;
	 discount=0.0;
 }
	 
 void input()
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Bname:");
	 Bname=sc.nextLine();
	 System.out.println("Enter price:");
	 price=sc.nextDouble();
	 sc.close();
 }

	      
		void calculate()
		{
			if(price<=1000)
			{
				discount=(price*2)/100;
			}
			else if(price>1000 && price<=3000)
			{
				discount=(price*10)/100;
			}
				
				else if((price>3000))
				{
					
				discount=(price*15)/100;
				}
				else
				{
					System.out.println("there is no discount available for your amount");
				}
		}
				
			
			void display()
			{
				price=price-discount;
				System.out.println("Bname= "+Bname);
				System.out.println("price= "+price);
				System.out.println("discount= "+discount);
				System.out.println("amount= "+price);
			
			}
			
			public static void main(String[] args)
			{
				BookFair ob = new BookFair();
				ob.input();
				ob.calculate();
				ob.display();
			}
		}

			