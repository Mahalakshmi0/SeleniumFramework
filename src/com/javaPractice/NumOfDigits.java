package com.javaPractice;
import java.util.*;
public class NumOfDigits 

{
 public static void main(String[] args)
 {
	 System.out.println("enter a number");
	 Scanner sc = new Scanner(System.in);
	 int  a = sc.nextInt();
	 int d =0;
	 if(a<0)
	 {
		a = a*-1;
		 System.out.println("negative number" +a);
	 }
	 
	 else if(a == 0)
	 {
		 System.out.println("number =0");
	 }
	 
	 while( a > 0)
	 {
		 a=a/10;
		d++;
     }
	 System.out.println("number of digits "+ d);
 }
}
