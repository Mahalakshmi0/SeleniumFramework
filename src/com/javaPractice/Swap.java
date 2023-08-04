package com.javaPractice;
import java.util.*;

public class Swap

{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number");
	int a = sc.nextInt();
	System.out.println("enter the second number");
	int b = sc.nextInt();
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	System.out.println("first = " +a);
	System.out.println("second = "+b);
}
}


