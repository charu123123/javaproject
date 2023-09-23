package Inheritance;
class Animalsupermethod {
void eat() {System.out.println("eating..");}
}
class Dog5 extends Animalsupermethod{
	void eat() {System.out.println("eating bread");}
	void bark() {System.out.println("barking");}
	void work()
	{
		super.eat();
		bark();
	}
	}
class TestSuper2{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog5 d=new Dog5();
d.work();
d.eat();
	}
}
