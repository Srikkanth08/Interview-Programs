package String_Program_Practice;

public class Reverse_Of_A_String 
{
	public static void main(String[] args) 
	{
		String s = "Srikanth";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse Of A String : "+ rev);
	}
}
