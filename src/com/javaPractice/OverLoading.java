package com.javaPractice;

public class OverLoading
{
 int area (int l , int b)
 {
	 return l*b;
 }
 
 double area(int r )
 {
	 return 3.14*r*r;
 }

public static void main(String[] args)
{
	OverLoading ov = new OverLoading();
	
	System.out.println("area of a square"+ov.area(3,5));
	System.out.println("area of a circle"+ov.area(7));
}

}
