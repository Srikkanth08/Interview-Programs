package Programs_On_Strings;

public class String_Reverse 
{
	public static void main(String args[])
	{
		
		//Method-1: By Using Char Array
	/*	String S1 = "Test Yantra";
		String S = "";
		for(int i=S1.length()-1; i>=0 ; i--)
		{
			S = S + S1.charAt(i);
		}
		System.out.println("Reverse Of a String is : "+ S);  */
		
		//Method-2: By Using String Buffer Class
	/*	String S1 = "Test Yantra";
		String S = "";
		StringBuffer Sb = new StringBuffer(String.valueOf(S1));
		StringBuffer rev = Sb.reverse();
		System.out.println("Reverse of a String is: "+rev);  */
		
		//Method-3: By Using String Builder Class
		String S1 = "Test Yantra";
		String S = "";
		StringBuilder Stb = new StringBuilder();
		Stb.append(S1);
		StringBuilder rev = Stb.reverse();
		System.out.println("Reverse of a String is: "+rev);
		
		
	}
}
