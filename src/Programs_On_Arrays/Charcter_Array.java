package Programs_On_Arrays;

import java.util.Arrays;

public class Charcter_Array 
{
	public static void main(String[] args) 
	{
	char ch[] = {'S','r','i','k','a','n','t','h'};
	System.out.println("Printing of character Array: "+Arrays.toString(ch));
	
	for(int i=0; i<ch.length; i++)
	{
		System.out.print(ch[i]);
	}
	System.out.println();
	System.out.println("Printing of character Array in Reverse Order: ");
	
	for(int j=ch.length-1; j>=0; j--)
	{
		System.out.print(ch[j]);
	}
	}
}
