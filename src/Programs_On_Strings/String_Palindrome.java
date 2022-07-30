package Programs_On_Strings;

public class String_Palindrome 
{
	public static void main(String args[])
	{
		String S1 = "Engineer";
		String S = "";
		for(int i=S1.length()-1; i>=0; i--)
		{
			S = S + S1.charAt(i);
		}
		System.out.println("Reverse Of String : "+ S);
		if(S1.equalsIgnoreCase(S))
		{
			System.out.println("It's a Palindrome String");
		}
		else
		{
			System.out.println("It's Not a Palindrome String");
		}
	}
}
