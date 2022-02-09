package Training;
import java.util.Scanner;
public class Stack {
	public static int n=10;
	public static int stck[]=new int[n];
	public static int top=-1;
	public static void push(int a)
	{
		if(top==n-1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		stck[top]=a;
	}
	public static int pop()
	{
		if(top==0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		top--;
		return stck[top];
		
	}
	public static void display()
	{
		for(int i=top;i>0;i--)
		{
			System.out.println(stck[i]);
		}
	}
	public static void main(String[]args)
	
	{
		Scanner sc=new Scanner(System.in);
		
		int cont;
		do {
			System.out.println("What do you want to do?"+"\n"+"1.Push"+"\n"+"2.Pop"+"\n"+"3.Display"+"\n");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element to push");
				int a=sc.nextInt();
				push(a);
				break;
			case 2:
				System.out.println("Item Popped: "+pop());
				break;
			case 3:
				display();
				break;
			default:	
				System.out.println("Wrong Input");
			}
			System.out.println("Do you want to continue?"+"\n"+"1. Yes"+"\n"+"2. No"+"\n");
			cont=sc.nextInt();
		}while(cont==1);
		sc.close();
	}
	
	

}
