package Programs_On_Arrays;

public class Min_Number_Of_An_Array 
{
	public static void min(int arr[])
	{
		int min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Min. Number is: "+min);
	}
	public static void main(String args[])
	{
		int a[] = {116, 250, 700, 1000, 550};
		min(a);
	}
}
