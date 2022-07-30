package Programs_On_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>a=new ArrayList<>();
		a.add(20);
		a.add(200);
		a.add(2000);
		a.add(20000);
		a.add(200000);
	  Collections.shuffle(a);
	  System.out.println(a);

	}

}
