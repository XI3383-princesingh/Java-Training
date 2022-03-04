package training;
//Demonstrate all Conditional Branching Conditions (+switch) and Looping Types in Java
public class ConditionalsAndLooping {
	public static void main(String[] args) {
		//If-else
		
		System.out.println("If-else");
		
		int a=7;
		
		if(a<5)
		{
			System.out.println("a<5");
		}
		else {
			System.out.println("a>5");
		}
		//while
		
		System.out.println("While-Loop");
		
		int i=0;
		while(i<10)
		{
			System.out.println(i);
			i++;
		}
		//for
		
		System.out.println("For-Loop");
		
		for(i=0;i<10;i++)
		{
			System.out.println(i);
		}
		//do-while
		
		System.out.println("Do-While-Loop");
		int j=0;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		//switch
		
		System.out.println("Switch");
		
		int ch=2;
		switch(ch)
		{
		case 1:
			System.out.println("You chose 1");
			break;
		case 2:
			System.out.println("You chose 2");
			break;
		case 3:
			System.out.println("You chose 3");
			break;
		default:
			System.out.println("Wrong Input");
			break;	
		}
	}

}
