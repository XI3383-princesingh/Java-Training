package training;

//Understand (Research) and Write Code to Demonstrate Usage of Java Annotations
@interface gamingpc
	{
	int ram() default 16;
	int storage() default 512;
	}


@FunctionalInterface
interface storage{
	void getStorage();
	
}

class pc{
	
	int ram;
	void setRam()
	{
		ram=8;
	}
}

@gamingpc
class dell extends pc implements storage{
	
	@Override
	void setRam()
	{
		ram=16;
	}
	@Deprecated
	void notUse()
	{
		System.out.println("Don't use this method");
	}
	@Override
	public void getStorage() {
		// TODO Auto-generated method stub
		int storage=512;
		
	}
}

public class AnnotationDemo {

	public static void main(String[] args) {
		dell Inspiron =new dell();
		Inspiron.setRam();
		System.out.println(Inspiron.ram);
		

	}

}
