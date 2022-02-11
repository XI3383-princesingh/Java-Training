package Training;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[]args)
	{
		int arr[]= {5,7,2,4,1};
		int min;
		int loc;
		for(int i=0;i<arr.length;i++)
		{
			min=arr[i];
			loc=i;
			int j=i+1;
			while(j<arr.length)
			{
			if(arr[j]<min)
			{
				min=arr[j];
				loc=j;
			}
			j++;
			}
			int temp=arr[i];
			arr[i]=arr[loc];
			arr[loc]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
