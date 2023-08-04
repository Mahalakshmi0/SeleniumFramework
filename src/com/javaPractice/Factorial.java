package com.javaPractice;
import java.util.*;

public class Factorial
{
	
	
	public static void Fact(int a )
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f = f*i;
		}
			System.out.println("factorial of a number = "+f);
		
	}
	public static void main(String[] args)
	{
		System.out.println("enter a digit");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Fact(a);
	}

}
