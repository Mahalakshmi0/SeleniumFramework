package com.javaPractice;
import java.util.*;

public class Sumofseries 
{

	int series(int n)
	{
		int s=0;
		for(int i=0;i<n;i++)
		{
			s = s+(i*(i+1));
			
		}
		return s;
				
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		
		Sumofseries p = new Sumofseries();
		int sum = p.series(n);
		
		System.out.println("sum of series :"+sum);
				
	}
	
}
