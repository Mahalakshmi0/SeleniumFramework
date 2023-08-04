package com.javaPractice;
import java.io.*;
import java.util.*;

public class Anemometer 
{
	 int palin(int num)
	{
		int rem , rev=0;
		do 
		{
		rem = num%10;
		rev = rev*10+rem;
		num=num/10;
		}
		while(num!=0);
			
		return rev;
		
		
	}
public static void main(String[] args)throws IOException
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Anemometer a = new Anemometer();
	int k;
	k=a.palin(n);
	
	if(k==n)
	{
		System.out.println("its a palindrome");
	}
	else
	{
		System.out.println("null");
	}
	
	
}

}