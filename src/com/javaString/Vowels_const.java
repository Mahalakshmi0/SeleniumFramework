package com.javaString;

public class Vowels_const
{

	public static void main(String[] args)
	{
		String s ="apple banana";
		int v_count=0, c_count=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				v_count++;
			}
			else if(s.charAt(i)>'a' && s.charAt(i)<'z')
			{
				c_count++;
			}
		}
		System.out.println("number of vowels "+v_count);
		System.out.println("number of consonants " +c_count);
	}
}
