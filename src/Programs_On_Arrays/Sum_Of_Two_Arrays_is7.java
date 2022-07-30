package Programs_On_Arrays;

public class Sum_Of_Two_Arrays_is7 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=1; i<a.length; i++)
		{
			for(int j=1; j<a.length; j++)
			{
				if(a[i] + a[j] == 7 )
				{
					System.out.println(a[i]+"+"+a[j]+"=7");
				}
				else if(a[i] - a[j] == 7)
				{
					System.out.println(a[i]+"-"+a[j]+"=7");
				}
			}
		}
	}
}
