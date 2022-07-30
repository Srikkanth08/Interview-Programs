package Programs_On_Collections;

import java.util.ArrayList;

public class Copy_ArrayList 
{
		public static void main(String[] args) 
		{
			ArrayList<Integer> a=new ArrayList<>();
			a.add(100);
			a.add(200);
			a.add(300);
			a.add(400);
			a.add(500);
			a.add(600);
			
			ArrayList<Integer>b=new ArrayList<>();
			//b.addAll(a);
			b=(ArrayList)a.clone();
			System.out.println(b);

		}

}
