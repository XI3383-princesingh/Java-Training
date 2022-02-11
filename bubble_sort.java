package Training;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,3,52,14,8,9,21,5,23};
		for(int i=0;i<arr.length-1;i++)
		{
			int j=0;
			while(j<arr.length-i-1)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
