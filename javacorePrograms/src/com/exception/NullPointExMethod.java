package com.exception;

import java.util.Scanner;

public class NullPointExMethod {

	public static void main(String[] args) 
	{
		String n=null;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the name");
			n=sc.nextLine();
			System.out.println("Name="+n);
			}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		
		}

	}

}
