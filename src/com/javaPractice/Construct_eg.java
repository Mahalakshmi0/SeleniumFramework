package com.javaPractice;

class Construct_eg
	{
		String name;
		int id;
		int maths, phy, chem;
		
		public Construct_eg(String n , int i)
		{
			name = n;
			id = i;
		}
		public Construct_eg(int m , int p , int c)
		{
			maths = m;
			phy =p;
			chem =c;
			System.out.println("default consructor");
		}
		void display()
		{
			System.out.println(name+" "+id);
			System.out.println(maths+" "+phy+" "+chem);
		}
		
	
		public static void main(String[] args)
		{
			Construct_eg s = new Construct_eg("maha" , 123 );
			s.display();
			 
			Construct_eg s1 = new Construct_eg(90, 91 , 91);
			s1.display();
		}
	}

	