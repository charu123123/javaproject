package assignment2;
import java.util.Scanner;

public class Circle2 {
final float PI=3.14f;
float ac,r;
Scanner s=new Scanner(System.in);
void accept() {
	System.out.println("Enter the Radius");
	r=s.nextFloat();
	
}
public void show() {
	System.out.println("Area of circle is:" + ac);
	
}
public void area() {
	ac=PI*r*r;
}

}
		

	


