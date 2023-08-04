package com.javaPractice;
import java.util.*;

public class Prime 
{
	
	static int Primecheck(int a )
	{
		int c=0;
		int f =0;
		for(int i= 1 ;i<= a ;i++)
		{
			if(a%i==0)
			{
				c = c+1;
				
			}
		}
		if(c==2)
		{
		f=1;
		}
		return f;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		
		Prime p = new Prime();
		int k=p.Primecheck(a);
		
		if(k==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("non prime");
		}
	}
	
}

