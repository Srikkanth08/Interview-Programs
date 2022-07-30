package Zeal_To_Learn;

import java.util.Scanner;

public class ArraysDemo1Program_Practice 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of an Array");
		int size = sc.nextInt();
		
		int a[] = new int[size];   //An Array Gets Created with entered size 
		
		//For Accepting input
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array Elements Are: ");
		
		//For Retrieving Values
		for(int j=0; j<a.length; j++)
		{
			System.out.println(a[j]);
		}
		
		System.out.println("Print The 1st Element: "+a[0]);
		System.out.println("Print The Last Element: "+a[a.length-1]);
		
		System.out.println("-----Reverse Of an Array-----");
		for(int j=a.length-1; j>=0; j--)
		{
			System.out.println("a["+j+"] :"+a[j]);
		}
	}
}
