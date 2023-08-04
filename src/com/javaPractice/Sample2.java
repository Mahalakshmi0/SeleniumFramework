package com.javaPractice;

public class Sample2
{
int side;
int length;
double breadth;

public void cons(int s , int l, double b)
 {
   side = s;
   length = l;
   breadth = b;
 }
 
public int square(int s)
 {
	 int s_area = 4*s;
	return s_area;
 }

 public double rectangle(int l , double b)
 {
	 double r_area = 2+(l*b);
     return r_area;
	 
 }
 
 
 public static void main(String[] args)
 {
	 Sample2 s = new Sample2();
	 s.cons(20,30,33.3);
	int sq = s.square(20);
	
	 
	
	 
	 System.out.println("area of square :"+sq);
	 System.out.println("area of rectangle :"+s.rectangle(20 , 20.5));
 }
	
}
