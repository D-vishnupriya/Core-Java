package com.javacore;
//Polymorphisam: 2 types  compile time -within class function overloading
//run time ->inheritance : function overriding

//we use same name for some purpose
//display
//3 ways you can overload function
//function overloading
//declaring same function name by changing
//1.number of arguments
//2.by changing order of the arguments
class DisplayOverload
{
void display()
{
		
}
void display(float i, float j)
{
System.out.println("two float argument function "+i+ " and "+j);
}
void display(int i, float j) //by changing order
{
System.out.println("int and float 2 arg "+i+ " and "+j);
}
void display( float j,int i)
{
System.out.println("int and float 2 arg "+i+ " and "+j);
}
void display(byte p) {
System.out.println("byte int "+p);
}
}

public class MainClass
{

public static void main(String[] args) {
DisplayOverload ob=new DisplayOverload();
ob.display();//no arg
ob.display((byte)4);//one int
ob.display(4.5f,3.5f);
ob.display(4.6f,7);
ob.display(2, 6.8f);
}
}



