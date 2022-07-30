package Programs_On_Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove_Duplicates_Of_An_Array 
{
  /*	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<>();
		a.add(21);
		a.add(42);
		a.add(18);
		a.add(16);
		a.add(8);
		a.add(8);
		a.add(18);
		
		LinkedHashSet<Integer> link = new LinkedHashSet<>(a);
		System.out.println(link);
		
	}   */
	
	public static void main(String[] args) 
	{
		int a[] = {21, 21, 15, 21, 42, 7, 8, 18, 21, 21, 25};
		System.out.println("Duplicats element in an given Array: ");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; i++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[j]+" ");
				}
			}
		}
	}
}
