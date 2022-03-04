package training;
import java.util.ArrayList;

//Demonstrate Usage of Set, List and Map via ArrayList, Hashset and Hashmap
public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> ls=new ArrayList<>();
		
		ls.add("Apple");
		ls.add("Banana");
		ls.add("Orange");
		ls.add("Pomogranent");
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		ls.remove(0);
		System.out.println();
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
	}

}
