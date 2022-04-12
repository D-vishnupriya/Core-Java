package com.javacore;
import java.util.Scanner;

	//Encapsulation: Binding of data

	//class method variable

	class College
	{  //blue print or it user defined data type
		int stuid;  //instance variables
		String name;
		float fees;
		float age;
		
		//member function or methods
		void input() {
			//access data
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a stuid");
			stuid=sc.nextInt();
			System.out.println("Enter a name");
			name=sc.next();
			System.out.println("Enter a fees");
			fees=sc.nextInt();
			System.out.println("Enter a age");
			age=sc.nextInt();
			
		}
		void display() {
			//all the data
			System.out.println("Name="+name);
			System.out.println("Stuid="+stuid);
			System.out.println("Fees="+fees);
			System.out.println("Age="+age);
			
		}
		
	}//scope of employee data

	public class Student
	{

		public static void main(String[] args) {
		int i; //predefined  4 bytes
		College ob=new College(); //size of ob 10 bytes
		ob.input();
		ob.display();

		}

	}