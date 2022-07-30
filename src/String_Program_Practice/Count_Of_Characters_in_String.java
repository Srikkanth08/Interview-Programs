package String_Program_Practice;

public class Count_Of_Characters_in_String 
{
	public static void main(String[] args) 
	{
		String s = "Srikanth";
		int count = 0;
		
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)=='S' || s.charAt(i)=='s')
			{
				count++;
			}
		}
		System.out.println("Count of S/s : "+count);
	}
}
