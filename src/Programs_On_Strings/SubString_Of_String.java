package Programs_On_Strings;

public class SubString_Of_String 
{
	public static void main(String args[])
	{
		String S = "Java Development";
		String S1 = S.substring(2, 9);  //include start from 2nd index and exclude 9th index
		System.out.println(S1);
		
		String S2 = S.substring(3);  //index start from 0 and here index is 3 there is no exclude so, it print from 3rd to end
		System.out.println(S2);
	}
}
