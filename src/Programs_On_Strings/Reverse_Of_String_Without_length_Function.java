package Programs_On_Strings;

public class Reverse_Of_String_Without_length_Function 
{
	public static void main(String[] args) 
	{
		String s = "Srikanth";
		char[] s1 = s.toCharArray();
		String rev = " ";
		int count = 0;
		for(char C : s1)
		{
//			rev = C + rev;
			count++;
			
		}
		System.out.println(count);
		for(int i=0; i<s1.length; i++)
		{
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
