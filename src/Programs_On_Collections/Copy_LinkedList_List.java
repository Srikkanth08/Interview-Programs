package Programs_On_Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class Copy_LinkedList_List 
{	
	public static void main(String[] args)
	{
		LinkedList<String>a=new LinkedList<>();
		a.add("Sainadh");
		a.add("Teja");
		a.add("Sai Manoj");
		a.add("Srikanth");
		int si = a.size();
	  String ss[]=new String[si];
	  for(int i=0;i<si;i++)
	  {
		  ss[i]=a.get(i);
		 
	  }
	 
	 System.out.println(Arrays.toString(ss));

	}

}
