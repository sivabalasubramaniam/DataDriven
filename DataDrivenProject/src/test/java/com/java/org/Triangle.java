package com.java.org;

public class Triangle 
{
	public static void star() 
	{
		for (int i = 1; i < 10; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
			System.out.print("*");	
			}
			System.out.println();
		}

	}
	public static void doubleStar() 
	{
		for (int i = 1; i < 10; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				if (i%2==0) 
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void reverseStar() 
	{
		int n=10;
		for (int i = 1; i < n; i++) 
		{
			for (int j = n-1; j >=i; j--) 
			{
			System.out.print("*");	
			}
			System.out.println();
		}

	}
	
	
	
	
	public static void main(String[] args) 
	{
		star();
		doubleStar();
		reverseStar();
		
	}

}
