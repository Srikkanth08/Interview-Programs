package Zeal_To_Learn;

public class ArraysDemoProgram_Practice 
{
	public static void main(String[] args) 
	{
		int a[] = new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
//		System.out.println(a[3]);      //java.lang.ArrayIndexOutOfBoundsException
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
//		a[3] = 40;  //java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
/*		System.out.println(a[3]);      //java.lang.ArrayIndexOutOfBoundsException
 *      System.out.println(a[-1]);     //java.lang.ArrayIndexOutOfBoundsException
 */
		System.out.println(a[-0]);   //10    
        
		System.out.println(a.length);
//		int len = a.length;
//		System.out.println("The Length Of an Array is :" +len);
		
		String s[] = {"Dhoni", "Kohli", "Jadeja", "Sehwag"};
		System.out.println(s[0]+"\n"+s[1]+"\n"+s[2]+"\n"+s[3]);
		
		System.out.println("-----Printing of Array Elements Using for Loop-----");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("-----Printing of Array Elements Using for-Each Loop (or) Enhanced Loop");
		for(String str:s)
		{
			System.out.println(str);
		}
		
	}
}
