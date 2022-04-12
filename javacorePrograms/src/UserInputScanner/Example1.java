package UserInputScanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{

		String name;
		int age;
		float sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		age= sc.nextInt();
	
		System.out.println("Enter name:");
		sc.nextLine();
		name= sc.nextLine();
		System.out.println("Enter salary:");
		sal= sc.nextFloat();

		//Dispaly
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+sal);
		sc.close();
	}

}
