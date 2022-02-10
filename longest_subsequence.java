package Training;
import java.util.Stack;
public class longest_subsequence {
	public static void main(String[] args)
	{
		
		int arr[]= {1,4,7,5,3,2,1,3,8,9,3,7,4,9};
		Stack<Integer> stck=new Stack<Integer>();
		int max=0;
		Stack<Integer> maxss=new Stack<Integer>();
		int count=0;
		int maxsubsequence=0;
		int rem=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(max<=arr[i])
			{
				
				max=arr[i];
				stck.push(max);
				count++;
				
			}
			else
			{
				if(maxsubsequence<count)
				{
					rem=i;
					maxsubsequence=count;
					
				}
				max=arr[i];
				stck.push(max);
				count=1;
			}
			
			
			
		}
		
		for(int j=0;j<arr.length-rem;j++)
		{
			stck.pop();
		}
		
		for(int j=0;j<maxsubsequence;j++)
		{
			maxss.push(stck.pop());
		}
		
		System.out.println("Maximum increasing subsequence is:"+maxsubsequence);
		for(int k=0;k<maxsubsequence;k++)
		{
			System.out.println(maxss.pop());
		}
	}
	

}
