package Arrays_Programs_Practice;

public class Changing_of_words_String 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to TestYantra Hyderabad";
		String [] split = s.split(" ");
		
		String temp = split[0];
		split[0] = split[split.length-1];
		split[split.length-1] = temp;
		
		for(int i=0; i<s.length ; i++)
		{
			System.out.println(s[i]);
		}
		
	}
}
