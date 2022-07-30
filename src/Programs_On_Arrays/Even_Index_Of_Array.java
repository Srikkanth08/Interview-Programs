package Programs_On_Arrays;

public class Even_Index_Of_Array 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=1; i<a.length; i=i+2)
	     {
			System.out.println("Even Index Of An Array: "+a[i]);
	     }
	}
	
}
