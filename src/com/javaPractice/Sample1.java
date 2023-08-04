package com.javaPractice;

public class Sample1
{
int side;
int length;
double breadth;

public void cons(int a , int l, double b)
 {
   side = a;
   length = l;
   breadth = b;
 }
 
public void square(int a)
 {
	 int s_area = 4*a;
	 System.out.println("area of square :"+s_area );
 }

 public void rectangle(int l , double b)
 {
	 double r_area = 2*(l+b);
	 System.out.println("area of rectangle :"+r_area);
	 
 }
 
 
 public static void main(String[] args)
 {
	 Sample1 s = new Sample1();
	 s.cons(20,30,33.3);
	 s.square(20);
	 s.rectangle(30, 33.3);	
	 
	 Sample1 s1 = new Sample1();
	 s1.cons(40, 20, 20.5);
	 s1.square(40);
	 s1.rectangle(20, 20.5);
	 
 }
	
}
