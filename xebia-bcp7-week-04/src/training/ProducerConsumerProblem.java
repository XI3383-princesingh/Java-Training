package training;
//Demonstrate Producer-Consumer Problem, Usage of wait, notify and synchronized

class Q{
	int num;
	boolean val=false;
	synchronized void put(int i)
	{
		if(val)
		{
			try{wait();}catch(Exception e) {}
		}
		num=i;
		System.out.println("put : "+num);
		val=true;
		notify();
	}
	
	synchronized void get()
	{
		if(!val)
		{
			try{wait();}catch(Exception e) {}
		}
		System.out.println("get : "+num);
		val=false;
		notify();
	}
}

class Producer extends Thread{

	Q q;
	
	
	public Producer(Q q) {
		this.q = q;
		this.start();
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
		q.put(i++);
		try {
		Thread.sleep(1000);
		}catch(Exception e)
		{}
		}
		
	}
	
}


class Consumer implements Runnable{
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t=new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
		q.get();
		try {
		Thread.sleep(1000);}catch(Exception e) {}
		}
	}
	
	
	
}

public class ProducerConsumerProblem{
	public static void main(String[] args) {
		Q q=new Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
	}
	
}