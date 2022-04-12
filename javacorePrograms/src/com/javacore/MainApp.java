package com.javacore;

class AddOverload
{
void add(int i, int j) 
{
int s;
s=i+j;
System.out.println("two int argument function "+i+ " and "+j+" is " +s);
}
void add(float i, float j)
{
System.out.println("float and float 2 arg "+i+ " and "+j);
}
void add(double i, double j) 
{
System.out.println("doule and double 2 arg "+i+ " and "+j);
}

public class MainApp
{

public void main(String[] args) 
{
AddOverload ob=new AddOverload();

ob.add(9,8);//two int
ob.add(6.7,8.9); //two double
ob.add(5.7f, 6.5f);// two float
}
}
}







