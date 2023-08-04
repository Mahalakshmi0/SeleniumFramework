package com.javaString;

final class Immutable 
{
	final int roll;
	final String name;
	
	Immutable(int r , String n)
	{
		roll = r;
		name = n;
	}
	
	public String toString()
	{
		return roll +" "+ name;
	}
	public static void main(String[] args)
	{
		Immutable im1 = new Immutable(111, "aaa");
		Immutable im2 = new Immutable(222 , "bbb");
		
		System.out.println(im1);
		System.out.println(im2);
	}
}