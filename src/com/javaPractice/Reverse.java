package com.javaPractice;
import java.util.*;

public class Reverse
{
	
	
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		
		Rever(a);
		
	}
	public  static void Rever(int a ) 
	{
		int d , rev =0 , num=0;
		 
		a =  num;
	 while(a>0)
	 {
		 d=a%10;
		 rev = rev*10+d;
		 a = a/10;
	 }
	 
	 if (a == num)
	 {
	 System.out.println("palindrome");
	}
	 
	 else
	 {
		 System.out.println("ordinary number");
	 }
	
	
}

}



