package Programs_On_Arrays;

public class Occurance_Of_An_Array 
{
	public static void main(String[] args) 
	{
		int a[] = {21, 15, 21, 42, 7, 8, 18, 21, 21, 25};
		int n = 21;
		int count = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		System.out.println(n+" Occures "+ count +" times in a given Array");
	}
}
