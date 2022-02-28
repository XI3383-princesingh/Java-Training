package Training;

/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
import java.util.Scanner;
public class Calculator {
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int mul(int a, int b)
	{
		return a*b;
	}
	public static int div(int a, int b)
	{
		return a/b;
	}
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		int cont;
		do {
		System.out.println("Enter num1:"+"\t");
		int a=sc.nextInt();
		System.out.println("Enter num2:"+"\t");
		int b=sc.nextInt();
		System.out.println("Enter Choice"+"\n"+"1-Add"+"\n"+"2-Subtract"+"\n"+"3-Multiply"+"\n"+"4-Divide"+"\n");
		int ch=sc.nextInt();
		System.out.println("Result="+"\t");
		switch(ch)
		{
		case 1:
			System.out.println(add(a,b));
			break;
		case 2:
			System.out.println(sub(a,b));
			break;
		case 3:
			System.out.println(mul(a,b));
			break;
		case 4:
			System.out.println(div(a,b));
			break;
		default:
			System.out.println("Wrong Input");
			break;
		}
		
		System.out.println("Do you want to continue?"+"\n"+"1-True"+"\n"+"2-False"+"\n\n");
		cont=sc.nextInt();
		}while(cont==1);
	}

}
