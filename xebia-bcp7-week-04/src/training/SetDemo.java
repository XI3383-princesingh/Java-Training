package training;
import java.util.HashSet;

//Demonstrate Usage of Set, List and Map via ArrayList, Hashset and Hashmap
public class SetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(5);
		hs.add(7);
		hs.add(12);
		
		System.out.println(hs);
		
		hs.remove(6);
		System.out.println(hs);
		
	}

}
