package com.javaPractice;

public class Over_Riding
{
  int getinterest()
  {
	  return 0;
  }
}

class SBI extends Over_Riding
{
	int getinterest()
	{
		int i =8;
		return i;
	}
}

class Canara extends Over_Riding
{
	int getinterest()
	{
		int r =10;
		return r;
	}
}
class Test
{
public static void main(String[] args)
{
	SBI s = new SBI();
	System.out.println(s.getinterest());
	
	Canara c = new Canara();
	System.out.println(c.getinterest());
}
}