package com.customizedexceptions;
import java.util.Scanner;

class CheckAge extends Exception
{
	public CheckAge(String s)
	{
		super(s);
	}
}

public class CheckingAge
{
	public static void main(String[] args)
	{
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age:");
	age = sc.nextInt();
	try
	{
		if(age<18)
		{
			throw new CheckAge("Not Eligible");
			
		}
	}
	catch(CheckAge e)
	{
		e.printStackTrace();
	}
	sc.close();
	}

}
