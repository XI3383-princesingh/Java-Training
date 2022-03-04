package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Demonstrate Java Comparisons (Comparator or Comparable) + equals()/hashcode()
public class ComparingElements{
	public static void main(String[] args) {
		
		//Comparable
		ArrayList<Laptop> ls=new ArrayList<>();
		
		ls.add(new Laptop("12","Apple",1200));
		
		ls.add(new Laptop("8","Dell",1400));
		
		ls.add(new Laptop("16","Hp",900));
		
		Collections.sort(ls);
		System.out.println(ls);
		
		
//		Comparator
		
		ArrayList<Integer> lss=new ArrayList<>();
		
		lss.add(189);
		lss.add(984);
		lss.add(734);
		lss.add(453);
		lss.add(885);
		
		Comparator<Integer> cmp=new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				
				if(o1>o2)
					return 1; 
				return -1;
			}
			
		
		};
		Collections.sort(lss,cmp);
		
		System.out.println(lss);
		
		
		//Equals+Hashcode
		
		ls.add(new Laptop("8","Dell",1400));
		System.out.println(ls.get(2)+"Vs"+ls.get(3));
		//shallow comparison
		System.out.print("Shallow Comparison= ");
		System.out.print(ls.get(2)==ls.get(3));
		System.out.println();
		//deep comparison
		System.out.print("Deep Comparison= ");
		System.out.print(ls.get(2).equals(ls.get(3)));
	}
} 

