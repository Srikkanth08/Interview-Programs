package Programs_On_Arrays;

public class Second_Lowest_NumberOfAnArray 
{
	public static void Sec_Min(int arr[])
	{
		int min = arr[0],secmin=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				secmin = min;
				min = arr[i];
			}
			else if(arr[i]<secmin)
			{
				secmin=arr[i];
			}
		}

		System.out.println("Min. Number is: "+min);
		System.out.println("Second Min. Number is: "+secmin);
	}
	public static void main(String args[])
	{
		int a[] = {250, 700, 1000, 550, 116};
		Sec_Min(a);
	}
}
