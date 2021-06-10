package com.java.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RepeatedWordDemo 
{
	public static void repeateChar() 
	{
		String s="welcome god";
		char[] chr=s.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for (char c : chr)
		{
			if (charMap.containsKey(c)) 
			{
				Integer ingr = charMap.get(c);
				charMap.put(c, ingr+1);
				
			} 
			else 
			{
				charMap.put(c, 1);
			}
			
		}
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.println("list of dup char");
		for (Entry<Character, Integer> entry : entrySet) 
		{
		if (entry.getValue()>1) 
		{
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"="+value);
			
		}	
		}
	}
	public static void repeateWord() 
	{
		String s="welcome to java to java to java in greens in greens";
		String[] words = s.split(" ");
		Map<String, Integer> wordMap=new TreeMap<String, Integer>();
		for (String string : words) 
		{
			if (wordMap.containsKey(string)) 
			{
				Integer it = wordMap.get(string);
				wordMap.put(string, it+1);
				
			} else 
			{
				wordMap.put(string, 1);

			}
			
		}
			System.out.println("list of dup words");
			Set<Entry<String,Integer>> entrySet = wordMap.entrySet();
			for (Entry<String, Integer> entry : entrySet) 
			{
			if (entry.getValue()>1) 
			{
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+"="+ value);
				}	
	}
}
	public static void main(String[] args) {
repeateChar();
repeateWord();
	}

}
