package com.Setters;

public class Employee 	
	{
		
		private int id;
		private String name;
		private double salary;
		
		public Employee() 
		{
			// TODO Auto-generated constructor stub
		}

		//setter methods
		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}	
		
		//method
		public void getEmployeeInfo()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
		}
		
		public static void main(String[] args) 
		{
			
			Employee employee = new Employee();
			
			//use setter methods to assign values to the variables		
			employee.setId(2920);
			employee.setName("Sanvitha");
			employee.setSalary(78383.34);
			
			employee.getEmployeeInfo();

	}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public double getSalary() {
			return salary;
		}

}
