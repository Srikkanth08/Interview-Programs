package Programs_On_Arrays;

public class Second_Highest_NumberOfAnArray 
{
	public static void Sec_Max(int arr[])
	{
		int max = arr[0],secmax = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				secmax = max;
				max = arr[i];
			}
			else if(arr[i]>secmax)
			{
				secmax = arr[i];
			}
		}
		System.out.println("Max. Number is : "+max);
		System.out.println("Second Max. Number is: "+secmax);
	}
	public static void main(String args[])
	{
		int a[] = {116, 250, 700, 1000, 550};
		Sec_Max(a);
	}
}
