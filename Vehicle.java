package Inheritance;
 class Vehicle {
void fast() {System.out.println("Vehicle is running");}
 }
 class Bike2 extends Vehicle{
	 void run() {System.out.println("Bike is running safely");}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike2 obj=new Bike2();
obj.run();
obj.fast();
	}

}
