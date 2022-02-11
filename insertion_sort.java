package Training;

import java.util.Arrays;

public class insertion_sort {
	public static void main(String[]args)
	{
		int arr[]={7,2,3,52,14,8,9,21,5,23};
		
		for(int i=1;i<=arr.length-1;i++)
		{
			int k=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>k)
			{arr[j+1]=arr[j];
				j--;}
			arr[j+1]=k;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
