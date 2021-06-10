package com.java.org;

public class AscendAndDecend 
{
public static void ascendingOrder() 
{
	int temp;
	int a[]= {20,40,10,50,60,70,5};
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = i+1; j < a.length; j++) 
		{
			if (a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	System.out.println("ascending order");
	for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}
	int maxNo=a[a.length-1];
	System.out.println("max number is:"+maxNo);
	int minNo=a[0];
	System.out.println("min number is:"+minNo);
	int thirdMaxNo=a[a.length-3];
	System.out.println(thirdMaxNo);
	int thirdMinNo=a[2];
	System.out.println(thirdMinNo);
	}
	
	public static void decendingOrder() 
	{
		int temp;
		int a[]= {20,40,10,50,60,70,5};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("decending order");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		
		
	}
	public static void main(String[] args) {
ascendingOrder();
decendingOrder();
	}

}
