package com.javaString;

import java.util.StringTokenizer;

import java.util.*;

public class String_token
{
public static void main(String[] args)
{
	
	String name = "my name is maha kumarr";
	StringTokenizer st = new StringTokenizer(name);
	
	System.out.println(st.countTokens());
	System.out.println(st.hasMoreTokens());
	System.out.println(st.nextToken());
}
}