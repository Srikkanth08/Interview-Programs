package Zeal_To_Learn;

import java.util.Scanner;

public class Sorting_Ascend_Descend_Order_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Enter The Size Of an Array-----");
		int size = sc.nextInt();
		System.out.println("-----Enter The Data-----");
		int a[] = new int[size];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		//For Comparing and Swapping
		int temp;
		for(int j=0; j<a.length; j++)
		{
			for(int k=0; k<a.length-1; k++)
			{
				if(a[k]>a[k+1])
				{
					temp = a[k];
					a[k] = a[k+1];
					a[k+1] = temp;
				}
			}
		}
		
		//For Printing Of Sorted Array in Ascending Order
		for(int m=0; m<a.length; m++)
		{
			System.out.println("a["+m+"]="+a[m]);
		}
		
	}
}
