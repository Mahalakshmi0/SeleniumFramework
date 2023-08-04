package com.javaPractice;

abstract class Shape_Abstract
{
abstract void shapes();
}

class Circle extends Shape_Abstract
{
void shapes()
{
	System.out.println("shape of circle");
}
	
}

class Rectangle extends Shape_Abstract
{
	void shapes()
	{
		System.out.println("shape of rectangle");
	}
}


class TestAbstract
{
	public static void main(String[] args)
	{
		Shape_Abstract sb  = new Circle();
		sb.shapes();
		Shape_Abstract sb1 = new Rectangle();
		sb1.shapes();
	}
}

