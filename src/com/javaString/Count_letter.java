package com.javaString;

public class Count_letter 
{

	public static void main(String[] args)
	{
		String s = "Java Program";
		int full_len = s.length();
		
		int length  = s.replace("a" , "").length();
		
		
		System.out.println(full_len - length);
		
	}
}
