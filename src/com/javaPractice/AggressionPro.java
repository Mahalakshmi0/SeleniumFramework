package com.javaPractice;
//
//public class AggressionPro
//{
//  
//	int square(int n)
//	{
//		return n*n;
//	}
//	
//}
//class Circle 
//{
//	AggressionPro op;
//    double pi = 3.14;
//    
//	   double  area(int radius)
//	{
//       op = new AggressionPro();
//       int sq = op.square(radius);
//	   return pi*sq;
//	}
//
//public static void main(String[] args)
//{
//	Circle c = new Circle();
//	double result = c.area(5);
//	System.out.println(result);
//}
//}



class AggressionPro{  
 int square(int n){  
  return n*n;  
 }  
}  
  
class Circle{  
 AggressionPro op;//aggregation  
 double pi=3.14;  
    
 double area(int radius){  
   op=new AggressionPro();  
   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
   return pi*rsquare;  
 }  
  
     
    
 public static void main(String args[]){  
   Circle c=new Circle();  
   double result=c.area(5);  
   System.out.println(result);  
 }  
}  


