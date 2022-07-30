package Programs_On_Collections;

import java.util.ArrayList;

public class ArrayList_Contains 
{
public static void main(String[] args) 
{				
		ArrayList<Integer>a=new ArrayList<>();
		a.add(200);
		a.add(250);
		a.add(300);
		a.add(350);
		a.add(400);
		a.add(450);
		a.add(500);
		System.out.println(a);
		ArrayList<Integer>b=new ArrayList<>();
		b.add(600);
		b.add(750);
		b.add(800);
		b.add(350);
		b.add(460);
		b.add(490);
		b.add(520);
		System.out.println(b);
		
		boolean list1 = a.containsAll(b);
		System.out.println(list1);
		boolean list2 = b.containsAll(a);
		System.out.println(list2);
		
  
	}
}
