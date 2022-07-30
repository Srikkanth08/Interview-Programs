package Programs_On_Arrays;

public class Max_Number_Of_An_Array 
{
	//creating User Define Method With Array as args
	public static void max(int arr[])
	{
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max. Number is: "+ max);
	}
	public static void main(String args[])
	{
		int a[] = {116, 250, 700, 1000,500 };
		max(a);
	}
}
