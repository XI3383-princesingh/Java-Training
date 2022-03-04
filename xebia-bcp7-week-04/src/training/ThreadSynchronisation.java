package training;

//Create a Simple Thread (Via Runnable and Thread) - Demonstrate synchronized

class P{
	 synchronized void display()
	{
		for(int i=0;i<100;i++)
		System.out.println(i);
	}
}

class T1 extends Thread{
	P obj;
	T1(P obj)
	{
		this.obj=obj;
	}
	
	public void run()
	{
		obj.display();
	}
}


class T2 implements Runnable{
	P obj;
	T2(P obj)
	{
		this.obj=obj;
	}
	
	public void run()
	{
		obj.display();
	}
	
}


public class ThreadSynchronisation {
	static P obj=new P();
	public static void main(String[] args) {
		
		
		T1 t1=new T1(obj);
		
		T2 t2=new T2(obj);
		Thread th=new Thread(t2);
		t1.start();
		th.start();
	}
}

