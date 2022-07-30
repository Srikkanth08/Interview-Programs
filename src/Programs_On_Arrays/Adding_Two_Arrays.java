package Programs_On_Arrays;

public class Adding_Two_Arrays 
{
	public static void main(String[] args) 
	{
		int a[] = {7,8,5,16,13};
		int b[] = {3,9,15,11};
		int length =a.length;
		if(a.length<b.length)
		{
			length = b.length;
		}
		
		for(int i=0; i<length; i++)
		{
			try 
			{
				System.out.print(a[i]+b[i]+" ");
			} 
			catch (Exception e) 
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(b[i]);
				}
			}
		}
	}
}
