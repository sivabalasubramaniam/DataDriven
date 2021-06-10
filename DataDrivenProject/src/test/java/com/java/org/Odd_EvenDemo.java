package com.java.org;

public class Odd_EvenDemo 
{
public static void evenNum() 
{
	int sum=0,count=0;
	for (int i = 0; i < 30; i++) 
	{
	if (i%2==0) 
	{
	System.out.println(i+",");
	sum=sum+i;
	count=count+1;
	
	
	}	
	}
	System.out.println("sum of even ="+sum);
	System.out.println("count of even="+count);
}



public static void oddNum() 
{
	int sum=0,count=0;
	for (int i = 0; i < 30; i++) 
	{
	if (i%2==1) 
	{
	System.out.println(i+",");
	sum=sum+i;
	count=count+1;
	
	
	}	
	}
	System.out.println("sum of odd="+sum);
	System.out.println("count of odd="+count);
	
}
	public static void main(String[] args) 
	{
oddNum();
evenNum();
	}

}
