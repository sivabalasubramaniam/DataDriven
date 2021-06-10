package com.java.org;

public class PalindromeDemo 
{
public static void reverseNum() 
{
	int a,i,j=0;
	int num=12345;
		a=num;
			while (a>0) 
			{
				i=a%10;
				j=(j*10)+i;
				a=a/10;
				
			}
			System.out.println("reverse number is="+j);
	
}
	public static void palindrome() 
	{
		int a,i,j=0;
		int num=12321;
			a=num;
				while (a>0) 
				{
					i=a%10;
					j=(j*10)+i;
					a=a/10;
				}
				if (num==j) 
				{
					System.out.println("given number is palindrome");
					
				}
				else {
					System.out.println("given number is not palindrome");	
				}
	}
	
	public static void palindromeOfRange() 
	{
		int c=0;
		System.out.println("palindrome number frome 1 to 30");
		for (int n = 1; n < 30; n++) 
		{
			int a,i,j=0;
			a=n;
			while (a>0) 
			{
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if (n==j) 
			{
			System.out.println(j+", ");
			c++;
			}
		}
		System.out.println("\n count of palindrome numbers="+c);
	}
	public static void main(String[] args) 
	{
		reverseNum();
		palindrome();
		palindromeOfRange();

	}

}
