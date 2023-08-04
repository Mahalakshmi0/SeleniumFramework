package com.javaPractice;

public class Construct
{
int id, chem , maths , phy;
String name;
public Construct(int i , String n)

{
	id =i;
	name =n;
	
}

public Construct(int c , int m , int p)
{
	chem =c;
	maths =m;
	phy = p;
	
}
public void display()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(chem+" "+ maths +" "+phy);
	
}
	
	public static void main(String[] args)
	{
		Construct c = new Construct(123, "maha");
		Construct c1 = new Construct(90, 91, 92);
		c.display();
		c1.display();
		
	}
}
