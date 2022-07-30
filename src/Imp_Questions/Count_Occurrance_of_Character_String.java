package Imp_Questions;

public class Count_Occurrance_of_Character_String 
{
	public static void main(String[] args) 
	{
		String str = "I am   An Indian";
		int Original_Count = str.length();
		int Removed_Count = str.replaceAll("[a,A]", "").length();  //removing all a's from given string 
		
		int Final_Count = Original_Count - Removed_Count;
		System.out.println(Original_Count+" "+Removed_Count);
		System.out.println("Total Occurrance of 'a,A' will be: "+ Final_Count);
	}
}
