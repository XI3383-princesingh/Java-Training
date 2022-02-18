package Training;

class parentt{
	void display()
	{
		System.out.println("Inside parent class");
	}
}

class childd extends parentt{
	void display()
	{
		System.out.println("inside child class");
	}
}

public class overriding {
	public static void main(String[]args)
	{
		parentt p=new parentt();
		p.display();
		childd c=new childd();
		c.display();
		parentt pc=new childd();
		pc.display();
		
		
	}

}
