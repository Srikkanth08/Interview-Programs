package Programs_On_Arrays;

import java.util.Arrays;

public class BubbleSort_Of_An_Array 
{
	public static void main(String[] args) 
	{
		int a[] = {7,9,2,1,5,6};
	
		
//		int a[] = {7,9,2,1,2,5,6,5,9};
		System.out.println("Array Before Sorting is: "+Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++)    //Number of Passes i.e.,(n-1)=6-1=5 passes here in this case here n=6 (length of array only)
		{
			for(int j=0; j<a.length-1; j++)   //Iterations in each Pass
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];    
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Array Afet Sorting is: "+Arrays.toString(a)); 
		
		
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
	}
}
