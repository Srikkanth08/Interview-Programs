package Programs_On_Strings;

import java.util.LinkedHashSet;

public class Position_Of_String 
{
	public static void main(String[] args) 
	{
		String s = "Khatham ta ta bye bye";
		String [] split = s.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		for(int i=0; i<split.length; i++)
		{
			lh.add(split[i]);
		}
		for(String str: lh)
		{
//			for(int i=0; i<split.length; i++)
			for(int i=
					
					
					split.length-1; i>=0; i--)
			{
				if(str.equals(split[i]))
				{
					System.out.println(str+ " Position is "+(i+1));
					break;
				}
			}
		}
	}
}
