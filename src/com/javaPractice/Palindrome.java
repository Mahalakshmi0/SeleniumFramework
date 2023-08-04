package com.javaPractice;
import java.util.*;

public class Palindrome 
{

	int palin(int n)
	{
		int rem,rev=0;
		do
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		while(n!=0);
		
		return rev;
	}
    
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
	    
		int k;
		Palindrome p = new Palindrome();
		k=p.palin(n);
		if(k==n)
		{
			System.out.println("It's a palindrome number");
		}
		else 
		{
			System.out.println("It's not a palindrome number");
			
		}
		
	}
	
}


