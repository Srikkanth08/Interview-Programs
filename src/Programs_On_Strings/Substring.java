package Programs_On_Strings;

public class Substring 
{
	public static void main(String[] args) 
	{
		String s = "welcome to india";
		String[] split = s.split(" ");
		String capitalLetter = "";
		for(String str : split)
		{
			String firstLetter = str.substring(0, 1).toUpperCase();
			String remainingLetters = str.substring(1);
			capitalLetter = capitalLetter +firstLetter + remainingLetters;
		}
		System.out.println(capitalLetter);
	}
}
