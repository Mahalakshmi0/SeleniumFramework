package com.javaString;

public class Count_words 
{
	public static void main(String[] args)
	{
		int i=0;
		String s = "java programming";
		String w[] = s.split(" ");
		
		int count = 0;
		for(String word : w)
		{
			for(int i1=0;i1<=word.length();i1++)
			{
				count++;
				System.out.println(count);
		          
			}
			
          
		}
		
		
		
	}

}