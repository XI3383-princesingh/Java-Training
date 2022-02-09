package Training;
import java.util.Scanner;
public class Queue {
	public static int n=10;
	public static int Queue[]=new int[n];
	public static int Front=-1;
	public static int Rear=-1;
	public static void Insert(int a)
	{
		
		if(Rear==n-1)
		{
			System.out.println("Queue Overflow");
			return;
		}
		if(Front==-1)
		{
			Front=0;
		}
		Rear++;
		Queue[Rear]=a;
		
	}
	public static int Delete()
	{
		if(Front==-1)
		{
			System.out.println("Queue Underflow");
			return 0;
		}
		if(Front==Rear)
		{
			Front=0;
			Rear=0;
			return 0;
		}
		int item=Queue[Front];
		Front++;
		return item;
		
	}
	public static void Display()
	{
		for(int i=Front;i<=Rear;i++)
		{
			System.out.print(Queue[i]+"\t");
		}
	}
	public static void main(String[]args)
	{
Scanner sc=new Scanner(System.in);
		
		int cont;
		
		do {
			System.out.println("What do you want to do?"+"\n"+"1.Insert"+"\n"+"2.Delete"+"\n"+"3.Display"+"\n");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element to push");
				int a=sc.nextInt();
				Insert(a);
				break;
			case 2:
				System.out.println("Item Deleted: "+Delete());
				break;
			case 3:
				Display();
				break;
			default:	
				System.out.println("Wrong Input");
			}
			System.out.println("\n"+"Do you want to continue?"+"\n"+"1. Yes"+"\n"+"2. No"+"\n");
			cont=sc.nextInt();
		}while(cont==1);
		sc.close();
	}

}
