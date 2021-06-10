package com.java.org;

public class ReverseStringDemo 
{
public static void reverseWord() 
{
String normal="welcome";
String reverse=" ";
	for (int i = normal.length()-1; i >=0; i--) 
{
	reverse=reverse+normal.charAt(i);
}
	System.out.println("reverse of word="+reverse);
}
public static void reverseOfEachWordInString() 
{
	String normal="welcome to java";
	String[] splt=normal.split(" ");
	String reverseString="";
	for (String x : splt) 
	{
	String reverseWord="";
	for (int i =  x.length()-1; i >=0; i--) 
	{
	reverseWord=reverseWord+x.charAt(i);	
	}
	reverseString=reverseString+reverseWord+" ";
	}
	System.out.println("original string="+normal);
	System.out.println("reverse string="+reverseString);
}
	public static void main(String[] args) {
		
reverseOfEachWordInString();
reverseWord();
	}

}
