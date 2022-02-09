package Training;
class Employee{
	private boolean isAdmin=false;
	private int salary;
	
	public void setSalary(int salary)
	{   
	if(isAdmin==true)
		this.salary=salary;
	else
		System.out.println("You are not authorised to change Salary");
		
	}
	
	public void getSalary()
	{
		System.out.println("Salary is "+ salary); 
	}
	
	public void toggleAdmin()
	{
		if(isAdmin)
		{
			isAdmin=false;
		}
		else
		{
			isAdmin=true;
		}
	}
}
public class Encapsulation {
	public static void main(String[]args)
	{
		Employee mukesh=new Employee();
		mukesh.toggleAdmin();
		mukesh.setSalary(25000);
		mukesh.getSalary();
		
		
		Employee ramesh=new Employee();
		ramesh.setSalary(50000);
		ramesh.getSalary();
		
	}

}
