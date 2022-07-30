package Programs_On_Strings;

import java.util.Arrays;

public class Anagram_String 
{
	/* Anagram: Two strings are said to be anagrams if they make a meaningful word by
	                 rearranging or shuffling the letters of the string  */
	
/*	public static boolean Anagram(String S1, String S2)
	{
		String Str1 = S1.replaceAll("\\s+", "");     // "\\s"--->means it will remove 1 character empty space
		String Str2 = S2.replaceAll("\\s+", "");     // "\\s+"--->means it will remove 1 or More characters empty space
		
		if(Str1.length() != Str2.length())
		{
			return false;
		}
		else
		{
			char C1[] = Str1.toLowerCase().toCharArray();
			char C2[] = Str2.toLowerCase().toCharArray();
			
			Arrays.sort(C1);
			Arrays.sort(C2);
			
			return Arrays.equals(C1, C2);
		}
	}
	
	public static void main(String args[])
	{
		System.out.println(Anagram("Earth", "Heart"));
		System.out.println(Anagram("kanth", "Srikanth"));
		System.out.println(Anagram("Listen", "Silentt"));
		System.out.println(Anagram("Rat", "Art"));
	}   */
	
	
	public static void main(String[] args) {
		String s="earthZyx";
		String s2="heartabc";
		char[] s3=s.toCharArray();
		char[] s4=s2.toCharArray();
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		System.out.println(s3);
		System.out.println(s4);
		
		if(Arrays.equals(s3, s4)==true)
		{
			System.out.println("anagrams");
		}
		else
		{
			System.out.println("not anagrams");
		}
		
	}
}
