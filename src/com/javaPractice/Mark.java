package com.javaPractice;

public class Mark
{
	public void dog()
	{
		System.out.println("bow bow ");
	}

}

class sub_mark extends Mark
{
	public void cat()
	{
		System.out.println("m ");
	}

}
class Marksheet extends sub_mark
{
	public void monkey()
	{
		System.out.println("m m m ");
	}


public static void main(String[] args)
{
	Marksheet in = new Marksheet();
	in.dog();
	in.cat();
	in.monkey();

}

}
