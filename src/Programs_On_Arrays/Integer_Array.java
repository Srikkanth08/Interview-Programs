package Programs_On_Arrays;

import java.util.Arrays;

public class Integer_Array 
{
	public static void main(String[] args) 
	{
		int a[] = {21, 42, 7, 8, 16, 18};
		System.out.println("Printing Of an Integer Array: "+Arrays.toString(a));
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Printing Reverse of an Integer Array: ");
		
		for(int j=a.length-1; j>=0; j--)
		{
			System.out.print(a[j]+" ");
		}
	}
}
