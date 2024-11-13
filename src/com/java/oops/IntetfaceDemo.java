package com.java.oops;

interface  Shape{
	int length=10;
	int width=20;
	void cricle();//abstract method 
	  default void sqaure() {
		System.out.println("this square is defalute method");
	}
	  static void rectangle() {
		  System.out.println("this rectangle is static method");
	  }
	  
}

public class IntetfaceDemo implements Shape{
	@Override
	public void cricle() {
		System.out.println("this circle is abstact implemented method");
		
	}

	public static void main(String[] args) {
		//1st way
		IntetfaceDemo idobj=new IntetfaceDemo();
		idobj.cricle();
		idobj.sqaure();
		Shape.rectangle();//static methods can access interface
		//2nd way
		Shape s=new IntetfaceDemo();
		s.cricle();
		s.sqaure();
		Shape.rectangle();//static methods can access interface
		System.out.println(Shape.length*Shape.width);//static variable


	}

	

}
