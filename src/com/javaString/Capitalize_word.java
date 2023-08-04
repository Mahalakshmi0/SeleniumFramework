package com.javaString;
import org.apache.commons.*;
public class Capitalize_word 
{
private static final String StringBuffer = null;

public static void main(String[] args)
{
	String wordcap;
   String s = "i'm maha kumar";
	String[] word = s.split(" ");
	StringBuffer sb = new StringBuffer();
	
	for (String w : word)
	{ 
		sb.append(" ");
		sb.append(Character.toUpperCase(w.charAt(0)));
	
		sb.append(w.substring(1));
	   
	}
	
	 System.out.println(sb);
}
}
	
	