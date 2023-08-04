package com.javaPractice;
import com.javaPractice.Main;

public class Area extends Main
{
int length;
double breadth;
int side;


public static int square(int side)
{
int s_area = side*side;
return s_area;
}

public static double rect(int length, double breadth)
{
double r_area=length*breadth;
return r_area;
//System.out.println("area of rectangle"+r_area);
}

}