package com.javaPractice;


interface A
{
	void run();
}

interface B extends A
{
	void run1();
}


class Inter implements B
{
	public void run(int a , int b)
	{
		
		int total = a+b;
		System.out.println("total = " +total);
	    
	}
	
	public void run1(int a , int b)
	{
		int diff = a - b;
		System.out.println("difference = "+diff);
	}
	
	public static void main(String[] args)
	{
	  Inter i = new Inter();
		i.run(2 , 3 );
		i.run1(10, 8);
	}
}