package training;

//Demonstrate Usage of Enumerations in Core Java (Find Out How to Use Enumerations)
enum car{
	BMW(50000),
	MARUTI(65000),
	TATA(40000);
	int cost;
	car(int p){
		cost=p;//in dollars
		
	}
}
public class EnumerationDemo {
	public static void main(String[] args) {
		System.out.println(car.MARUTI);
		
		switch(car.BMW)
		{
		case BMW:
			System.out.println("Price for BMW is="+car.BMW.cost);
			break;
		case MARUTI:
			System.out.println("Price for Maruti is="+car.MARUTI.cost);
			break;
		case TATA:	
			System.out.println("Price for TATA is="+car.TATA.cost);
			break;
			
		}
	
	
	//ordinal

		System.out.println("Index of MARUTI is "+car.MARUTI.ordinal());
		
	//printing every value 
		
		car carArray[]=car.values();
		
		for(int i=0;i<carArray.length;i++)
		{
			System.out.println(carArray[i]);
		}

	}
	
}
