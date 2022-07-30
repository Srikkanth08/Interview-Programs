package Imp_Questions;

public class Special_Characters_Remove 
{
	public static void main(String[] args) 
	{
		String str = "@!#^&96529SriKanth)(&^*^%Kohli%%%^#$#";
//		String str1 = "";
		String S = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After Removing All Special Characters: "+S);
//		str1 = str1+S;
//		System.out.println(str1);
		
		String S1 = str.replaceAll("[0-9]", "");
		System.out.println("After Removing All The Numbers: "+S1);
		
		String S2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("After Removing All Alphabets: "+S2);
	}
}
