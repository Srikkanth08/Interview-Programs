package Programs_On_Strings;

public class Sentence_Reverse_Of_String 
{
	public static void main(String[] args) 
	{
		String s = "Hyderabad Test Yantra";
		String []s1 = s.split(" ");
		String rev ="";
		for(int i=s1.length-1; i>=0 ; i--)
		{
			rev = rev +" " + s1[i];
		}
		System.out.println(rev);
	}
}
