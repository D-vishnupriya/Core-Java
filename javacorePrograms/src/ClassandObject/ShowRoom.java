package ClassandObject;
import java.util.Scanner;
public class ShowRoom 
{
	//varaibles
 String name;
 long mobileno;
 double cost;
 double dis;
 double amount;
 
 ShowRoom() //constructor
 {
	 name="";
	 mobileno= 0;
	 cost=0.0;
	 amount=0.0;
}
 void input() //method creation
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter name:");
	 name=sc.nextLine();
	 System.out.println("Enter mobileno:");
	 mobileno=sc.nextLong();
	 System.out.println("Enter cost:");
	 cost=sc.nextDouble();
 }

	      
		void calculate()
		{
			if(cost<=10000)
			{
				dis=(cost*5)/100;
			}
			else if(cost>10000 && cost<=20000)
			{
				dis=(cost*10)/100;
			}
				else if(cost>20000 && cost<=350000)
				{
					dis=(cost*15)/100;
				}
				else
				{
					dis=(cost*20)/100;
				}
			}
			void show()
			{
				amount=cost-dis;
				System.out.println("Name: "+name);
				System.out.println("cost: "+cost);
				System.out.println("dis: "+dis);
				System.out.println("amount: "+amount);
			}
			
			public static void main(String[] args)
			{
				ShowRoom ob = new ShowRoom();
				ob.input();
				ob.calculate();
				ob.show();
			}
		}

			