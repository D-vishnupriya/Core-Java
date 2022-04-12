package settersandToStringMethod;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() 
	{
		
	}

	//setter methods
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}	
	
	//toString method
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) 
	{
		
		Employee employee = new Employee();
		
		//use setter methods to assign values to the variables		
		employee.setId(2920);
		employee.setName("Sanvitha");
		employee.setSalary(78383.34);
		
		System.out.println(employee.toString());
		
		//System.out.println(employee);


	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}
}
