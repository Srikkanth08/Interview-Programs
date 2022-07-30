package String_Program_Practice;

public class LowerCase_Vowels_Count 
{
	public static void main(String[] args) 
	{
		String s = "rIch DAD And pOOr daD";
		int count = 0;
		
	for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				System.out.println(s.charAt(i));
				count++;
			}
		}
		System.out.println("Count Of LowerCase Vowels In A String : "+ count);
		
	/*	for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				System.out.println(s.charAt(i));
				count++;
			}
		}
		System.out.println("Count Of UpperCase Vowels In A String : "+ count);   */
	}
}
