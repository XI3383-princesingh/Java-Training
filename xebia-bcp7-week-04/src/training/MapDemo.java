package training;
import java.util.HashMap;

//Demonstrate Usage of Set, List and Map via ArrayList, Hashset and Hashmap
public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1,"Mango");
		map.put(2,"Banana");
		map.put(3,"Apple");
		map.put(4,"Orange");
		
		System.out.println(map);
		
		map.remove(3);
		System.out.println(map);
	}
}
	