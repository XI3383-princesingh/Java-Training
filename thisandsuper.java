package Training;
abstract class employe{
	protected boolean isadmin=false;
	private int eid;
	private String ecity;
	
	
	
	public void seteid(int eid)
	{
		this.eid=eid;
	}
	public void setecity(String ecity)
	{
		this.ecity=ecity;
	}
	
	protected void geteid()
	{
		System.out.println("Employement ID is "+eid);
	}
	protected void getecity()
	{
		System.out.println("Employement city is "+ecity);
	}
	protected void ifadmin()
	{
		if(isadmin==true)
		{
			System.out.println("I have admin rights");
		}
		else
		{
			System.out.println("I do not have admin rights");
		}
	}
	
}

class hr extends employe{
	{
		super.isadmin=true;
	}
	
	public void displaydet()
	{
		super.geteid();
		super.getecity();
		super.ifadmin();
	}
	
	
	
}
class developer extends employe{
	
	void displaydet()
	{
		super.geteid();
		super.getecity();
		super.ifadmin();
	}
	
}
class manager extends employe{
	{
		super.isadmin=true;
	}
	
	void displaydet()
	{
		super.geteid();
		super.getecity();
		super.ifadmin();
	}
}
public class thisandsuper {
	public static void main(String[]args)
	{
		developer mukesh=new developer();
		 mukesh.seteid(1);
		 mukesh.setecity("delhi");
		 mukesh.displaydet();
		 
		 hr suhani=new hr();
		 suhani.seteid(2);
		 suhani.setecity("gurugram");
		 suhani.displaydet();
		 
		 manager ramesh=new manager();
		 ramesh.seteid(3);
		 ramesh.setecity("noida");
		 ramesh.displaydet();
		 
		 
		 
	}

}
