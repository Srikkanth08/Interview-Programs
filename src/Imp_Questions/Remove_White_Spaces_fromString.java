package Imp_Questions;

public class Remove_White_Spaces_fromString 
{
	public static void main(String[] args) 
	{
		String str = "I       am An Indian";
		System.out.println("Before Removing All The White Spaces: " + str);
		String S = str.replaceAll(" ", "");
		System.out.println("After Removing All The White Spaces: " + S);
	}
}
