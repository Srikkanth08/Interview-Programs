package Programs_On_Collections;

import java.util.LinkedList;
import java.util.List;

public class SubList_From_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>a=new LinkedList<>();
		a.add(500);
		a.add(400);
		a.add(5200);
		a.add(1200);
		a.add(3500);
		a.add(50);
		List<Integer> aa = a.subList(3,6);
		System.out.println(aa);

	
	}
}
