package com.Autounboxing;

public class Example {

	public static void main(String[] args) 
	{
		
		//converting primitive data type to an object type, is called autounBoxing.
		
		Integer myAge = new Integer(30);//Integer wrapper class object is created
		
		int age = myAge;//storing wrapper class object into int primitive data type.
		
		System.out.println(age);

	}

}
