package com.javaString;
import java.util.*;

class Rverese
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ch ="";
		for (int i = s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)==0)
			{
//				String lower = s.toUpperCase();
				System.out.println();
			}
			ch=ch+s.charAt(i);
		}
		System.out.println(ch);
	}
}


