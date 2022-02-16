package Training;


public class program11 {
	public static void main(String[]args)
	{
		bmw x3=new bmw();
		
		x3.brand();
		x3.display();
		x3.eng();
		
		maruti esteem=new maruti();
		
		esteem.brand();
		esteem.display();
		esteem.eng();
		
		mercedes sclass =new mercedes();
		
		sclass.brand();
		sclass.display();
		sclass.eng();
		
	}
	}


abstract class car{
	public String emblem;
	public abstract void brand();
	public void display()
	{
		System.out.println("I have an emblem of "+ emblem);
	}
}

class bmw extends car implements engine{

	bmw()
	{
		System.out.println("I am a bmw car");
	}
	
	@Override
	public void brand() {
		// TODO Auto-generated method stub
		emblem="bmw";
		
	}

	@Override
	public void eng() {
		// TODO Auto-generated method stub
		System.out.println("I have bmw engine");
	}
	
	
}
class mercedes extends car implements engine{

	
	mercedes()
	{
		System.out.println("I am a mercedes car");
	}
	@Override
	public void brand() {
		// TODO Auto-generated method stub
		emblem="mercedes";
		
	
		
	}
	@Override
	public void eng() {
		// TODO Auto-generated method stub
		System.out.println("I have mercedes engine");
	}
		
}

class maruti extends car implements engine{

	maruti()
	{
		System.out.println("I am a maruti car");
	}
	
	@Override
	public void brand() {
		// TODO Auto-generated method stub
		emblem="maruti";
		
		
	}

	@Override
	public void eng() {
		// TODO Auto-generated method stub
		System.out.println("I have a maruti engine");
	}



}

