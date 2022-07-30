package Programs_On_Strings;

public class Character_Occurance_Or_Count 
{
	  //By Using toCharArray()
  /*	public static void main(String args[])
	{
		String S = "Srikanth";
		int count = 0;
		for(char ch : S.toCharArray())
		{
			if(ch == 'h')
			{
			  count++;
			}
		}
		System.out.println(count);
	}  */
	
  /*	public static void getCharOccurance(String Str, char val)
	{
		
		int count = 0 ;
		for(char ch : Str.toCharArray())
		{
			if(ch == val)
			{
				count++;
			}
		}
		System.out.println(val +":"+count);
	}
	
	public static void main(String args[])
	{
		String Str = "Srikanth";
		getCharOccurance(Str, 'i');
	}   */
	
	public static void main(String args[])
	{
		String Str = "Srikanth";
		int count = 0;
		for(int i=0; i<Str.length(); i++)
		{
			if(Str.charAt(i)=='S') 
			{
				count++;
			}
		}
		System.out.println("Count of S character in String is : "+count);
	}
	
	
}
