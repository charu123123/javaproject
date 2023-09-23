package Inheritance;
 class Animal4super {
String colour="White";
 }
 class Dog4 extends Animal4super{
	String colour="black";
	 void printcolour() {
 System.out.println(colour);
 System.out.println(super.colour);
	
		// TODO Auto-generated method stub

	}

}
class TestSuper1{
	public static void main(String[]args) {
		Dog4 d=new Dog4();
		d.printcolour();
	}
}