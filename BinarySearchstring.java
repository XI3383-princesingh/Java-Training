package Training;

import java.util.Arrays;

public class BinarySearchstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"apple","orange","grape","kiwi"};
		String item="grape";

		
		
		for(int i=1;i<=arr.length-1;i++)
		{
			int k=arr[i].charAt(0);
			String word=arr[i];
			int j=i-1;
			while(j>=0&&arr[j].charAt(0)>k)
			{arr[j+1]=arr[j];
				j--;}
			arr[j+1]=word;
			
		}
		System.out.println(Arrays.toString(arr));
		int b=0;
		int e=arr.length;
		while(b<=e)
		{
		int mid=b+(e-b)/2;
				if(arr[mid]==item)
				{
					System.out.println("Item found at "+(mid+1));
					return;
				}
				if(item.charAt(0)<arr[mid].charAt(0))
				{
					e=mid-1;
					continue;
				}
				if(item.charAt(0)>arr[mid].charAt(0))
				{
					b=mid+1;
					continue;
				}
		
		if(e>b)
		{
			System.out.println("Element not found");
		}
		}
	}

}
