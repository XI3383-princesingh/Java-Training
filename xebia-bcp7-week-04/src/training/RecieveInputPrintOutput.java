package training;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
//Demonstrate All Ways (Research) to Receive Input and Print Output in Java Program
public class RecieveInputPrintOutput {
public static void main(String[] args) throws Exception{
	
	//Input
		//Using Scanner
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String Str=sc.next();
	
	System.out.println(n);
	System.out.println(Str);
	
		//Using Buffered Reader
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(br.readLine());
	String str=br.readLine();
	
	System.out.println(num);
	System.out.println(str);
		//Using Console  works in cmd
//	Console obj=System.console();
//	String S=obj.readLine();
//	System.out.println(S);
	
	
	//Output
	
		//Using println
	System.out.println("Println");
	
		//Using print
	System.out.print("Print");
	
		//Using printf

	System.out.printf("Printf");
	
	
}
}
