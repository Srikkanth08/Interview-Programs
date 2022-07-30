package Programs_On_Collections;

import java.util.ArrayList;

public class ArrayList_First_Program 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Srikanth");
		a.add('M');
		a.add(8);
		a.add("Srikanth");
		a.add(null);
		a.add(79.75);
		System.out.println("Collection of objects are: "+a);
		
		Integer i = new Integer(100);
		a.add("Srikanth");
		a.add(16);
		
		System.out.println("After Removing of objects are: "+a);
		a.remove(6);
		System.out.println(a);
		
		ArrayList a1 = new ArrayList();
		a1.addAll(a);
		System.out.println("After copy all objects: "+a1);
		
		System.out.println(a1.contains("Srikanth"));
		System.out.println(a1.isEmpty());
		
		for(int j=0; j<a1.size(); j++)
		{
			System.out.print(a1.get(j)+" ");
		}
		
	}
}
