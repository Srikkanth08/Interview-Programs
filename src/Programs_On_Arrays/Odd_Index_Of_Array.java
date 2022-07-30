package Programs_On_Arrays;

public class Odd_Index_Of_Array 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<a.length; i=i+2)
		{
			System.out.println("Odd Index Value is: "+a[i]);
		}
	}
}
