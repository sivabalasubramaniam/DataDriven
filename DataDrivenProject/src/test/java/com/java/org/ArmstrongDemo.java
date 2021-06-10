10package com.java.org;

import java.util.Scanner;

public class ArmstrongDemo {

	public static void checkNumber() 
	{
		int n,a,i=0,j=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		n=input.nextInt();
		a=n;
		while(a>0) {
			
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if (n==j) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}
	public static void countAndPrint() {

		int c=0;
		for (int n = 0; n <1000; n++) {
			int a,i,j=0;
			a=n;
			while(a>0) {
				i=a%10;
				j=j+(i*i*i);
				a=a/10;	
			}
			if (j==n) {
				System.out.println("Armstrong number is:"+j);
				c++;
			}
		}
		System.out.println("not armstrong number is:"+c);
	}
	public static void main(String[] args) {
checkNumber();
countAndPrint();
	}

}
