package com.javaPractice;

public class Over_Loading
{

	public void area(int l , int b)
	{
		int area_sq = l*b;
		System.out.println(area_sq);
	}
	
	public void area(int l , int b , int h)
	{
		int area_rect = l*b*h;
		System.out.println(area_rect);
	}
	
	public void area(double l , double b)
	{
		double area_tr = 0.5*l*b;
		System.out.println(area_tr);
	}
	
	


public static void main(String[] args)
{
	Over_Loading ol = new Over_Loading();
	ol.area(90, 91);
	ol.area(988.0 , 89.99);
	ol.area(10 , 12, 13);
}
}