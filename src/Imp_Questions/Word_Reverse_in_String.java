package Imp_Questions;

public class Word_Reverse_in_String 
{
	public static void main(String[] args) 
	{
		String str = "India is My Country";
//		String str1 = "";
		String a[] = str.split(" ");
		
		System.out.println("The Given String is: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n"+"The Reverse Of a String is: ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
//		for(int i=a.length-1; i>=0; i--)
//		{
//			str1 = str1+a[i]+" ";
//		}
//		System.out.println(str1);
		
	}
}
