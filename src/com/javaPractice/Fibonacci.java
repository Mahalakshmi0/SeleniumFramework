package com.javaPractice;
import java.util.*;

public class Fibonacci 
{

	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Fibo(a);
		
	}

	public static void Fibo(int a)
	{
		int first =0 ,second =1 , next=0;
		
		for(int i=1;i<=a ;i++)
		{
			System.out.println(first);
			next = first +second;
			first = second;
			second = next;
			
		}
	}
}



