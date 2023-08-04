package com.javaPractice;

class Construct_example
{
	String name;
	int id;
	
//	Construct_example(String n , int i)
//	{
//		name =n;
//		id =i;
//	}
	
	void display()
	{
		System.out.println("name of the student and id "+name+" " +id);
	}
	
	public static void main(String[] args)
	{
		Construct_example ce = new Construct_example();
		ce.display();
		
	}
	
}