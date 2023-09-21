package Inheritance;

 class Animal3 {
void eat() {System.out.println("eating..");}

void bark()  {System.out.println("barking");}

 }
 class Dog3 extends Animal3{
	 
 }
 class Cat extends Animal3{
	 void meow() {System.out.println("meowing..");}
 }
 class TestInheritance3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c=new Cat();
c.meow();
c.eat();
c.bark();
	}

}
