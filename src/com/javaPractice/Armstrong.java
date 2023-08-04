package com.javaPractice;
import java.util.*;

public class Armstrong {

	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int  a= sc.nextInt();
		
		Arms(a);
	}

	public static void Arms(int a) 
	{
		int d , rev=0, arm=0;
		int num =0;
	    a = num;
		while(num>0)
		{
		d = num%10;
		num = num/10;
		arm = arm+d*d*d;
		}
		
		if(num == a )
		{
			System.out.println("armstrong number");
			
		}
		else
		{
			System.out.println("not an armstrong");
		}
		
	}
}
