package assignment2;
import java.util.*;
public class InterfaceShape {

	public static void main(String[] args) {
		
		
		interface Shape
		{
		void area();
		}
		class Circle implements Shape
		{
		final float PI=3.14f;
		float ac,r;
		Scanner s=new Scanner(System.in);
		void accept()
		{
		System.out.println("Enter the Radius ");
		r=s.nextFloat();
		}
		public void area()
		{
		ac=PI*r*r;
		}
		public void show()
		{
		System.out.println("Area of circle is :"+ac);
		}

		}
		class Sphere implements Shape
		{
		final float PI=3.14f;
		float as,r;
		Scanner s=new Scanner(System.in);
		void accept()
		{
		System.out.println("Enter the Radius ");
		r=s.nextFloat();
		}
		public void area()
		{
		as=4*PI*r*r;
		}
		public void show()
		{
		System.out.println("Area of Sphere is :"+as);
		}
		}
		class Slip22
		{
		public static void main(String args[])
		{
		Circle s1=new Circle();
		Sphere s2=new Sphere();
		s1.accept();
		s1.area();
		s2.accept();
		s2.area();
		s1.show();
		s2.show();
		}
		}

	}

}
