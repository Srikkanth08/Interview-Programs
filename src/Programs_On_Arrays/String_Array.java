package Programs_On_Arrays;

import java.util.Arrays;

public class String_Array 
{
	public static void main(String[] args) 
	{
		String S[] = {"Metpally","Sri","Kanth"};
		System.out.println("Printing Of String Array: "+Arrays.toString(S));
		
		for(int i=0; i<S.length; i++)
		{
			System.out.print(S[i]+" ");
		}
		System.out.println();
		System.out.println("Printing Reverse Of String Array: ");
		
		for(int j=S.length-1; j>=0; j--)
		{
			System.out.print(S[j]+" ");
		}
	}
}
