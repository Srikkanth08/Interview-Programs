package Programs_On_Strings;

public class Reverse_Each_Word_of_a_String 
{
	public static void main(String[] args) 
	{
		String s="hello java developer";
		String s2[]=s.split(" ");
	    for(int i=0;i<s2.length;i++)
	    {
	    	char ch[]=s2[i].toCharArray();
	    	for(int j=ch.length-1;j>=0;j--)
	    	{
	    		System.out.print(ch[j]);
	    	}
	    	System.out.print(" ");
	    }
	}
}
