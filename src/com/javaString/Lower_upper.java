package com.javaString;
import java.util.*;

public class Lower_upper
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		
		StringBuffer sb = new StringBuffer(s);
		for(int i=0;i<s.length();i++)
		{
		char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				 s.replace(ch , Character.toUpperCase(ch));
			}
			else 
			{
				 s.replace(ch , Character.toLowerCase(ch));	
			}
		}
		System.out.println(s);
	}
}
